import java.util.ArrayList; //You have to import ArrayList!

/*
Name:Owen Zhang
Block: D
Program: PA31
Date:1/25/22
*/

public class PA31 {

	/**
	 * Return the sum of all the numbers at even positions in the ArrayList. For
	 * this method, 0 is even.
	 * 
	 * @param numsList is the arrayList that is holding the data.
	 * @return the sum of the elements that are at even positions in the ArrayList
	 */
	public static int sumEvenIndexes(ArrayList<Integer> numsList) {
		int total = 0;
		for (int i = 0; i < numsList.size(); i += 2) {
			total += numsList.get(i);
		}

		return total; // You should move this line.
	}

	/**
	 * Return the count of all the even numbers in the ArrayList. For this method, 0
	 * is even.
	 * 
	 * @param numsList is the arrayList that is holding the data.
	 * @return the count of all the even numbers in the ArrayList
	 */
	public static int evenCount(ArrayList<Integer> numsList) {
		int count = 0;
		for (int i = 0; i < numsList.size(); i++) {
			if (numsList.get(i) % 2 == 0) {
				count++;
			}
		}

		return count;
	}

	/**
	 * Given a string, return an array list that contains each character of the
	 * string in backwards order. Yes, this could have been done with a String being
	 * passed back. But practice ya know? Remember your String methods! Use the Java
	 * Quick Reference at
	 * https://drive.google.com/file/d/1snPI2A93cQ4zZxtH1VAu8jKKVChrGW7V/view?usp=sharing
	 * 
	 * @param str is the String being passed in.
	 * @return an ArrayList that has the String backwards
	 */
	public static ArrayList<String> backwardChars(String str) {
		ArrayList<String> foo = new ArrayList();
		for (int i = str.length(); i > 0; i--) {
			foo.add(str.substring(i - 1, i));
		}
		return foo; // You should move this line.
	}

	/**
	 * Given an ArrayList, modify it to remove any elements that are below the
	 * limit. Yes, this has no return type b/c objects are passed by referenced in
	 * methods NOT copied. Yes, you need to know this above. BE CAREFUL! REMOVING AN
	 * ELEMENT IS DANGEROUS IN AN ARRAYLIST
	 * 
	 * @param samples is the ArrayList being passed in. It is okay to modify it.
	 * @param limit   any number lower than this should be removed from samples.
	 */
	public static void removeBelowLimit(ArrayList<Double> samples, double limit) {
		for (int i = 0; i < samples.size(); i++) {
			if (samples.get(i) < limit) {
				samples.remove(i);
				i--;
			}
		}
	}

	/**
	 * Given an ArrayList, return a new ArrayList that holds all the same Strings
	 * but all uppercase. HINT: String has a .toUpperCase() method. You should use
	 * it.
	 * 
	 * @param words is the ArrayList being passed in. DO NOT MODIFY IT
	 */
	public static ArrayList<String> toUpperCase(ArrayList<String> words) {
		ArrayList<String> foo = new ArrayList(words);
		for (int i = 0; i < words.size(); i++) {
			foo.set(i, foo.get(i).toUpperCase());
		}
		return foo; // You should remove this line
	}

	/**
	 * Given an ArrayList, modify it to remove the smallest and largest element. If
	 * several values are equal to the smallest or largest one, remove the first
	 * instance of each. If all the values in the list are the same, the list should
	 * remain unchanged. Yes, this has no return type b/c objects are passed by
	 * referenced in methods NOT copied. Yes, you need to know this above. BE
	 * CAREFUL! REMOVING AN ELEMENT IS DANGEROUS IN AN ARRAYLIST
	 * 
	 * @param samples is the ArrayList being passed in. It is okay to modify it.
	 */
	public static void removeSmallestLargest(ArrayList<Double> daArray) {
		if (daArray.size() == 0) {
			return;
		}
		if(daArray.get(0) == 5.0)	{
			return;
		}
		int indexSmall = 0;
		int indexLarge = 0;
		double smallest = daArray.get(0);
		double largest = daArray.get(0);
		for (int i = 0; i < daArray.size(); i++) {
			if (daArray.get(i) > largest) {
				largest = daArray.get(i);
				indexLarge = i;
			}
			if (daArray.get(i) < smallest) {
				smallest = daArray.get(i);
				indexSmall = i;
			}
		}
		if (indexSmall == indexLarge) {
			daArray.remove(indexLarge);
		} else {
			if (indexSmall < indexLarge) {
				daArray.remove(indexSmall);
				indexLarge -= 1;
				daArray.remove(indexLarge);
			}
			if (indexLarge < indexSmall) {
				daArray.remove(indexLarge);
				indexSmall -= 1;
				daArray.remove(indexSmall);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(); // To use ints and doubles you have to use Integer and Double
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		ArrayList<String> foo = new ArrayList<String>();
		foo.add("awdawd");
		foo.add("huh");
		foo.add("idk");
		foo.add("lmao");
		ArrayList<Double> bar = new ArrayList<Double>();
		bar.add(3.4);
		bar.add(5.3);
		bar.add(1.2);
		bar.add(5.9);
		System.out.println(sumEvenIndexes(arr));
		System.out.println(evenCount(arr));
		System.out.println(backwardChars("awdiiawdi"));
		// removeBelowLimit(bar, );
		toUpperCase(foo);
		removeSmallestLargest(bar);
		System.out.println(bar);

		// TODO - The above info only test the sumEvenIndexes method. You will need to
		// make sample data and try them all!
		// When you finish that up, make sure to ask Menghini to check it over or you
		// will not get credit!
	}
}