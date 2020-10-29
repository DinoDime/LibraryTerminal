
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
		} else if (choice == 2) {
			searchFunction(things);
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
		searchId = (input.next());
		searchId.toLowerCase();
		for (Book book : bookslist) {
			if (book.getTitle().toLowerCase().contains(searchId)) {
				System.out.println(book.toString());
			} else if (book.getAuthor().toLowerCase().contains(searchId)) {
				System.out.println(book.toString());
			}
		}

	}
}

