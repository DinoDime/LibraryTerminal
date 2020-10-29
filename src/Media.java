

public abstract class Media {

	private String title;
	private String dueDate;
	
	public Media() {
		
	}
	
	public Media(String title, String dueDate) {
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

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Media [title=" + title + ", dueDate=" + dueDate + "]";
	}	



}