import java.util.*;

public class returnBooks {
	public static void main(String[] args) {
		Map<String,String> bookStatus=new HashMap<String,String>();  
		String myBook = "The Little Engine That Could";
		String status = "checked out";
		bookCheckOut(myBook, status);
		bookReturn(myBook, status);
		bookStatus.put(myBook, status);
		
		}
	public static void dueDate() {
		// get a calendar instance, which defaults to "now"
	    Calendar calendar = Calendar.getInstance();
	    
	    // get a date to represent "today"
	    Date today = calendar.getTime();
	    System.out.println("Today is " + today + ".");
	 
	    // add 14 days to the date/calendar
	    calendar.add(Calendar.DAY_OF_YEAR, 14);
	    
	    // now get "due date"
	    Date dueDate= calendar.getTime();

	    // print out tomorrow's date
	    System.out.println("Your due date is " + dueDate + ".");
	}
	public static void bookCheckOut(String book, String status) {
		Scanner JavaInput = new Scanner(System.in);
		if (status.equals("on shelf")) {
			System.out.println("Are you checking out " + book + " today?");
			String userResponse = JavaInput.nextLine();
			if (userResponse.contains("y")) {
				status = "checked out";
				dueDate();
		}
		}
	}
	public static void bookReturn(String book, String status) {
		Scanner JavaInput = new Scanner(System.in);
		if (status.equals("checked out")) {
			System.out.println("Are you returning " + book + " today?");
			String userResponse = JavaInput.nextLine();
			if (userResponse.contains("y")) {
				status = "on shelf";
				System.out.println("Thank you for returning " + book + " today!");
	
	}
		}
	}
}

