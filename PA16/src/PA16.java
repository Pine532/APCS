/*
Name: Owen Zhang
Block: D
Program: PA16
Date: 9/24/21
*/

public class PA16 {

	/*
	 * When squirrels get together for a party, they like to have cigars. A squirrel
	 * party is successful when the number of cigars is between 40 and 60,
	 * inclusive. Unless it is the weekend, in which case there is no upper bound on
	 * the number of cigars. Return true if the party with the given values is
	 * successful, or false otherwise.
	 */
	public static boolean cigarParty(int cigars, boolean isWeekend) {
		if((cigars>=40 && isWeekend) || (cigars >=40 && cigars <= 60)) {
			return true;
		}else {
			return false;
		}
	}

	/*
	 * The squirrels in Palo Alto spend most of the day playing. In particular, they
	 * play if the temperature is between 60 and 90 (inclusive). Unless it is
	 * summer, then the upper limit is 100 instead of 90. Given an int temperature
	 * and a boolean isSummer, return true if the squirrels play and false
	 * otherwise.
	 */
	public static boolean squirrelPlay(int temp, boolean isSummer) {
		if((temp >= 60 && temp <= 90) || ((temp >= 60 && temp<= 100) && isSummer)) {
			return true;
		}else {
			return false;
		}
	}

	/*
	 * Given 2 ints, a and b, return their sum. However, sums in the range 10..19
	 * inclusive, are forbidden, so in that case just return 20.
	 */
	public static int sortaSum(int a, int b) {
		if(a+b>=10 && a+b <= 19) {
			return 20;
		}else {
			return a+b;
		}
	}

	/*
	 * Given two int values, return whichever value is larger. However if the two
	 * values have the same remainder when divided by 5, then the return the smaller
	 * value. However, in all cases, if the two values are the same, return 0. Note:
	 * the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
	 */
	public static int maxModFive(int a, int b) {
		if(a==b) {
			return 0;
		}
		if(a%5==b%5) {
			if(a>b)
				return b;
			else
				return a;
		}
		else {
			if(a>b)
				return a;
			else
				return b;
		}
	}

	/*
	 * Given a number n, return the sum of all the numbers inside of it. For example
	 * given 54 whould return 9 which is 5+4. There is no maximum size this number
	 * can be (you must write a while loop so all numbers can work.. no matter how
	 * large) Remember division and modulo division! And maybe a counter or sum
	 * variable.
	 */
	public static int sumDigits(int n) {
		int sum = 0;
		int digit = 0;
		while (n>0) {
			digit = n%10;
			sum += digit;
			n/=10;
		}
		return sum;
	}

	/*
	 * Given a number n, return number of even numbers inside of it. For example
	 * given 234 whould return 2 becuase of the 2 and the 4 are both even numbers
	 * but 3 is not There is no maximum size this number can be (you must write a
	 * while loop so all numbers can work.. no matter how large) Remember division
	 * and modulo division! And maybe a counter or sum variable.
	 */
	public static int countEvens(int n) {
		int num = 0;
		int digit = 0;
		if(n==0)
			return 1;
		while(n>0) {
			digit = n%10;
			if(digit%2 == 0) {
				num++;
			}
			n/=10;
			
		}
		return num;
	}

	/*
	 * Given a number n, return the largest invidual number of all the numbers
	 * inside of it. For example given 1000005 whould return 5 since 5 is the
	 * largest number. There is no maximum size this number can be (you must write a
	 * while loop so all numbers can work.. no matter how large) Remember division
	 * and modulo division! And maybe a counter or sum variable.
	 */
	public static int largestNum(int n) {
		int num = n;
		int large = 0;
		while (num>0) {
			int num2 = num % 10;
			if (num2 > large) {
				large = num2;
			}
			num/=10;
		}
		return large;
	}

	public static void main(String[] args) {
		// All of the following below are examples on how to call the methods above
		// In order to test to see what a method does.. you have to change the below
		// lines to reflect it
		System.out.println("cigarParty(30,false) --> " + cigarParty(30, false));
		System.out.println("squirrelPlay(70,false) --> " + squirrelPlay(70, false));
		System.out.println("sortaSum(3,4) --> " + sortaSum(3, 4));
		System.out.println("maxModFive(2,3) --> " + maxModFive(2, 3));
		System.out.println("countEvens(0) --> " + countEvens(0));
		System.out.println("sumDigits(128) --> " + sumDigits(128));
		System.out.println("largestNum(31) --> " + largestNum(31));
	}
}