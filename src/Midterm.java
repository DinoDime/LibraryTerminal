
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.io.*;
import java.nio.channels.FileChannel;

public class Midterm {
	static List<Book> things = new ArrayList<>();

	static Scanner input = new Scanner(System.in);
	private static Path filePath = Paths.get("BookList.txt");

	public static void main(String[] args) {
		while (true) {
			System.out.println("Welcome to the Library index");
			System.out.println("\nWhat would you like to do?");
			System.out.println(
					"1)List all books\n2)Search for a book by Title/Keyword or Author\n3)Checkout a book\n4)Return a rental\n5)Quit");
			int choice = input.nextInt();
			if (choice == 1) {
				readFile();
				break;
			} else if (choice == 2) {
				readFile();
				System.out.println("Type search word:");
				input.nextLine();
				String searchId = toLowercase(input.nextLine());
				System.out.println(searchFunction(things,searchId));
				break;
			} else if (choice == 3) {
				readFile();
				input.nextLine();
				System.out.println("What book would you like to checkout?");
				String checkoutItem = toLowercase(input.nextLine());
				boolean checkout = bookCheckOut(checkoutItem);
				if (checkout == true) {
					System.out.println("Thank you for checking out. Your book is due back by " + dueDate());
				} else if (checkout == false) {
					System.out.print("That book has already been checked out.");
				}
				break;
			}
			else if (choice == 4) {
				readFile();
				input.nextLine();
				System.out.println("What book would you like to return?");
				String returnItem = toLowercase(input.nextLine());
				boolean returned = bookReturn(returnItem);
				if (returned == true) {
					System.out.println("That book has already been returned.");
				} else if (returned == false) {
					System.out.print("Thank you for your return.");
				}
				
				break;
			}
			else if (choice == 5) {
				System.out.println("Goodbye");
				break;
			} else {
				System.out.println("Invalid entry. Please try again.");
				continue;
			}
		}
	}

//**************To Lowercase method***********************************
	public static String toLowercase(String input) {
		String inputLowercase = input.toLowerCase();
		return inputLowercase;
	}
	
//**************List Method*******************************************
	public static List<Book> readFile() {
		try {
			List<String> lines = Files.readAllLines(filePath);
			System.out.println("	     Book Catalog");
			System.out.println("========================================");
			for (String line : lines) {
				String[] parts = line.split("~");
				String title = parts[0];
				boolean status = Boolean.parseBoolean(parts[1]);
				String author = parts[2];
				things.add(new Book(title, status, author));
				System.out.printf("%-23s", title);
				System.out.println(" by " + author);
			}
			System.out.println("========================================");
			return things;
		} catch (IOException e) {
			System.out.println("Unable to read file.");
			return new ArrayList<Book>();
		}
	}

//***************Search Method**************************************************	
	public static String searchFunction(List<Book> bookslist, String searchId) {		
		for (Book book : bookslist) {
			if (book.getTitle().toLowerCase().contains(searchId) || book.getAuthor().toLowerCase().contains(searchId)) {
				return book.toString();
			}
		} 
		System.out.print("Nothing found within search ");
		return searchId;
	}

//***************Checkout Book Method**************************************************	
	public static boolean bookCheckOut(String checkoutItem) {
			boolean checkout = true;
			for (Book book : things) {
				if (book.getTitle().toLowerCase().contains(checkoutItem)) {
					if (book.getStatus() == true) {
						book.setStatus(false);
						truncateFile();
						rewriteFile();
						return checkout;
					} else {
						checkout = false;
						return checkout;
						}
				} 
			} return checkout;
		}

//***************Return Book Method**************************************************	
	public static boolean bookReturn(String returnItem) {
		boolean returned = true;
		for (Book book : things) {
			if (book.getTitle().toLowerCase().contains(returnItem)) {
				if (book.getStatus() == true) {
					return returned;
				} else {
					book.setStatus(true);
					truncateFile();
					rewriteFile();
					returned = false;
					return returned;
					}
			} 
		} return returned;
	}
	
//***************Due Date Method**************************************************	
	public static Date dueDate() {
		// get a calendar instance, which defaults to "now"
		Calendar calendar = Calendar.getInstance();

		// get a date to represent "today"
		Date today = calendar.getTime();
		//System.out.println("Today is " + today + ".");

		// add 14 days to the date/calendar
		calendar.add(Calendar.DAY_OF_YEAR, 14);

		// now get "due date"
		Date dueDate = calendar.getTime();

		// return tomorrow's date
		return dueDate;
	}

//***************Truncate Method**************************************************	
	public static void truncateFile() {
		try {
			FileChannel.open(Paths.get("BookList.txt"), StandardOpenOption.WRITE).truncate(0).close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//***************Write Method**************************************************	
	public static void rewriteFile() {
		try {
			FileWriter myWriter = new FileWriter("BookList.txt");
			for (Book rewriteList : things) {
				String jkadf = (rewriteList.getTitle() + "~" + rewriteList.getStatus() + "~" + rewriteList.getAuthor()
						+ "\n");
				myWriter.write(jkadf);
			}
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}