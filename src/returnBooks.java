import java.util.*;

public class returnBooks {
	public static void returnCheckOut(String book, boolean status) {
		book = "The Little Engine That Could";
		status = true;
		bookCheckOut(book, status);
		bookReturn(book, status);
		
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
	public static void bookCheckOut(String book, boolean status) {
		Scanner JavaInput = new Scanner(System.in);
		if (status == true) {
			System.out.println("Are you checking out " + book + " today?");
			String userResponse = JavaInput.nextLine();
			if (userResponse.contains("y")) {
				status = false;
				dueDate();
		}
		}
	}
	public static void bookReturn(String book, boolean status) {
		Scanner JavaInput = new Scanner(System.in);
		if (status == false) {
			System.out.println("Are you returning " + book + " today?");
			String userResponse = JavaInput.nextLine();
			if (userResponse.contains("y")) {
				status = true;
				System.out.println("Thank you for returning " + book + " today!");
	
	}
		}
	}
}