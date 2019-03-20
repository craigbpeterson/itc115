
public class Book extends LibraryItem {
	/* FIELDS */
	private String author;
	private String publisher;
	
	/* CONSTRUCTOR */
	public Book(String title, String author, String publisher) {
		super(title);
		this.author = author;
		this.publisher = publisher;
	}
	
	/* METHODS */
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() { 
		return "Item Number: " + this.getItemNumber() + " | Book Title: " + this.getTitle() + " | Book Author: " + author + " | Book Publisher: " + publisher;
	}
	
}
