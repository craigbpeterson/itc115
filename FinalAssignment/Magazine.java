
public class Magazine extends LibraryItem {
	/* FIELDS */
	private String coverStory;
	private String issueDate;
	
	/* CONSTRUCTOR */
	public Magazine(String title, String coverStory, String issueDate) {
		super(title);
		this.coverStory = coverStory;
		this.issueDate = issueDate;
	}
	
	/* METHODS */
	public String getCoverStory() {
		return coverStory;
	}

	public void setCoverStory(String coverStory) {
		this.coverStory = coverStory;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	
	@Override
	public String toString() { 
		return "Item Number: " + this.getItemNumber() + " | Magazine Title: " + this.getTitle() + " | Magazine Cover Story: " + coverStory + " | Magazine Issue Date: " + issueDate;
	}
	
}
