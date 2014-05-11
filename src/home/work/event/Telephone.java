package home.work.event;

/**
 * Actual entity which generates events
 * 
 * @author satish
 * 
 */
public class Telephone {
	
	private final int uuid;
	private final String location;

	private final TelephoneEventHandler handler;
	
	public Telephone(TelephoneEventHandler handler) {
		this.uuid = 1234;
		this.location = "dummy";
		this.handler = handler;
	}

	public Telephone(int uuid, String name, TelephoneEventHandler handler) {
		this.uuid = uuid;
		this.location = name;
		this.handler = handler;
	}

	public void ringPhone() {
		handler.fireTelephoneRang(this);
	}

	public void answerPhone() {
		handler.fireTelephoneAnswered(this);
	}

	@Override
	public String toString() {
		return "Telephone " + uuid + " at " + location;
	}
}
