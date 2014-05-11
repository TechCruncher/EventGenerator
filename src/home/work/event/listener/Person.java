package home.work.event.listener;

import home.work.event.TelephoneEvent;
import home.work.event.TelephoneEventHandler;

/**
 * Person listener which extends TelephoneAdapter and overrides telephone rang
 * event
 * 
 * @author satish
 * 
 */
public class Person {
	public void listenToPhone(TelephoneEventHandler myTeleHandler,
			final String personName,
			boolean blocking) {
		myTeleHandler.addTelephoneListener(new TelephoneAdapter() {
			@Override
			public void telephoneRang(TelephoneEvent e) {
				System.out.println(personName + ": I'll get it!");
			}
		}, blocking);
	}
}
