package _06_20;

public class Example01 {
	public static void main(String[] args) {
		Tv myTv = new Tv("LG", 2017, 32);
		System.out.println(myTv.show());
		Song song = new Song("Dancing Queen", "ABBA", 1978, "������");
		System.out.println(song.show());
	}
}

class Tv {
	
	String brand;
	int year;
	int inch;
	
	public Tv(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	String show() {
		return brand + "���� ���� " + year + "�� " + inch + "��ġ";
	}
}


class Song {
	
	String title;
	
	String artist;
	
	int year;
	
	String country;
	
	
	public Song() {}
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public String show() {
		return year + "�� " + country + "������ " + artist + "�� �θ� \"" + title + "\"";
	}
}