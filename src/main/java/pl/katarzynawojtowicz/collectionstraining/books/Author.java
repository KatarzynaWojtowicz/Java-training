package pl.katarzynawojtowicz.collectionstraining.books;

public class Author implements Comparable<Author> {
	private String name;

	public Author(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Author o) {
		return o.getName().compareTo(o.name);
	}
	@Override
	public String toString() {
		return this.name;
	}

}
