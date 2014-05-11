package home.work.event;

/**
 * Event class for telephone entity
 * 
 * @author satish
 * 
 */
public class TelephoneEvent extends java.util.EventObject {
	/**
	 * serial id generated by Eclipse
	 */
	private static final long serialVersionUID = 974315235593095572L;

	public TelephoneEvent(Telephone source) {
		super(source);
	}
}