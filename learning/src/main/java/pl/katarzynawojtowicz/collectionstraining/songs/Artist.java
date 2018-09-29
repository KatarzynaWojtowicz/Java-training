package pl.katarzynawojtowicz.collectionstraining.songs;

public class Artist implements Comparable<Artist>{
	private String name;
	private String nationality;
	
	public Artist(String name, String nationality) {
		this.name = name;
		this.nationality = nationality;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public int compareTo(Artist otherInstance) {
		return name.compareTo(otherInstance.getName());
	}

	@Override
	public String toString() {
		return this.name + " (" + this.nationality + ")";
	} 
}

