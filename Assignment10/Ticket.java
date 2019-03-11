
public abstract class Ticket {
	/* FIELDS */
	private static int ticketNumber = 100;
	private int uniqueTicketNumber;
	
	/* CONSTRUCTOR */
	public Ticket() {
		ticketNumber++;
		this.uniqueTicketNumber = ticketNumber;
	}
	
	/* METHODS */
	public int getTicketNumber() {
		return ticketNumber;
	}
	
	public abstract double getPrice(); //this method must be implemented in any subclass
	
	@Override
	public String toString() {
		return "Number: " + uniqueTicketNumber + ", Price: " + getPrice();
	}
}
