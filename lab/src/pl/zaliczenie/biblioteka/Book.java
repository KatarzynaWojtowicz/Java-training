package pl.zaliczenie.biblioteka;

import java.time.LocalDate;
import java.util.List;

public class Book {
	private String title;
	private String isbn;
	private List<Author> author;
	private Genre genre;
	private String description;
	private LocalDate issueDate;

	public Book(String title, String isbn, List<Author> author, Genre genre, String description, LocalDate issueDate) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.genre = genre;
		this.description = description;
		this.issueDate = issueDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public List<Author> getAuthor() {
		return author;
	}

	public void setAuthor(List<Author> author) {
		this.author = author;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", author=" + author + ", genre=" + genre + ", description="
				+ description + ", issueDate=" + issueDate + "]";
	}
}