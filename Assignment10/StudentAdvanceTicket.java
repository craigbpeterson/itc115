
public class StudentAdvanceTicket extends AdvanceTicket {

	public StudentAdvanceTicket(int daysUntilEvent) {
		super(daysUntilEvent);
	}

	/* METHODS */
	@Override
	public double getPrice() {
		return super.getPrice() / 2;
	}
  
}
