package pl.zaliczenie.biblioteka;

import java.util.List;

public class Library implements plusBook {

	private String name;
	private Address address;
	private List<Book> books;

	public Library(String name, Address address, List<Book> books) {
		super();
		this.name = name;
		this.address = address;
		this.books = books;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", address=" + address + ", books=" + books + "]";
	}

	@Override
	public void addBook(Book book) {
		books.add(book);

	}

	@Override
	public void removeBook(Book book) {
		books.remove(book);

	}

}
