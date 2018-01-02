package pl.katarzynawojtowicz.collectionstraining;

public class Song {
	private String title;
	private double length;
	private Artist artist;
	
	public Song(String title, double length, Artist artist) {
		this.title = title;
		this.length = length;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return artist + " - " + title; 
	}
}
