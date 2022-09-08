/*
Name: Owen Zhang
Block: D
Program: PA28
Date: 1/5/22
*/
public class Music {
	private String songTitle;
	private String albumName;
	private String artistName;
	private int releaseYear;
public Music(String daTitle, String daAlbum, String daArtist, int daYear) {
	songTitle = daTitle;
	albumName = daAlbum;
	artistName = daArtist;
	releaseYear = daYear;	
}
public String getTitle() { 
	return songTitle;
}
public String getAlbum() { 
	return albumName;
}
public String getArtist() { 
	return artistName;
}
public int getYear() { 
	return releaseYear;
}
public String toString() {
	return songTitle + "," + albumName + "," + artistName + "," + releaseYear;
}
public double getPrice() {
	if(releaseYear < 1970) {
		return 1.29;
	}else if(releaseYear >= 1970 && releaseYear < 1980) {
		return 1.89;
	}else if(releaseYear>= 1980 && releaseYear < 1990) {
		return 0.69;
	}else if(releaseYear >= 1990 && releaseYear < 2000) {
		return 0.99;
	}else
		return 1.39;
}


}
