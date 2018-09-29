package pl.katarzynawojtowicz.collectionstraining.books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortBook {
	public static void main(String[] args) {
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
		
		System.out.println(bookList);
		Collections.sort(bookList, new BookComparator());
		System.out.println(bookList);
		

		}
	}

