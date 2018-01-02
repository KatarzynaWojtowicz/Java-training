package pl.katarzynawojtowicz.collectionstraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTraining {

	public static void main(String[] args) {
		Artist artist1 = new Artist("Beyonce", "USA");
		Artist artist2 = new Artist("Kombi", "Poland");
		Artist artist3 = new Artist("Maryla Rodowicz", "Poland");
		
		sortingByComparable(artist1, artist2, artist3);
		
		sortingByComparator(artist1, artist2, artist3);
	}

	private static void sortingByComparator(Artist artist1, Artist artist2, Artist artist3) {
		List<Song> songList = createSongList(artist1, artist2, artist3);
		System.out.println(songList);
		
		Collections.sort(songList, new SongComparator());
		System.out.println(songList);
	}

	private static void sortingByComparable(Artist artist1, Artist artist2, Artist artist3) {
		System.out.println(artist3.compareTo(artist1)); // >
		System.out.println(artist2.compareTo(artist3)); // <
		System.out.println(artist3.compareTo(artist3)); // ==
		
		List<Artist> artistList = new ArrayList<Artist>();
		artistList.add(artist3);
		artistList.add(artist1);
		artistList.add(artist2);
		
		System.out.println(artistList);
		
		Collections.sort(artistList);
		System.out.println(artistList);
	}

	private static List<Song> createSongList(Artist artist1, Artist artist2, Artist artist3) {
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
		return songList;
	}

}
