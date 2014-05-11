package home.work.event.listener;

import home.work.event.TelephoneEvent;

/**
 * Interface containing all events which listeners will be informed
 * 
 * @author satish
 * 
 */
public interface TelephoneListener extends java.util.EventListener {
	void telephoneRang(TelephoneEvent e);

	void telephoneAnswered(TelephoneEvent e);
}