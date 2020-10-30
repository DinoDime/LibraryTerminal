
public class Movies extends Media{
	private String director;
	
	
	
	public Movies() {
		
	}
	
	public Movies(String director) {
		super();
		this.director = director;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	@Override
	public Status displayStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Movies [director=" + director + ", displayStatus()="
				+ displayStatus() + ", getTitle()=" + getTitle() + ", getDueDate()=" +  ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
