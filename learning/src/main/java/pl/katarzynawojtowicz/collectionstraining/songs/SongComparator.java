package pl.katarzynawojtowicz.collectionstraining.songs;

import java.util.Comparator;

public class SongComparator implements Comparator<Song> {

	@Override
	public int compare(Song o1, Song o2) {
		if (o1.getArtist().compareTo(o2.getArtist()) != 0) { //Artists are different
			return o1.getArtist().compareTo(o2.getArtist());
		}
		// Artists are the same -> Sorting by title
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
