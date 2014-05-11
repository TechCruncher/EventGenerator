package home.work.event;

import home.work.event.listener.AnsweringMachine;
import home.work.event.listener.Person;

/**
 * Application Man which initializes entity, handler, adds listener and triggers
 * events
 * 
 * @author satish
 * 
 */
public class ApplicationMain {

	public static void main(String[] args) {

		// Init telephone and its handler
		TelephoneEventHandler myTeleHandler = new TelephoneEventHandler();
		Telephone ph = new Telephone(1234, "Hall", myTeleHandler);

		// Creating listeners
		Person bob = new Person();
		AnsweringMachine am = new AnsweringMachine();

		// Adding listeners to handler
		myTeleHandler.addTelephoneListener(am, true); // Answering machine is
														// blocking
		bob.listenToPhone(myTeleHandler, "Bob", false);

		System.out.println("Handling events for " + ph.toString());
		System.out
				.println("============================================================");
		// Triggerring actual events
		ph.ringPhone();
		ph.answerPhone();
		System.out
				.println("============================================================");
	}
}