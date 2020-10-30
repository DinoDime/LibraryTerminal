
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;


public class Midterm {
	static List<Book> things = new ArrayList<>();

	static Scanner input = new Scanner(System.in);
	private static Path filePath = Paths.get("BookList.txt");

	public static void main(String[] args) {
		System.out.println("Welcome to the Library index");
		System.out.println("What would you like to do?");
		System.out.println("1)List all books\n2)Search for a book by Title/Keyword or Author\n3)Return a rental");
		int choice = input.nextInt();
		if (choice == 1) {
			System.out.println(readFile());
			input.nextLine();
			bookCheckOut();
		} else if (choice == 2) {
			searchFunction(things);
			input.nextLine();
			bookCheckOut();
		} else if (choice == 3) {
			System.out.println("What are you returning?");
			String book = input.next();
			boolean status = true;
			returnBooks.bookReturn(book, status);
		}
}
		
//**************List Method*******************************************
	public static List<Book> readFile() {
		try {
			List<String> lines = Files.readAllLines(filePath);

			for (String line : lines) {
				String[] parts = line.split("~");
				String title = parts[0];
				boolean status = Boolean.parseBoolean(parts[1]);
				String author = parts[2];
				things.add(new Book(title, status, author));
			}
			return things;
		} catch (IOException e) {
			System.out.println("Unable to read file.");
			return new ArrayList<>();
		}
	}

//***************Search Method**************************************************	
	public static void searchFunction(List<Book> bookslist) {
		readFile();
		String searchId;
		System.out.println("Type search word:");
		input.nextLine();
		searchId = (input.nextLine().toLowerCase());
		searchId.toLowerCase();
		for (Book book : bookslist) {
			if (book.getTitle().toLowerCase().trim().contains(searchId.trim())) {
				System.out.println(book.toString());
			} else if (book.getAuthor().toLowerCase().contains(searchId)) {
				System.out.println(book.toString());
			}
		}
	}

//***************Checkout Book Method**************************************************	
	public static void bookCheckOut() {
		System.out.println("What book would you like to checkout?");
		String checkoutItem = input.nextLine().toLowerCase();

		for (Book book : things) {
			if (book.getTitle().toLowerCase().contains(checkoutItem)) {
				if (book.getStatus() == true) {
					System.out.println(book.toString() + " is available");
					System.out.println("You have checked out " + book.toString());
					book.setStatus(false);
					dueDate();
				} else {
					System.out.println(book.toString() + " is checked out and therefore unavailable");

				}

			} else if (book.getAuthor().toLowerCase().contains(checkoutItem)) {
				if (book.getStatus() == true) {
					System.out.println(book.toString() + " is available");
					System.out.println("You have checked out " + book.toString());
					book.setStatus(false);
					dueDate();
				} else {
					System.out.println(book.toString() + " is checked out and therefore unavailable");
					
				}

			}
		}

		}

//***************Due Date Method**************************************************	
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
		
			
//***************Erase Method**************************************************	
		public static void truncateFile() {
			try {
				FileChannel.open(Paths.get("BookList.txt"), StandardOpenOption.WRITE).truncate(0).close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(readFile());
		}
			
//***************Write Method**************************************************	
	public static void rewriteFile() {   
			try {
		      FileWriter myWriter = new FileWriter("BookList.txt");
		      for(Book rewriteList: things) {
		    	  String jkadf = (rewriteList.getTitle() + "~" + rewriteList.getStatus() + "~" + rewriteList.getAuthor()+"\n");
		      myWriter.write(jkadf);
		      }
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	
		
	}
}

