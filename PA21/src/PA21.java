/***Note to student - Copy and paste this file into Eclipse as PA21.java*/
/*
Name:Owen Zhang
Block: D
Program: PA21
Date: 10/22/21
*/

class PA21 {

  /*
   * Print a 2D array such that a 2D array holding incremental numbers prints like:
   * 1, 2, 3
   * 4, 5, 6
   * 7, 8, 9
   * This method returns nothing because you are printing the array.
   */
  public static void printArray(int[][] array){
	  for(int row = 0; row < array.length ; row++) {
	    	for(int col = 0; col < array[0].length; col++) {
	    		System.out.print(array[row][col]);
	    		if(col < array.length-1) {
	    			System.out.print(", ");
	    		}
	    	}
	    	System.out.println(" ");
	    }
  }

  /*
   * Write a method that returns a portion of a 2D array based on a specified row and col. 
   * See the Google Doc for an example.
   */
  public static int[][] split(int[][] arr, int rows, int cols){
    int[][] resultArray = new int[rows+1][cols+1];
    for(int row = 0; row <= rows; row++) {
    	for(int col = 0; col <= cols; col++) {
    		resultArray[row][col] = arr[row][col];
    	}
    	
    }
    return resultArray;
  }

  /*
   * Write a method that inverts a 2D array. Inverting a 2D array means that each row of the 2D array is now a column, and each column is now a row.
   * See the Google Doc for an example.
   */
  public static int[][] invert(int[][] arr){
    int[][] resultArray = new int[arr[0].length][arr.length];
  	  for(int row = 0; row < arr.length ; row++) {
  	    	for(int col = 0; col < arr[0].length; col++) {
  	    		resultArray[col][row] = arr[row][col];
  	    		}
  	    	}
  	return resultArray;
  	    }
  

  /*
   * Write a method that takes a 2D array and reverses all of the content in the 2D array. The last value should be the first, and the first value should be the last.
   * See the Google Doc for an example.
   */
  public static int[][] reverse(int[][] arr){
    int[][] resultArray = new int[arr.length][arr[0].length];
    for(int row = 0; row < arr.length; row++) {
    	for(int col = 0; col < arr[0].length; col++) {
    		resultArray[arr.length-1-row][arr[0].length-1-col] = arr[row][col];
    		
    		}
    	}
    
    return resultArray; 
  }


  public static void main(String[] args) {
    //Step 1: Make any 2D called anything you want on the line below with any number of rows and columns. Put whatever numbers you want in it.
    int[][] wad = {{3,4,5}, {3,6,8},{1,8,3}};
    //Step 2: Copy and paste your code from the printMatrix() method from PA20. Change the code so it will work.
    for(int row = 0; row < wad.length ; row++) {
    	for(int col = 0; col < wad[0].length; col++) {
    		System.out.print(wad[row][col]);
    		if(col < wad.length-1) {
    			System.out.print(", ");
    		}
    	}
    	System.out.println(" ");
    }    
    //Then call printArray() below using your array above just to make sure it works!
    printArray(wad);
    //Step 3: Print a line full of dashes below. This will help you later when you look through your code.
    System.out.println("----------");
    //Step 4: Finish coding the "split()" method above. When you are finished, call it and print the array it returns below to test if it works.
    
    //Step 5: Print a line full of dashes below. This will help you later when you look through your code.
    
    //Step 6: Finish coding the "invert()" method above. When you are finished, call it and print the array it returns below to test if it works.
    
    //Step 7: Print a line full of dashes below. This will help you later when you look through your code.
    
    //Step 8: Finish coding the "reverse()" method above. When you are finished, call it and print the array it returns below to test if it works.
    
  }
}