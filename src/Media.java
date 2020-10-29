

public abstract class Media {

	private String title;
	private boolean status;
	
	public Media() {
		
	}
	
	public Media(String title, boolean status) {
		this.title = title;
		this.status = status;
	}
	
	public abstract Status displayStatus();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Media [title=" + title + ", status=" + status + "]";
	}	

}

