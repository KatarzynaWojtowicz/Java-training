package Book2;

public class Main {
	public static void main(String[] args) {

		Book newBook = new Book("Nicolas Sparks", "Notebook");
		Book secondBook = new Book("Nicolas Sparks", "Night in Rothande");
		Book myBook = new Book("Katarzyna Grochola", "Poczwarka");

		System.out.println(newBook.author);
		System.out.println(newBook.tittle);
		System.out.println(newBook.getIssueDate());
		System.out.println(newBook.bookId);

		System.out.println(secondBook.author);
		System.out.println(secondBook.tittle);
		System.out.println(secondBook.bookId);

		System.out.println(myBook.author);
		System.out.println(myBook.tittle);
		System.out.println(myBook.bookId);

	}
}
