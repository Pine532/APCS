/*
Name:Owen Zhang
Block:D
Program: PA35
Date:2/23/22
*/

import java.util.Arrays;

public class PA35 {
	public static void sort1(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int index = i;
			while (index > 0 && temp < arr[index - 1]) {
				arr[index] = arr[index - 1];
				index--;
			}
			arr[index] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void sort2(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String temp = arr[i];
			int index = i;
			while (index > 0 && temp.compareTo(arr[index-1]) < 0) {
				arr[index] = arr[index - 1];
				index--;
			}
			arr[index] = temp;
			System.out.println(Arrays.toString(arr));
		}     
	}

	public static void sort3(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int index = i;
			while (index > 0 && temp > arr[index - 1]) {
				arr[index] = arr[index - 1];
				index--;
			}
			arr[index] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void sort4(Lego[] arr) {
		for (int i = 1; i < arr.length; i++) {
			Lego temp = arr[i];
			int index = i;
			while (index > 0 && temp.getColor().compareTo(arr[index-1].getColor()) < 0) {
				arr[index] = arr[index - 1];
				index--;
			}
			arr[index] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		// TEST sort1
		
		int[] arr1 = { 5, 2, 7, 8, 9, 3 };
		sort1(arr1);
		System.out.println("sort1: " + Arrays.toString(arr1));
		
        /*
		// TEST sort2
		String[] arr2 = { "f", "e", "a", "c", "e", "b" };
		sort2(arr2);
		System.out.println("sort2: " + Arrays.toString(arr2));
        */
        /*
		// TEST sort3
		int[] arr3 = { 5, 2, 7, 8, 7, 3 };
		sort3(arr3);
		System.out.println("sort3: " + Arrays.toString(arr3));
        */
		/*
        // TEST sort4
		Lego[] arr4 = { new Lego("red", 8), new Lego("yellow", 6), new Lego("blue", 2), new Lego("black", 3), new Lego("blue", 2) };
		sort4(arr4);
		System.out.println("sort4: " + Arrays.toString(arr4));
        */
		
	}
}