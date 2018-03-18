package pl.katarzynawojtowicz.collectionstraining.songs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SongComparatorTest {

	@Test
	public void shouldSortedByArtist() throws Exception {

		// Given
		Artist artist1 = new Artist("Beyonce", "USA");
		Artist artist2 = new Artist("Kombi", "Poland");
		Artist artist3 = new Artist("Maryla Rodowicz", "Poland");

		Song song1 = new Song("Halo", 3.45, artist1);
		Song song2 = new Song("Pokolenie", 3.23, artist2);
		Song song3 = new Song("Single ladies", 4.30, artist1);
		Song song4 = new Song("Małgośka", 2.59, artist3);
		Song song5 = new Song("Black and White", 2.9, artist2);
		List<Song> songList = new ArrayList<Song>();
		songList.add(song2);
		songList.add(song4);
		songList.add(song5);
		songList.add(song3);
		songList.add(song1);

		// When
		Collections.sort(songList, new SongComparator());

		// Then
		Assert.assertTrue(songList.get(0).getTitle().equals(song1.getTitle()));
		Assert.assertTrue(songList.get(1).getTitle().equals(song3.getTitle()));
		Assert.assertTrue(songList.get(2).getTitle().equals(song5.getTitle()));
		Assert.assertTrue(songList.get(3).getTitle().equals(song2.getTitle()));
		Assert.assertTrue(songList.get(4).getTitle().equals(song4.getTitle()));

	}
}
