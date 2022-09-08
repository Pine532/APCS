/*
Name: Owen Zhang
Block: D
Program: PA12
Date: 9/3/21
 */
import java.util.Scanner;
public class PA12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a grade (type a negative number to stop): ");
		double grade = scan.nextDouble();
		double grade3 = 0.0;
		int grades = 0;
		double grade2 = 0;
		double grade4=0;
		if(grade<0) {
			System.out.print("No grades found.");
		}else {
		while(grade2 >= 0) {
			System.out.print("Please enter a grade (type a negative number to stop): ");
			grade2 = scan.nextDouble();
			grade4=grade2;
			grade3 += grade2;
			grades++;
			}
		grade3+= -(grade4);
		grade3+= grade;
		System.out.print("Average grade is: " + (int)(grade3/grades+0.5) + "%.");
	}

}
}
