/*
Name: Owen Zhang
Block: D
Program: PA17
Date: 9/27/21
*/

import java.util.Scanner;

public class PA17 {
	
	public static void main(String[] args) {
		//Needed Variables - Do not touch.
		Maze maze;
		int mazeWidth;
		int mazeHeight;
		
		// Create maze  - Do not touch.
		System.out.print("Enter the maze number: ");
		Scanner scan = new Scanner(System.in);
		int fileNumber = scan.nextInt();
		String fileName="Maze"+fileNumber+".txt";
		System.err.println("Maze name: " + fileName);

		// Get dimensions  - Do not touch.
		maze = new Maze(fileName);
		mazeWidth = maze.getWidth();
		mazeHeight = maze.getHeight();
		System.err.println("Maze width: " + mazeWidth);
		System.err.println("Maze height: " + mazeHeight);

		// Add code to move around maze
		
		while(maze.foundGary()==false) {		
			while(maze.getRow()!= 0) {
				maze.moveUp();
				if(maze.foundGary() == true)
					System.exit(0);
				continue;
			}
			while(maze.getColumn() != 0) {
				maze.moveLeft();
				if(maze.foundGary() == true)
					System.exit(0);
				continue;
			}
			while(maze.getRow() != (maze.getHeight()-1)) {
				maze.moveDown();
				if(maze.foundGary() == true)
					System.exit(0);
				continue;
			}
			while(maze.getColumn() != (maze.getWidth()-1)) {
				maze.moveRight();
				if(maze.foundGary() == true)
					System.exit(0);
				continue;
			}
			
		
	}
		
}
}
