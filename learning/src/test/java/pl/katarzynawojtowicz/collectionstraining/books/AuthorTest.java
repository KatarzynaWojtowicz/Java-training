package pl.katarzynawojtowicz.collectionstraining.books;

import org.junit.Assert;
import org.junit.Test;

public class AuthorTest {
	@Test
	public void shouldCompareCorrectly() throws Exception {

		// Given
		Author author1 = new Author("Nicolas Sparks");
		Author author2 = new Author("JoJo");
		Author author3 = new Author("JoJo");

		// When
		int resultBigger = author1.compareTo(author2);
		int resultEquals = author2.compareTo(author3);
		int resultSmaller = author3.compareTo(author1);

		// Then
		Assert.assertTrue(resultBigger > 0);
		Assert.assertTrue(resultEquals == 0);
		Assert.assertTrue(resultSmaller < 0);
	}

}
