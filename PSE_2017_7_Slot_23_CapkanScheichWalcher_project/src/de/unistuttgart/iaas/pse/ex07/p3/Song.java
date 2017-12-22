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
	public Song(String s, String t, int y) {
		this.singer = s;
		this.title = t;
		this.year = y;
	}
	public String getSinger() {
		return singer;
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
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
