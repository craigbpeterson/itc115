
public abstract class LibraryItem {
	/* FIELDS */
	private static int itemCount = 1000; //constructor will increment this static field with each new LibraryItem instantiation
	private int itemNumber; //this will store a unique number each time a LibraryItem is instantiated
	private String title;
		
	/* CONSTRUCTOR */
	public LibraryItem(String title) {
		itemCount++; //will increment the static variable with each instantiation of this class
		this.itemNumber = itemCount; //set a unique number from the static variable of this class
		this.title = title;
	}
		
	/* METHODS */

	//itemNumber getter
	public int getItemNumber() { 
		return this.itemNumber;
	}
	
	//title setter
	public void setTitle(String title) { 
		this.title = title; 
	}
	
	//title getter
	public String getTitle() { 
		return this.title;
	}
	
	//reserve an item
	public void reserve(String name, int libraryId) { 
		System.out.println(name + " (Library ID: " +  libraryId + ") has reserved " + title + " (Item Number: " + itemNumber + ").");
	}
	
	//check an item in
	public void checkIn() {
		System.out.println(title + " (Item Number: " + itemNumber + ") has been checked back in.");
	}
	
	//check an item out
	public void checkOut(String name, int libraryId) {
		System.out.println(title + " (Item Number: " + itemNumber + ") has been checked out to " + name + " (Library ID: " +  libraryId + ").");
	}
	
	public void payFines(String name, int libraryId) {
		System.out.println(name + " (Library ID: " +  libraryId + ") has paid their late fees and has permission to check out items again.");
	}
	
	@Override 
	public String toString() { //print string representation of this object
		return "Item Number: " + itemNumber + " | Item Title: " + title;
	}
}
