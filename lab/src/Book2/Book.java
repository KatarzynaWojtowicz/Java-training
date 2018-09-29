package Book2;

import java.util.Date;

public class Book {
	public String author;
	public String tittle;
	private Date issueDate = new Date();
	public int bookId = 0;
	public static int numbersOfBooks;

	public static int getNumbersOfBooks(int bookId) {
		return bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Book(String author, String tittle) {
		this.author = author;
		this.tittle = tittle;
		numbersOfBooks++;
		this.bookId = numbersOfBooks;
	}

}
