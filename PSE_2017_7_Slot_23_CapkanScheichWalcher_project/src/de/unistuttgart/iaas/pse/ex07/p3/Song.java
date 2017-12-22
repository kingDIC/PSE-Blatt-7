package de.unistuttgart.iaas.pse.ex07.p3;

/**
 * A song.
 * @author Daniel Capkan, Matrikelnummer: 3325960, st156303@stud.uni-stuttgart.de
 * @author Mario Scheich, Matrikelnummer: 3232655 , st151491@stud.uni-stuttgart.de
 * @author Florian Walcher, Matrikelnummer: 3320185, st156818@stud.uni-stuttgart.de
 */
public class Song implements Comparable<Song> {
	private String singer;
	private String title;
	private int year;
	/** 
	* @param singer the singer of the song
	* @param title the title of the song
	* @param year the year the song was published
	*/
	public Song(String s, String t, int y) {
		this.singer = s;
		this.title = t;
		this.year = y;
	}
	public String getSinger() {
		return singer;
	/**
	* @param getSinger the getter-method to get the artist
	*/
	}
	public String getTitle() {
		return title;
	/**
	* @param getTitle the getter method to get the title of the song
	*/
	}
	public int getYear() {
		return year;
	/**
	* @param getYear the getter method to get the published year
	*/
	}
	/**
	* @param compareTo a method to compare a song with the one written down in the brackets
	* it checks if its the same song or not
	*/
	@Override
	public int compareTo(Song lied) {
		if(this.singer.compareToIgnoreCase(lied.singer) != 0) {
			return this.singer.compareToIgnoreCase(lied.singer);
		} else if (this.title.compareToIgnoreCase(lied.title) != 0) {
			return this.title.compareToIgnoreCase(lied.title);
		} else {
			if(this.year > lied.year) {
				return -1;
			} else if (this.year < lied.year){
				return 1;
			} else {
				return 0;
			}
		}
	}
	
}
