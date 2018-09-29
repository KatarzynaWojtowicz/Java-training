package Book;

public class BookMain {
	public static void main(String[] args) {
		Book myBook = new Book("Nicolas Sparks", "Notebook", null, (long) 956478563);

		System.out.println("Author: " + myBook.author + " " + "Tittle: " + myBook.tittle + " " + "Date: "
				+ myBook.getIssueDate() + " " + "ID: " + myBook.bookId);
		System.out.println();

		Book secondBook = new Book("Harlan Coben", "In Home", null, (long) 75634426);
		System.out.println("Author: " + secondBook.author);
		System.out.println("Tittle: " + secondBook.tittle);
		System.out.println("Date: " + secondBook.getIssueDate());
		System.out.println("ID: " + secondBook.bookId);
	}

}
