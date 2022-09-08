import java.util.Scanner;
public class PA28 {

	
	public static Music[] readLibrary(){ 
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many Albums?: ");
		num = scan.nextInt();
		Music[] library = new Music[num];
		for(int i = 0; i<library.length; i++) {
			scan.nextLine();
			System.out.println("song title?");
			String title = scan.nextLine();
			
			System.out.println("album name?");
			String name = scan.nextLine();
			
			System.out.println("artist?");
			String artist = scan.nextLine();
			
			System.out.println("Publication year?");
			int year = scan.nextInt();
			Music songSong = new Music(title, name, artist, year);
			library[i] = songSong;
		}
		return library;
		
		
	}
	public static double totalPrice(Music[] songs){
		double total = 0.0;
		for(int i = 0; i<songs.length; i++) {
			total += songs[i].getPrice();
		}
		return total;
	}
	public static void main(String[] args) {
		readLibrary();
	}


}
