package lybrarySystem;

public class Book extends LibraryItem{
	public int numberOfPages;
	public Book() {};
	public Book(String title, String author, int year, int pages) {
		super(title, author, year);
		this.numberOfPages = pages;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public String toString() {
		return "Book:" + super.toString() + " number of pages: " + numberOfPages;
	}
}
