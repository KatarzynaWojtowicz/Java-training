package pl.katarzynawojtowicz.collectionstraining.books;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getAuthor().compareTo(o2.getAuthor()) != 0) {
			return o1.getAuthor().compareTo(o2.getAuthor());
		}
		return o1.getTitle().compareTo(o2.getTitle());
	}
}
