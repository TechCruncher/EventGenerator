package home.work.event.listener;

import home.work.event.TelephoneEvent;

/**
 * Sample Listener for Telephone which implements TelephoneListener
 * 
 * @author satish
 * 
 */
public class AnsweringMachine implements TelephoneListener {
	@Override
	public void telephoneRang(TelephoneEvent e) {
		System.out.println("AM hears the phone ringing.");
	}

	@Override
	public void telephoneAnswered(TelephoneEvent e) {
		System.out.println("AM sees that the phone was answered.");
	}
}
