
import java.util.*;

public class Book extends Media {

	private List<String> author;

	public Book() {
		
	}
	
	public Book(List<String> author) {
		super();
		this.author = author;
	}

	public List<String> getAuthor() {
		return author;
	}

	public void setAuthor(List<String> author) {
		this.author = author;
	}

	@Override
	public Status displayStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	
		
}
