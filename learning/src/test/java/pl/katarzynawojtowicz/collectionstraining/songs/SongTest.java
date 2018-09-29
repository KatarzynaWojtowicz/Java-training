package pl.katarzynawojtowicz.collectionstraining.songs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SongTest {
	@Test
	public void shouldConvertToString() throws Exception {

		// Given
		Artist artist1 = new Artist("Beyonce", "USA");
		Artist artist2 = new Artist("Kombi", "Poland");
		Artist artist3 = new Artist("Maryla Rodowicz", "Poland");

		Song song1 = new Song("Halo", 3.45, artist1);
		Song song2 = new Song("Pokolenie", 3.23, artist2);
		Song song3 = new Song("Małgośka", 4.30, artist3);

		List<Song> songList = new ArrayList<Song>();
		songList.add(song1);
		songList.add(song2);
		songList.add(song3);

		// When
		String result = songList.toString();

		// Then
		Assert.assertTrue(result
				.equals("[Beyonce (USA) - Halo, Kombi (Poland) - Pokolenie, Maryla Rodowicz (Poland) - Małgośka]"));

	}

}
