package pl.katarzynawojtowicz.collectionstraining.books;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {
	@Test
	public void shouldConvertToString() throws Exception {

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
		String result = bookList.toString();

		// Then
		Assert.assertEquals(result,
				"[Island of Glass - Nora Roberts, Futu.re - Dmitry Glukhovsky, Notebook - Nicolas Sparks, Choice - Nicolas Sparks]");

	}

}
