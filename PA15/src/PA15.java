/*
Name: Owen Zhang
Block: D
Program: PA15
Date: 15/9/21
*/

public class PA15 {

	/*
	 * The parameter weekday is true if it is a weekday, and the parameter vacation
	 * is true if we are on vacation. We sleep in if it is not a weekday or we're on
	 * vacation. Return true if we sleep in.
	 */
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if (weekday == false || vacation == true) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
	 * if each is smiling. We are in trouble if they are both smiling or if neither
	 * of them is smiling. Return true if we are in trouble.
	 */
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile == true && bSmile == true || aSmile == false && bSmile == false) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * We have a loud talking parrot. The "hour" parameter is the current hour time
	 * in the range 0..23. We are in trouble if the parrot is talking and the hour
	 * is before 7 or after 20. Return true if we are in trouble.
	 */
	public static boolean parrotTrouble(boolean talking, int hour) {
		if ((hour < 7 || hour > 20) && talking == true) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Given two non-negative int values, return true if they have the same last
	 * digit, such as with 27 and 57. Note that the % "mod" operator computes
	 * remainders, so 17 % 10 is 7.
	 */
	public static boolean lastDigit(int a, int b) {
		if (a % 10 == b % 10) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Given an int n, return the absolute difference between n and 21, except
	 * return double the absolute difference if n is over 21.
	 */
	public static int diffTwentyOne(int n) {
		if (n <= 21) {
			return Math.abs(21 - n);
		} else {
			return Math.abs((n - 21) * 2);
		}
	}

	/*
	 * 
	 * Given two int values, return their sum. Unless the two values are the same,
	 * then return double their sum.
	 */
	public static int sumDouble(int a, int b) {
		if (a == b) {
			return (a + b) * 2;
		} else {
			return (a + b);
		}
	}

	/*
	 * Given 2 positive int values, return the larger value that is in the range
	 * 10..20 inclusive, or return 0 if neither is in that range.
	 */
	public static int maxTenTwenty(int a, int b) {
		if ((a >= 10 && a <= 20)) {
			if (b >= 10 && b <= 20) {
				if (a > b) {
					return a;
				} else {
					return b;
				}
			} else {
				return a;
			}
		} else if (b >= 10 && b <= 20) {
			return b;
		} 
		return 0;
	}

	/*
	 * Given 2 int values, return whichever value is nearest to the value 10, or
	 * return 0 in the event of a tie. Note that Math.abs(n) returns the absolute
	 * value of a number.
	 */
	public static int closeTen(int a, int b) {
		if (Math.abs(a - 10) < Math.abs(b - 10)) {
			return a;
		} else if (Math.abs(b - 10) < Math.abs(a - 10)) {
			return b;
		} else {
			return 0;
		}
	}

	/*
	 * 
	 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
	 * Given 2 int values, return true if one or the other is teen, but not both.
	 */
	public static boolean loneTeen(int a, int b) {
		if ((a >= 13 && a <= 19) && (b >= 13 && a <= 19)) {
			return false;
		} else if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * 
	 * Given two temperatures, return true if one is less than 0 and the other is
	 * greater than 100.
	 */
	public static boolean icyHot(int temp1, int temp2) {
		if (temp1 < 0 && temp2 > 100) {
			return true;
		} else if (temp2 < 0 && temp1 > 100) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * 
	 * Return true if the given non-negative number is a multiple of 3 or a multiple
	 * of 5. Use the % "mod" operator -- see Introduction to Mod
	 */
	public static boolean threeOrFive(int n) {
		if (n % 3 == 0 || n % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * 
	 * Given 2 int values, return true if one is negative and one is positive.
	 * Except if the parameter "negative" is true, then return true only if both are
	 * negative.
	 */
	public static boolean posNeg(int a, int b, boolean negative) {
		if (negative == true) {
			if (a < 0 && b < 0) {
				return true;
			} else {
				return false;
			}
		} else if (a < 0 && b > 0) {
			return true;
		} else if (a > 0 && b < 0) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * 
	 * Given an int n, return true if it is within 10 of 100 or 200. Note:
	 * Math.abs(num) computes the absolute value of a number.
	 */
	public static boolean nearHundred(int n) {
		if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// All of the following below are examples on how to call the methods above
		// In order to test to see what a method does.. you have to change the below
		// lines to reflect it
		System.out.println("sleepIn(false,false) --> " + sleepIn(false, false));
		System.out.println("monkeyTrouble(true, true) --> " + monkeyTrouble(true, true));
		System.out.println("pparrotTrouble(true, 7) --> " + parrotTrouble(true, 7));
		System.out.println("lastDigit(7, 17)--> " + lastDigit(7, 17));
		System.out.println("diffTwentyOne(19) --> " + diffTwentyOne(19));
		System.out.println("sumDouble(1, 2) --> " + sumDouble(1, 2));
		System.out.println("maxTenTwenty(11, 19) --> " + maxTenTwenty(11, 19));
		System.out.println("closeTen(8, 13) --> " + closeTen(8, 13));
		System.out.println("loneTeen(8, 13) --> " + loneTeen(8, 13));
		System.out.println("icyHot(120, -1) --> " + icyHot(120, -1));
		System.out.println("threeOrFive(3) --> " + threeOrFive(3));
		System.out.println("posNeg(1, -1, false) --> " + posNeg(1, -1, false));
		System.out.println("nearHundred(3) --> " + nearHundred(3));

	}
}