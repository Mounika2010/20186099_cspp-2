//The menu should provide the user with the option of creating a new ​Card Catalog and
//then of adding, removing individual books, or of printing a list of all books within the ​Card Catalog . ​

public class Menu {
	public static void main(String args[]) {
		//Card Catalog class will take integer as parameter in constructor which hold the maximum number of cards.
		CardCatalog cc = new CardCatalog(2);

		//Card class will be having the information about the book it describes.
		//The constructor should take a three parameters, the title ​of the book,
		//the ​author ​of the book, and the ​subject ​of the book as all strings.
		Card c1 = new Card("Let us c", "Yesh Kanetkar", "C Programming");
		cc.addACard(c1);

		// To String to print the Card Object in the example below.
		// 1. Book Title: Let us c, Author: Yesh Kanetkar
		// Subject: C Programming
		System.out.print(cc);

		// Checks the count of current cards in the catalogue.
		if (cc.sizeOfCatalog() == 1) {
			System.out.println("Test Case 1 Passed");
		} else {
			System.out.println("Test Case 1 Failed");
		}

		Card c2 = new Card("Think Java", "Dwolye", "Java Programming");
		cc.addACard(c2);

		// As the size of the catalog is full, you need to manage the Card Catalog by
		// growing the catalogue. (Hint: Resize)

		Card c3 = new Card("Ansi c", "Balaguru swamy", "C++ Programming");
		cc.addACard(c3);

		// Checks the count of current cards in the catalogue.
		if (cc.sizeOfCatalog() == 3) {
			System.out.println("Test Case 2 Passed");
		} else {
			System.out.println("Test Case 2 Failed");
		}

		Card c4 = new Card("Mobile programming", "Balaguru swamy", "Mobile Programming");
		cc.addACard(c4);
		// Output will be like the following:
		// 1. Book Title: Let us c, Author: Yesh Kanetkar
		// Subject: C Programming
		//
		// 2. Book Title: Think Java, Author: Dwolye
		// Subject: Java Programming
		//
		// 3. Book Title: Ansi c, Author: Balaguru swamy
		// Subject: C++ Programming
		//
		// 4. Book Title: Mobile programming, Author: Balaguru swamy
		// Subject: Mobile Programming
		System.out.print(cc);

		// Checks the count of current cards in the catalogue.
		if (cc.sizeOfCatalog() == 4) {
			System.out.println("Test Case 3 Passed");
		} else {
			System.out.println("Test Case 3 Failed");
		}

		// Print the Card object by using the Title of the Book.
		//Output will be :
		// Book Title: Ansi c, Author: Balaguru swamy, Subject: C++ Programming
		System.out.println(cc.getCardByTitle("Ansi c"));

		// Remove the Card Object if the Card Object is present in the Catalogue.
		//This method will take Title of the book as the parameter.
		cc.removeCard("Ansi c");
		cc.removeCard("Ansi c");

		// Checks the count of current cards in the catalogue.
		if (cc.sizeOfCatalog() == 3) {
			System.out.println("Test Case 4 Passed");
		} else {
			System.out.println("Test Case 4 Failed");
		}

		//Print the current books in the card catalogue in the order as discussed earlier.
		System.out.print(cc);

		cc.addACard(new Card("Algorithms - 1", "Bob Sedgewick", "Java Programming"));
		cc.addACard(new Card("Algorithms - 2", "Bob Sedgewick", "Java Programming"));

		// Checks the count of current cards in the catalogue.
		if (cc.sizeOfCatalog() == 5) {
			System.out.println("Test Case 5 Passed");
		} else {
			System.out.println("Test Case 5 Failed");
		}

		System.out.println(cc.getCardByTitle("Algorithms - 2"));

		//Print the current books in the card catalogue in the order as discussed earlier.
		System.out.print(cc);

		// Clears all the cards in the card catalogue, which make the catalogue empty.
		cc.clear();
		// Checks the count of current cards in the catalogue.
		if (cc.sizeOfCatalog() == 0) {
			System.out.println("Test Case 6 Passed");
		} else {
			System.out.println("Test Case 6 Failed");
		}
	}
}