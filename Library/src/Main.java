
public class Main {

	
public static void main(String[] args) {
		
		//small test of the book class
		Book example = new Book("The Da Vinvi Code");
		System.out.println("Borrowed? (should be false): " +example.isBorrowed());
		example.borrowed();
		System.out.println("Borrowed? (should be true):" + example.isBorrowed());
		example.returned();
		System.out.println("Borrowed? (shoould be false):" + example.isBorrowed());
		
		//create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St");
		
		//add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petite Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));
		
		
		//Print opening hours and the addresses
		System.out.println("Library hours:");
		firstLibrary.printOpeningHours();
		System.out.println();
		
		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();
		
		//try to borrow the Lord of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");	
		secondLibrary.borrowBook("The Lord of the Rings");	
		System.out.println();	
		
		//print the titles of all available books from both libraries
		System.out.println("Books available in the first library: ");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();
		
		//return the Lords of the Rings to the first Library
		System.out.println("Returning the Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();
		
		//print the titles available from first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		
		
	}

}
