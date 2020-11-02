import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MidtermTest {

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
	
}

