package home.work.event;

import home.work.event.listener.TelephoneListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Event Handler for Telephone which manages all listeners and triggers them
 * based on event Two types of listeners: 1. blocking listeners 2. non -
 * blocking listeners (uses Threading)
 * 
 * @author satish
 * 
 */
public class TelephoneEventHandler {

	private final List<TelephoneListener> telephoneListeners;
	private final List<TelephoneListener> blockingTelephoneListeners;

	public TelephoneEventHandler() {
		telephoneListeners = new ArrayList<>();
		blockingTelephoneListeners = new ArrayList<>();
	}

	/**
	 * Default it is non-blocking listener
	 * 
	 * @param l
	 */
	public synchronized void addTelephoneListener(TelephoneListener l) {
		addTelephoneListener(l, false);
	}

	/**
	 * Method to add listener for all telephone events. blocking boolean decides
	 * whether it will be blocking call or it will a non - blocking listener
	 * call (using Threads)
	 * 
	 * @param l
	 * @param blocking
	 */
	public synchronized void addTelephoneListener(TelephoneListener l,
			boolean blocking) {
		if (blocking == false) {
			if (telephoneListeners.contains(l)) {
				return;
			}
			telephoneListeners.add(l);
		} else {
			if (blockingTelephoneListeners.contains(l)) {
				return;
			}
			blockingTelephoneListeners.add(l);
		}
	}

	public synchronized void removeTelephoneListener(TelephoneListener l) {
		telephoneListeners.remove(l);
		blockingTelephoneListeners.remove(l);
	}

	public void fireTelephoneRang(Telephone telephone) {
		TelephoneEvent event = new TelephoneEvent(telephone);
		triggerRangEvent(event);
		System.out.println("All Telephone Rang listeners trigerred!");
	}


	public void fireTelephoneAnswered(Telephone telephone) {
		TelephoneEvent event = new TelephoneEvent(telephone);
		triggerAnsweredEvents(event);
		System.out.println("All Telephone Answered listeners trigerred!");
	}

	private void triggerRangEvent(final TelephoneEvent event) {
		// , Method method) {

		// Calling non- blocking event listeners
		for (final TelephoneListener listener : telephoneListeners) {
			new Thread() {
				@Override
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					listener.telephoneRang(event);
				};
			}.start();
		}

		// Calling blocking event listeners
		for (TelephoneListener listener : blockingTelephoneListeners) {
			listener.telephoneRang(event);
		}
	}

	private void triggerAnsweredEvents(final TelephoneEvent event) {

		// Calling non- blocking event listeners
		for (final TelephoneListener listener : telephoneListeners) {
			new Thread() {
				@Override
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					listener.telephoneAnswered(event);
				};
			}.start();
		}

		// Calling blocking event listeners
		for (TelephoneListener listener : blockingTelephoneListeners) {
			listener.telephoneAnswered(event);
		}
	}
}
