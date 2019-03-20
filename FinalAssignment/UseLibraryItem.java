
public class UseLibraryItem {

	public static void main(String[] args) {
		//create new Book
		Book book1 = new Book("Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company");
		
		//test LibraryItem methods
		book1.reserve("Craig Peterson", 4633033);
		book1.checkOut("Craig Peterson", 4633033);
		book1.checkIn();
		book1.payFines("Craig Peterson", 4633033);
		System.out.println(); //create an empty line in the console
		
		//test Book methods
		System.out.println("Complete Book Info:\n" + book1.toString() + "\n");
		System.out.println("Item Number:    " + book1.getItemNumber());
		System.out.println("Book Title:     " + book1.getTitle());
		System.out.println("Book Author:    " + book1.getAuthor());
		System.out.println("Book Publisher: " + book1.getPublisher());
		System.out.println(); //create an empty line in the console
		
		//create new Magazine
		Magazine magazine1 = new Magazine("Astronomy Monthly", "Pluto No Longer a Planet!", "September 2018");
		
		//test Magazine methods
		System.out.println("Complete Magazine Info:\n" + magazine1.toString() + "\n");
		System.out.println("Item Number:          " + magazine1.getItemNumber());
		System.out.println("Magazine Title:       " + magazine1.getTitle());
		System.out.println("Magazine Cover Story: " + magazine1.getCoverStory());
		System.out.println("Magazine Issue Date:  " + magazine1.getIssueDate());
		System.out.println(); //create an empty line in the console
		
		//create new DVD
		DVD dvd1 = new DVD("2001: A Space Odyssey", "Stanley Kubrick", "Science Fiction", 149);
		
		//test DVD methods
		System.out.println("Complete DVD Info:\n" + dvd1.toString() + "\n");
		System.out.println("Item Number:  " + dvd1.getItemNumber());
		System.out.println("DVD Title:    " + dvd1.getTitle());
		System.out.println("DVD Director: " + dvd1.getDirector());
		System.out.println("DVD Duration: " + dvd1.getDuration());
		System.out.println(); //create an empty line in the console
		
		//create new CD
		//first create an array for the track list
		String [] trackList = { "Natural Mystic",
					"So Much Things to Say",
					"Guiltiness",
					"The Heathen",
					"Exodus",
					"Jamming",
					"Waiting in Vain",
					"Turn Your Lights Down Low",
					"Three Little Birds",
					"One Love/People Get Ready" };
		
		//then instantiate new CD object
		CD cd1 = new CD("Exodus", "Bob Marley and the Wailers", "Island Records", trackList);
		
		//test CD toString method
		System.out.println("Complete CD Info:\n" + cd1.toString() + "\n");
	}
}
