
public class Book {
	
	//two fields /variables
	String title;
	boolean borrowed;
	
	//creates a new book
	public Book(String bookTitle) {
		this.title = bookTitle;
		this.borrowed = false;
	}
	
	//marks the books as rented
	public void borrowed() {
		this.borrowed = true;
	}
	
	//marks the book as not rented
	public void returned () {
		this.borrowed = false;
	}
	
	//returne true if the book is rented, false otherwise
	public boolean isBorrowed() {
		return this.borrowed;
	}
	
	//retursn the book title
	public String getTitle() {
		return this.title;
	}
}
