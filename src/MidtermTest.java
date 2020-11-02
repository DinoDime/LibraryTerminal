import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

import org.junit.jupiter.api.Test;

class MidtermTest {
	
	private static List<Book> books = new ArrayList<>();
		static {
				books.add (new Book("title",true,"author"));
				books.add (new Book("hello",true,"world"));				
				books.add (new Book("this",true,"test"));		
		}


	@Test
	void testCapitalizeAllUppercase() {
		String expected = "java";
		String actual = Midterm.toLowercase("JAVA");
		assertEquals(expected, actual);
	}
	@Test
	void testCapitalizeMixed() {
		String expected = "java";
		String actual = Midterm.toLowercase("Java");
		assertEquals(expected, actual);
	}
	@Test
	void testCapitalizeEmptyString() {
		String expected = "";
		String actual = Midterm.toLowercase("");
		assertEquals(expected, actual);
	}
	@Test
	void testCapitalizeNumbers() {
		String expected = "789";
		String actual = Midterm.toLowercase("789");
		assertEquals(expected, actual);
	}
	@Test
	void testCapitalizeNumbersMixed() {
		String expected = "4tw";
		String actual = Midterm.toLowercase("4TW");
		assertEquals(expected, actual);
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
	void testSearchFunctionNullInput() {
		String expected = "Nothing found within search";
		String actual = Midterm.searchFunction(books, "");
		assertEquals(expected, actual);
	}

}

