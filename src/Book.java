

public class Book extends Media {

	private String author;

	public Book() {
		
	}
	
	public Book(String title, boolean status, String author) {

		super(title, status);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return getTitle() + " by " + author;
	}

	@Override
	public Status displayStatus() {
		// TODO Auto-generated method stub
		return null;
	}		
}
