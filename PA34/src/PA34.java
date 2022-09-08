/*
Name: Owen Zhang
Block: D
Program: PA34
Date: 2/18/22
*/

import java.util.Arrays;

public class PA34 {
	public static void sort1(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[smallest]) {
					smallest = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void sort2(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j].compareTo(arr[smallest]) < 0) {
					smallest = j;
				}
			}

			String temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}
	}

	public static void sort3(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int largest = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] > arr[largest]) {
					largest = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
		}
	}

	public static void sort4(Lego[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j].getColor().compareTo(arr[smallest].getColor()) < 0) {
					smallest = j;
				}
			}

			Lego temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}
	}

	public static void main(String[] args) {
		// TEST sort1
		/*
		int[] arr1 = { 5, 2, 7, 8, 9, 3 };
		sort1(arr1);
		System.out.println("sort1: " + Arrays.toString(arr1));
		*/
        /*
		// TEST sort2
		String[] arr2 = { "f", "e", "a", "c", "e", "b" };
		sort2(arr2);
		System.out.println("sort2: " + Arrays.toString(arr2));
		*/
        
        
		// TEST sort3
		/*
		int[] arr3 = { 5, 2, 7, 8, 7, 3 };
		sort3(arr3);
		System.out.println("sort3: " + Arrays.toString(arr3));
		*/
		
        
		
        // TEST sort4
		Lego[] arr4 = { new Lego("red", 8), new Lego("yellow", 6), new Lego("blue", 2), new Lego("black", 3), new Lego("blue", 2) };
		sort4(arr4);
		System.out.println("sort4: " + Arrays.toString(arr4));
        
	}
}