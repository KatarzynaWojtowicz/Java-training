package pl.katarzynawojtowicz.collectionstraining.books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BookComparatorTest {
	@Test
	public void shouldSortedByAuthor() throws Exception {

		// Given
		Author author1 = new Author("Nicolas Sparks");
		Author author2 = new Author("Dmitry Glukhovsky");
		Author author3 = new Author("Nora Roberts");

		Book book1 = new Book("Notebook", author1, 258, true);
		Book book2 = new Book("Futu.re", author2, 567, false);
		Book book3 = new Book("Island of Glass", author3, 325, false);
		Book book4 = new Book("Choice", author1, 299, true);

		List<Book> bookList = new ArrayList<Book>();
		bookList.add(book3);
		bookList.add(book2);
		bookList.add(book1);
		bookList.add(book4);

		// When
		Collections.sort(bookList, new BookComparator());

		// Then
		Assert.assertTrue(bookList.get(0).getTitle().equals(book2.getTitle()));
		Assert.assertTrue(bookList.get(1).getTitle().equals(book4.getTitle()));
		Assert.assertTrue(bookList.get(2).getTitle().equals(book1.getTitle()));
		Assert.assertTrue(bookList.get(3).getTitle().equals(book3.getTitle()));

	}
}
