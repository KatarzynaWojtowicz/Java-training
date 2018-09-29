package pl.zaliczenie.biblioteka;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		Author author1 = new Author("Nicholas", "Sparks");
		Author author2 = new Author("Jan", "Brzechwa");
		Author author3 = new Author("Julian", "Tuwim");
		Author author4 = new Author("Aleksandra", "Plec");
		Author author5 = new Author("Marzenna", "Skoczylas");

		List<Author> author = new ArrayList<Author>();
		author.add(author1);
		author.add(author2);
		author.add(author3);

		List<Author> authors = new ArrayList<Author>();
		authors.add(author5);
		authors.add(author4);

		Book book1 = new Book("Notebook", "946736", author.subList(0, 1), Genre.ROMANCE, "Beautiful story of love",
				LocalDate.of(1996, 10, 1));
		Book book2 = new Book("Na straganie", "777934", author.subList(1, 2), Genre.FOR_KIDS, "Book for little kids",
				LocalDate.of(2009, 10, 19));
		Book book3 = new Book("Lokomotywa", "906832", author.subList(2, 3), Genre.FOR_KIDS, "Book for little kids",
				LocalDate.of(1993, 12, 1));
		Book book4 = new Book("Elementarz. Teksty do czytania metoda sylabowa", "445326", authors, Genre.FOR_KIDS,
				"Book for little students", LocalDate.of(2016, 9, 5));
		List<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);

		Address adress = new Address("Kwiska", "Wroclaw", "34", "872156347");

		Library library = new Library("MY NEW LIBRARY", adress, books);

		System.out.println(library);
		System.out.println(books);
	}
}
