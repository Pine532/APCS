/***Note to student - Copy and paste this file into Eclipse as PA22.java*/
/*
Name:Owen Zhang
Block:D
Program: PA22
Date:10/27/21
*/

import java.util.*;
import java.io.*;
import java.awt.*;

public class PA22 {

	public static void main(String[] args) throws Exception {

		// construct DrawingPanel, and get its Graphics context
		DrawingPanel panel = new DrawingPanel(844, 480); // DO NOT EDIT THIS LINE
		Graphics g = panel.getGraphics(); // DO NOT EDIT THIS LINE

		// Test Step 1 - construct mountain map data
		Scanner S = new Scanner(new File("Colorado.dat")); // DO NOT EDIT THIS LINE
		int[][] grid = read(S, 480, 844); // DO NOT EDIT THIS LINE

		// Test Step 2 - min, max
		int min = findMinValue(grid); // DO NOT EDIT THIS LINE
		System.out.println("Min value in map: " + min); // DO NOT EDIT THIS LINE

		int max = findMaxValue(grid); // DO NOT EDIT THIS LINE
		System.out.println("Max value in map: " + max); // DO NOT EDIT THIS LINE

		// Test Step 3 - draw the map
		drawMap(g, grid); // DO NOT EDIT THIS LINE

		// Test Step 4 - draw a greedy path
		// You CAN edit the line below this one.
		int startingRow = 226; // This is the row that you will be starting at.
		// You should choose a number between 50 and 400, default is 226
		// You CAN edit the line above this one.
		int totalChange = drawLowestElevPath(g, grid, startingRow); // DO NOT EDIT THIS LINE
		System.out.println("Lowest-Elevation-Change Path starting at row " + startingRow + " gives total change of: "
				+ totalChange); // DO NOT EDIT THIS LINE

	}

	/**
	 * @param scan    a Scanner instantiated and pointing at a file
	 * @param numRows the number of rows represented in the file
	 * @param numCols the number of cols represented in the file
	 * @return a 2D array (rows x cols) of the data from the file read
	 */
	public static int[][] read(Scanner scan, int numRows, int numCols) {
		// Hint, "scan.nextInt()" will read the next integer in the file.
		// For instance, "int x = scan.nextInt()" will read the next number in the file
		// and assign it to x
		int[][] grid = new int[numRows][numCols];

		// your code
		for (int rows = 0; rows < numRows; rows++) {
			for (int col = 0; col < numCols; col++) {
				grid[rows][col] = scan.nextInt();
			}
		}
		return grid;
	}

	/**
	 * @param grid a 2D array from which you want to find the smallest value
	 * @return the smallest value in the given 2D array
	 */
	public static int findMinValue(int[][] grid) {
		int min = grid[0][0];
		for(int row = 0; row < grid.length; row++) {
			for(int col = 0; col < grid[0].length; col++) {
				if(grid[row][col]<min) {
					min = grid[row][col];
				}
			}
		}

		return min; // Delete or change this

	}

	/**
	 * @param grid a 2D array from which you want to find the largest value
	 * @return the largest value in the given 2D array
	 */
	public static int findMaxValue(int[][] grid) {
		int max = grid[0][0];
		for(int row = 0; row < grid.length; row++) {
			for(int col = 0; col < grid[0].length; col++) {
				if(grid[row][col]>max) {
					max = grid[row][col];
				}
			}
		}

		return max;

	}

	/**
	 * Given a 2D array of elevation data create a image of size rows x cols,
	 * drawing a 1x1 rectangle for each value in the array whose color is set to a a
	 * scaled gray value (0-255). Note: to scale the values in the array to 0-255
	 * you must find the min and max values in the original data first.
	 * 
	 * @param g    a Graphics context to use
	 * @param grid a 2D array of the data
	 */
	public static void drawMap(Graphics g, int[][] grid) {
		// This method returns nothing. You just need to draw by looping through the
		// grid array and doing some math
		int minVal = findMinValue(grid);
		int maxVal = findMaxValue(grid);
		int[][] newMap = new int[grid.length][grid[0].length];
		for(int row = 0; row<grid.length; row++) {
			for(int col = 0; col<grid[0].length; col++) {
				newMap[row][col] = ((grid[row][col] - minVal) * (255 - 0)) / (maxVal - minVal);
				int newValue = newMap[row][col];
						g.setColor(new Color(newValue, newValue, newValue));
						g.fillRect(col,row,1,1);


			}
		}

	}

	/**
	 * Find the minimum elevation-change route from West-to-East in the given grid,
	 * from the given starting row, and draw it using the given graphics context
	 * 
	 * @param g    - the graphics context to use
	 * @param grid - the 2D array of elevation values
	 * @param row  - the starting row for traversing to find the min path
	 * @return total elevation of the route
	 */
	public static int drawLowestElevPath(Graphics g, int[][] grid, int row) {
		g.setColor(Color.RED); // Changes the color to red. Do not remove this line.

		// Your code goes here
		int up = 0;
		int right = 0;
		int down = 0;
		int totalChange = 0;
		int currentRow = row;
		
		for (int col = 0; col < grid[0].length-1; col++) {
			if((currentRow + 1)>grid.length) {
				up = Math.abs(grid[currentRow-1][col+1]-grid[currentRow][col]);
				right = Math.abs(grid [currentRow][col+1]-grid[currentRow][col]);
			}if(currentRow-1<0) {
				right = Math.abs(grid [currentRow][col+1]-grid[currentRow][col]);
				down = Math.abs(grid[currentRow+1][col+1] - grid[currentRow][col]);
			}else {
				up = Math.abs(grid[currentRow-1][col+1]-grid[currentRow][col]);
				right = Math.abs(grid [currentRow][col+1]-grid[currentRow][col]);
				down = Math.abs(grid[currentRow+1][col+1] - grid[currentRow][col]);
				
			}if(up == down && down < right) {
				currentRow+=1;
				 g.fillRect(col+1, currentRow, 1, 1);
				 totalChange += down;
			}else if(up == right && right < down) {
				 g.fillRect(col+1, currentRow, 1, 1);
				 totalChange += right;
			}else if(right == down && down < up) {
				 g.fillRect(col+1, currentRow, 1, 1);
				 totalChange += right;
			}
			else if(up < right && up < down) {
				 currentRow -= 1;
				 g.fillRect(col+1, currentRow, 1, 1);
				 totalChange += up;
			}else if(right < up && right < down) {
				 g.fillRect(col+1, currentRow, 1, 1);
				 totalChange += right;
			}else if(down < right && down < up) {
				 currentRow += 1;
				 g.fillRect(col+1, currentRow, 1, 1);
				 totalChange += down;
			}
		}
		return totalChange;
	}
}