/*
Name: Owen Zhang
Block: D
Program: PA13
Date: 9/3/21
 */
import java.util.Scanner;
public class PA13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int choice = 0;
		int choice2 = 0;
		int a = 0;
		int  b = 0;
		while(a < 2 && b < 2) {
		System.out.print("Player A: Rock (1), Paper (2), or Scissors (3)? ");
		choice = scan.nextInt();
		System.out.print("Player B: Rock (1), Paper (2), or Scissors (3)? ");
		choice2 = scan.nextInt();
		if(choice > 3 || choice2 >3 || choice2 <= 0 || choice <= 0) {
			System.out.println("Invalid Selection");
		}else if(choice==choice2) {
			System.out.println("Tie!");
		}else if(choice2 == choice-1) {
			System.out.println("Player A Wins!");
			a++;
		}else if(choice == 1 && choice2 == 3) {
			System.out.println("Player A Wins!");
			a++;
		}else {
			System.out.println("Player B Wins!");
			b++;
			}
		}
		if(a>b) {
			System.out.print("Player A Wins " + a + " to " + b);
		}else {
			System.out.print("Player B Wins " + b + " to " +a);
		}

	}

}
