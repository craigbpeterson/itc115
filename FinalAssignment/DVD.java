
public class DVD extends LibraryItem {
	/* FIELDS */
	private String director;
	private String genre;
	private int duration;
	
	/* CONSTRUCTOR */
	public DVD(String title, String director, String genre, int duration) { //duration should be total minutes
		super(title);
		this.director = director;
		this.genre = genre;
		this.duration = duration;
	}

	/* METHODS */
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDuration() {
		return duration + " minutes";
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() { 
		return "Item Number: " + this.getItemNumber() + " | DVD Title: " + this.getTitle() + " | DVD Genre: " + genre + " | DVD Duration: " + duration + " minutes";
	}
}
