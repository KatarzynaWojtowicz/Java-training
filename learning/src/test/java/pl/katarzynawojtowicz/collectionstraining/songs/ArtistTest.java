package pl.katarzynawojtowicz.collectionstraining.songs;

import org.junit.Assert;
import org.junit.Test;

public class ArtistTest {
	@Test
	public void shouldCompareCorrectly() {
		// Given
		Artist artist1 = new Artist("Sławomir", "Poland");
		Artist artist2 = new Artist("Cleo", "Poland");
		Artist artist3 = new Artist("Cleo", "USA");

		// When
		int resultBigger = artist1.compareTo(artist2);
		int resultEquals = artist2.compareTo(artist3);
		int resultSmaller = artist3.compareTo(artist1);

		// Then
		Assert.assertTrue(resultBigger > 0);
		Assert.assertTrue(resultEquals == 0);
		Assert.assertTrue(resultSmaller < 0);

	}

	@Test
	public void shouldConvertToString() throws Exception {

		// Given
		Artist artist1 = new Artist("Sławomir", "Poland");

		// When
		String result = artist1.toString();

		// Then
		Assert.assertTrue(result.equals("Sławomir (Poland)"));
	}

}
