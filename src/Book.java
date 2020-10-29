
import java.util.*;

public class Book extends Media {

	private String author;

	public Book() {
		
	}
	
	public Book(String title, String dueDate, String author) {

		super(title, dueDate);
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
		return "Title: " + getTitle() + " Author: " + author + "\n";
	}

	@Override
	public Status displayStatus() {
		// TODO Auto-generated method stub
		return null;
	}		
}
