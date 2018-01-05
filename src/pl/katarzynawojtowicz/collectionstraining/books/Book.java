package pl.katarzynawojtowicz.collectionstraining.books;

public class Book {
	private String title;
	private Author author;
	private int numberOfSides;
	private boolean hardCover;
	
	

	public Book(String title, Author author, int numberOfSides, boolean hardCover) {
		this.title = title;
		this.author = author;
		this.numberOfSides = numberOfSides;
		this.hardCover = hardCover;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	public boolean isHardCover() {
		return hardCover;
	}

	public void setHardCover(boolean hardCover) {
		this.hardCover = hardCover;
	}

	@Override
	public String toString() {
		return title + " - " + author;
	}
}