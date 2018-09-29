package Book;

import java.util.Date;

public class Book {
	public String author;
	public String tittle;
	private Date issueDate = new Date();
	public Long bookId;

	public String getAutor() {
		return author;
	}

	public void setAutor(String autor) {
		this.author = autor;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Book(String author, String tittle, Date issueDate, Long bookId) {
		super();
		this.author = author;
		this.tittle = tittle;
		this.issueDate = issueDate;
		this.bookId = bookId;
	}

}
