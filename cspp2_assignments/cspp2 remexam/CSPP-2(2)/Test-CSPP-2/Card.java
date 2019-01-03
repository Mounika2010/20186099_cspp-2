public class Card {
	String bookTitle;
	String authorname;
	String subject;

	Card(String bookTitle, String authorname, String subject) {
		this.bookTitle = bookTitle;
		this.authorname = authorname;
		this.subject = subject;
	}

	public String toString(){
		return this.bookTitle + " " + this.authorname + " " + this.subject;
	}
 
	public String getTitle() {
		return this.bookTitle;
	}

	public String getAuthorname() {
		return this.authorname;
	}

	public String getSubject() {
		return this.subject;
	}
}