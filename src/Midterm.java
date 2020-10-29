
public class Midterm {

	public static void main(String[] args) {
		System.out.println("Welcome to the Library index");
//		SysO ask for list or search or return
//		generate options		
//			1 2 3	
//		
//		
	}
//	
//	
//	
//	???METHODS????
//			
//	*method list books
//		reads file
//		generate array list
//		print
//		
//	*method search function
	public static void searchfunction(List<Book> bookslist, String searchId) {
		for(String book : bookslist) {
			if(book.contains(searchId)) {
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
