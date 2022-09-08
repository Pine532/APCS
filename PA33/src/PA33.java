/*
Name: Owen Zhang
Block: D
Program: PA33
Date: 2/18/22
*/

import java.util.Arrays;

public class PA33 {

	/**
	 * Implementation of the Binary Search algorithm.
	 *
	 * @param arr    the array being searched
	 * 
	 * @param findMe the value being searched for
	 * 
	 * @return int the index of findMe in arr, or -1 if it's not there
	 */
	public static int binarySearch(int[] arr, int findMe) {
		int left = 0;
		int right = arr.length-1;
		while (left <= right) {
			int middle = (left+right)/2;
			System.out.println("Looking at index: " + middle + ", element: " + arr[middle]);

			
			if(arr[middle] == findMe) {
				return middle;
			}
			else if(arr[middle] < findMe) {
				left = middle+1;
			}
			else if(arr[middle] > findMe) {
				right = middle-1;
			}
		}
		return -1;
	}

	/**
	 * Main Method: Do not change.
	 */
	public static void main(String[] args) {
		// 0 1 2 3 4 5
		int[] arrEven = { 2, 4, 6, 8, 10, 12 };
		int[] arrOdd = { 2, 4, 6, 8, 10 };

		printResult(arrEven, 6, 2);
		printResult(arrEven, 8, 3);
		printResult(arrEven, 2, 0);
		printResult(arrEven, 12, 5);
		printResult(arrEven, 3, -1);
		printResult(arrEven, 11, -1);
		printResult(arrEven, 15, -1);
		printResult(arrEven, 1, -1);

		printResult(arrOdd, 6, 2);
		printResult(arrOdd, 8, 3);
		printResult(arrOdd, 2, 0);
		printResult(arrOdd, 12, -1);
		printResult(arrOdd, 3, -1);
		printResult(arrOdd, 11, -1);
		printResult(arrOdd, 15, -1);
		printResult(arrOdd, 1, -1);

	}

	/**
	 * printResult Method: Do not change.
	 */
	public static void printResult(int[] arr, int target, int expected) {
		System.out.println("Searching for " + target + " in " + Arrays.toString(arr));
		int result = binarySearch(arr, target);
		System.out.println("* " + expected + " expected, " + result + " found.");
	}

}