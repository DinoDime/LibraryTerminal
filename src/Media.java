

public abstract class Media {

	private String title;
	private int dueDate;
	
	
	
	public Media() {
		
	}
	
	public Media(String title, int dueDate) {
		super();
		this.title = title;
		this.dueDate = dueDate;
	}
	
	public abstract Status displayStatus();	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDueDate() {
		return dueDate;
	}

	public void setDueDate(int dueDate) {
		this.dueDate = dueDate;
	}
	
		
}
