/***Note to student - Copy and paste this file into Eclipse as PA29.java*/
/*
Name:Owen Zhang
Block:D
Program: PA29
Date:1/12/22
*/

public class PA29 {

	/**
	 * Returns a new array with the same elements but with one extra.
	 * 
	 * @param arr   is the incoming array. This will not be altered.
	 * @param pos   is the position to insert the value parameter. All other
	 *              elements will be shifted to the right
	 * @param value is the value to be inserted
	 * @return a brand new array that has the new value and all existing values.
	 */
	public static int[] insertAt(int[] arr, int pos, int value) {
		int[] newArray = new int[arr.length + 1]; //You will need to change this length.
        //Add code in here.....
		for(int i = 0; i < pos; i++) {
			newArray[i] = arr[i];
		}
		newArray[pos] = value;
		for(int i = pos; i < arr.length; i++) {
			newArray[i+1] = arr[i];
		}
        return newArray;
	}

	/**
	 * Returns a new array with the same elements but without one
	 * 
	 * @param arr is the incoming array. This will not be altered.
	 * @param pos is the position to remove. All elements afterwards are shifted
	 *            left.
	 * @return a brand new array that doesn't have the new value and all existing
	 *         values.
	 */
	public static int[] removeAt(int[] daArray, int pos) {
		int[] newArray = new int[daArray.length-1]; //You will need to change this length.
        //Add code in here.....
		for(int i = 0; i<pos; i++) {
			newArray[i] = daArray[i];
		}
		for(int i = pos; i<newArray.length; i++) {
			newArray[i] = daArray[i+1];
		}
        return newArray;
	}

	/**
	 * Shifts each element n times to the left. Elements that are shifted off the
	 * array will appear at the end.
	 * 
	 * @param array is the incoming array. This will not be altered.
	 * @param n     is the number of times the return array should be shifted. n
	 *              will always be a non-negative number and never >= array.length
	 * @return a brand new array that is shifted n times to the left from the
	 *         original.
	 */
	public static int[] shiftLeft(int[] array, int n) {
		int[] newArray = new int[array.length]; //You will need to change this length.
        //Add code in here.....
		for(int i = n; i<array.length; i++) {
			newArray[i-n] = array[i];
		}
		for(int i = 0; i<n; i++) {
			newArray[i+array.length-n] = array[i];
		}
        return newArray;
	}

	/**
	 * This is the main method of the program. The student can change it to test
	 * different inputs for their program. The main method will not be checked for
	 * accuracy.
	 * 
	 * @param args is not used
	 */
	public static void main(String[] args) {
		// insertAt tester
		int[] array1 = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };
		System.out.println("-----Before insertAt-----");
		printArray(array1);
		array1 = insertAt(array1, 3, 4);
		System.out.println("-----After insertAt-----");
		printArray(array1);

		// insertAt tester
		int[] array2 = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };
		System.out.println("-----Before removeAt-----");
		printArray(array2);
		array2 = removeAt(array2, 3);
		System.out.println("-----After removeAt-----");
		printArray(array2);

		// ShiftLeft tester
		int[] array3 = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };
		System.out.println("-----Before shiftLeft-----");
		printArray(array3);
		array3 = shiftLeft(array3, 3);
		System.out.println("-----After shiftLeft-----");
		printArray(array3);
	}

	/**
	 * This is a print array method. It prints the array. There is no need to change
	 * this method.
	 * 
	 * @param x is the array that should be printed.
	 * @return there is no return as this method prints to the console.
	 */
	public static void printArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			if (i != x.length - 1) {
				System.out.print(x[i] + ", ");
			} else {
				System.out.print(x[i]);
			}
		}
		System.out.println();
	}
}