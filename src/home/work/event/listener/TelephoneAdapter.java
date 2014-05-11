package home.work.event.listener;

import home.work.event.TelephoneEvent;

/**
 * Adapter class which implements TelephoneListener and provides dummy
 * implementation of methods
 * 
 * @author satish
 * 
 */
public class TelephoneAdapter implements TelephoneListener {

	@Override
	public void telephoneRang(TelephoneEvent e) {
		System.out.println("Adapter: Telephone Ranged...!");
	}

	@Override
	public void telephoneAnswered(TelephoneEvent e) {
		System.out.println("Adapter: Telephone Answered...!");
	}
}
