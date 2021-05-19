package constructor;

public class Book {
	//Attributes
	public String title;
	public String author;
	public String genre;
	public int pageCount;
	public boolean isOpen;
	
	//Constructor
	public Book(String title, int pageCount, String genre) {
		this.title = title;
		this.pageCount = pageCount;
		this.genre = genre;
	}
	
	
	//Methods
	
	public void open() {
		this.isOpen = true;
	}
	
	public void close() {
		this.isOpen = false;
	}

}
