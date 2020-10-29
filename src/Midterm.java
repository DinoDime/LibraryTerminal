
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
	

	private static Path filePath = Paths.get("BookList.txt");
	
	public static void main(String[] args) {
		
		System.out.println(readFile());
		
	
		System.out.println("Welcome to the Library index");
		searchFunction(things,"Taylor");
//		SysO ask for list or search or return
//		generate options		
//			1 2 3	
//		
//		
	}

//	
//	
//	

	
//		
//	*method return
//			enum for in or out
	
			
//**************List Method*******************************************
	public static List<Book> readFile() {
		try {
			List<String> lines = Files.readAllLines(filePath);
								
			for (String line : lines) {
				String[] parts = line.split("~");
				String title = parts[0];
				String dueDate = parts[1];
				String author = parts[2];
				things.add(new Book(title,dueDate,author));
			}			
			return things;			
		} catch (IOException e) {
			System.out.println("Unable to read file.");
			return new ArrayList<>();
		}
	}
//***************Search Method**************************************************	
	public static void searchFunction(List<Book> bookslist, String searchId) {
		for(Book book : bookslist) {
			if(book.getTitle().contains(searchId)) {
				System.out.println(book.toString());	
			}else if(book.getAuthor().equals(searchId)) {
				System.out.println(book.toString());
			}
		}

	}
}
//		
//	*method return
//			enum for in or out
//	
//			
//
	

		//method 1 list all books 

		

