
public class UseTicket {

	public static void main(String[] args) {
		//create a new WalkupTicket
		WalkupTicket wt1 = new WalkupTicket();
		
		//test the getPrice() and toString() methods of the new WalkupTicket
		System.out.println("ticket price: " + wt1.getPrice());
		System.out.println(wt1.toString());
		
		//create an array of tickets
		Ticket[] tickets = {
			new WalkupTicket(), 
			new AdvanceTicket(15), 
			new AdvanceTicket(7),
			new WalkupTicket(),
			new AdvanceTicket(3),
			new StudentAdvanceTicket(3)
		};
		
		//loop through the array to get the ticket type and test the toString() method
		for (int i = 0; i < tickets.length; i++) {
			System.out.println(tickets[i].getClass() + " " + tickets[i].toString());
		}
		
	}

}
