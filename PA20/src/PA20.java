/*
Name:Owen Zhang
Block:D
Program: PA20
Date:20/10/21
*/

public class PA20 {

  /*
   * Print a 2D array such that a 2D array holding incremental numbers prints like:
   * 1, 2, 3
   * 4, 5, 6
   * 7, 8, 9
   * This method returns nothing because you are printing the matrix.
   */
  public static void printMatrix(int[][] matrix){
    for(int row = 0; row < matrix.length ; row++) {
    	for(int col = 0; col < matrix[0].length; col++) {
    		System.out.print(matrix[row][col]);
    		if(row < matrix.length) {
    			System.out.print(", ");
    		}
    	}
    	System.out.println(" ");
    }
  }

  /*
   * Return an integer of how many elements are in the same position in the 2D arrays.
   * Assume that both array's sizes are the same.
   */
  public static int sameElements(int[][] array1, int[][] array2){
	  int equal = 0;
	  for(int row = 0; row < array1.length ; row++) {
	    	for(int col = 0; col < array1[0].length; col++) {
	    		if(array1[row][col] == array2[row][col]) {
	    			equal++;
	    		}
	    	}
	    		    	
	    		
	    	}
	  return equal;
  }

  /*
   * Return a 2D array that are array1+array2 as if they were matrices. 
   * Assume that both array's sizes are the same.
   */
  public static int[][] addMatrix(int[][] array1, int[][] array2){
    int[][] resultArray = new int[array1.length][array1[0].length];
    for(int row = 0; row < array1.length ; row++) {
    	for(int col = 0; col < array1[0].length; col++) {
    		resultArray[row][col] = array1[row][col] + array2[row][col];
    	}
    		
    	}
    return resultArray;
  }

  /*
   * Return a 2D array that are array1-array2 as if they were matrices. 
   * Assume that both array's sizes are the same.
   */
  public static int[][] subtractMatrix(int[][] array1, int[][] array2){
    int[][] resultArray = new int[array1.length][array1[0].length];
    for(int row = 0; row < array1.length ; row++) {
    	for(int col = 0; col < array1[0].length; col++) {
    		resultArray[row][col] = array1[row][col] - array2[row][col];
    	}
    		
    	}
    return resultArray;
  }

  public static void main(String[] args) {
    //Step 1: Make any 2D called "matrix1" on the line below with 3 rows and 3 columns. Put whatever numbers you want in it.
    int[][] matrix1 = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
    //Step 2: Finish the "printMartix()" method and then print "matrix1" by calling printMatrix(matrix1) below.
    printMatrix(matrix1);
    //Step 3: Print a line full of dashes below. This will help you later when you look through your code.
    System.out.println("------");
    //Step 4: Make another 2D array called "matrix2" on the line below with 3 rows and 3 columns. Put whatever numbers you want in it.
    int[][] matrix2 = {{1,2,8}, {7,8,1}, {7, 3, 9}};
    //Step 5: Print the "matrix2" array using your "printMatrix" array method on the line below.
    printMatrix(matrix2);
    //Step 6: Print a line full of dashes below. This will help you later when you look through your code.
    System.out.println("------");
    //Step 7: Make an integer called "same" on the line below.
    int same;
    //Step 8: Set "same" to be equal to the "sameElements()" method by using the matrices in the arguments.
    same = sameElements(matrix1, matrix2);
    //Step 9: Print how many elements are the same to the console on the line below.
    System.out.println(same);
    //Step 10: Print a line full of dashes below. This will help you later when you look through your code.
    System.out.println("------");
    //Step 11: Make a blank 2D array called "addResult" on the line below.
    int[][] addResult;
    //Step 12: Finish the "addMatrix()" method and then set "addResult" to equal the "addMatrix()"" and put the matrices in for the arguments on the line below.
    addResult = addMatrix(matrix1, matrix2);
    //Step 13: Print the "addResult" using the "printMatrix" array on the line below.
    printMatrix(addResult);
    //Step 14: Print a line full of dashes below. This will help you later when you look through your code.
    System.out.println("------");
    //Step 15: Make a blank 2D array called "subResult" on the line below.
    int[][] subResult;
    //Step 16: Finish the "subtractMatrix()" method and then set "subResult" to equal the "subtractMatrix()" method and put the matrices in for the arguments on the line below.
    subResult = subtractMatrix(matrix1, matrix2);
    //Step 17: Print the "subResult" using the "printMatrix" array on the line below.
    printMatrix(subResult);
    //Step 18: Print a line full of dashes below. This will help you later when you look through your code.
    System.out.println("------");
    //Step 19: Try other matrices by changing the numbers in matrix1 and matrix2
    //Step 20: Turn in PA20!
  }
}