import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class MidtermTest {
	
	private static List<Book> books = new ArrayList<>();
		static {
				books.add (new Book("title",true,"author"));
				books.add (new Book("hello",true,"world"));				
				books.add (new Book("this",true,"test"));		
		}


	@Test
	void testSearchFunctionTitle() {
		String expected = "hello by world";
		String actual = Midterm.searchFunction(books, "hello");
		assertEquals(expected, actual);
	}
	@Test
	void testSearchFunctionAuthor() {
		String expected = "hello by world";
		String actual = Midterm.searchFunction(books, "world");
		assertEquals(expected, actual);
	}
	@Test
	void testSearchFunctionNotInList() {
		String expected = "Nothing found within search";
		String actual = Midterm.searchFunction(books, "audiobook");
		assertEquals(expected, actual);
	}
	@Test
	void testSearchFunctionIntInput() {
		String expected = "Nothing found within search";
		String actual = Midterm.searchFunction(books, "3425");
		assertEquals(expected, actual);
	}
	@Test
	void testSearchFunctionMixedInput() {
		String expected = "Nothing found within search";
		String actual = Midterm.searchFunction(books, "3T25fr");
		assertEquals(expected, actual);
	}

}

