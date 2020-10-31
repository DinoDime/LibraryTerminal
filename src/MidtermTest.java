import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;

import org.junit.jupiter.api.Test;

class MidtermTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}


boolean validInput = true;
int a = 0;
input.nextLine();
do {
	try {
		if (checkoutItem.matches("[a-zA-Z]+")) {
			for (Book book : things) {
				if (book.getTitle().toLowerCase().contains(checkoutItem)
						|| book.getAuthor().toLowerCase().contains(checkoutItem)) {
					if (book.getStatus() == true) {
						System.out.println(book.toString() + " is available");
						System.out.println("You have checked out " + book.toString());
						book.setStatus(false);
						System.out.println(dueDate());
						truncateFile();
						rewriteFile();
						a = 1;
						return validInput;
					} else {
						System.out.println(book.toString() + " is checked out and therefore unavailable");
						return validInput;
					}
				}
			}
		} else {
			System.out.println("Please try again.");
			validInput = false;
			return validInput;
		}
	} catch (InputMismatchException e) {
		System.out.println("Please try again.");
		validInput = false;
		return validInput;
	}
} while (a == 0);
return validInput;
}