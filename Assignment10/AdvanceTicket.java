
public class AdvanceTicket extends Ticket {
	/* FIELDS */
	private int daysUntilEvent;
	
	/* CONSTRUCTOR */
	public AdvanceTicket(int daysUntilEvent) {
		super(); //calls Ticket constructor
		this.daysUntilEvent = daysUntilEvent;
	}
	
	/* METHODS */
	@Override
	public double getPrice() {
		if (daysUntilEvent >= 10) {
			return 30.00;
		} else {
			return 40.00;
		}
	}
}
