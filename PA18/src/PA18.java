/*
Name: Owen Zhang
Block: D
Program: PA18
Date: 10/1/21
*/

//All of the imports
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class PA18 {
  //Print the elements in the array, starting with the first index, using a standard for loop, using a loop.
  public static void arrayExercise1(int[] array){
	  for(int i = 0; i < array.length; i++) {
		  System.out.print(array[i] + " ");
	  }
  }
  //Print the elements in the array in reverse order, using a loop.
  public static void arrayExercise2(int[] array){
      for(int i = array.length-1; i>=0; i--) {
    	  System.out.print(array[i] + " ");
      }
  }
  //Print the contents of the first half of the array, using a loop.
  public static void arrayExercise3(int[] array){
	  for(int i = 0; i < (array.length)/2; i++) {
		  System.out.print(array[i] + " ");
	  }
  }
  //Print every other element of the array (starting with the first), using a loop.
  public static void arrayExercise4(int[] array){
    for(int i = 0; i < array.length; i += 2) {
    	System.out.print(array[i] + " ");
    }
  }
  //Print the elements in the array that are less than 8, starting with the first index, a for loop.
  public static void arrayExercise5(int[] array){
	  for(int i = 0; i < array.length; i++) {
		  if(array[i]<8)
			  System.out.print(array[i] + " ");
	  }
  }
  //Print every element in the first third of the array, using a loop.
  public static void arrayExercise6(int[] array){
	  for(int i = 0; i < array.length/3; i++) {
		  System.out.print(array[i] + " ");
	  }
  }
  //Print every even element in the last third of the array, using a loop.
  public static void arrayExercise7(int[] array){
	  for(int i = (array.length/3)*2; i < array.length; i++) {
		  if(array[i]%2 == 0)
			  System.out.print(array[i] + " ");
	  }
  }
  //Display the contents of the middle third of the array, in reverse order, but only if the element is even, using a loop.
  public static void arrayExercise8(int[] array){
	  for(int i = (((array.length)/3)*2)-1; i > (array.length/3)-1; i--) {
		  if(array[i]%2 == 0)
			  System.out.print(array[i] + " ");
	  }
  }


  /*
   *****DO NOT MODIFY THE MAIN METHOD*****
   */
  public static void main(String[] args) {
    int[] array; //Makes the array.
    try {
      String fileName = "array.txt";
      // Open file
      Scanner fileReader = new Scanner(new File(fileName));
      int count = 0; //Count how many lines are in the file.
      while(fileReader.hasNextLine()){
        count++;
        fileReader.nextLine();
      }
      fileReader.close();
      fileReader = new Scanner(new File(fileName));
      array = new int[count]; //Make an array with how many lines there are in the file.
      for(int index=0; index<array.length; index++){
        array[index]=fileReader.nextInt();
      }
      // Close file
      fileReader.close();

    } catch (IOException e) {
      //If the file is not found use the example array.
      array = new int[12]; //Makes the array of size 12.
      array[0] = 5;array[1] = 6;array[2] = 7;array[3] = 8;array[4] = 9;array[5] = -2;array[6] = -3;array[7] = -4;array[8] = -5;array[9] = 8;array[10] = -9;array[11] = 10;
    }
    //Done making the array. Code after this allows student to run different arrays.
    Scanner scan = new Scanner(System.in);
    System.out.print("Which exercise would you like to run: ");
    int input = scan.nextInt();
    if(input==1){
      arrayExercise1(array);
    }
    else if(input==2){
      arrayExercise2(array);
    }
    else if(input==3){
      arrayExercise3(array);
    }
    else if(input==4){
      arrayExercise4(array);
    }
    else if(input==5){
      arrayExercise5(array);
    }
    else if(input==6){
      arrayExercise6(array);
    }
    else if(input==7){
      arrayExercise7(array);
    }
    else if(input==8){
      arrayExercise8(array);
    }
  }
}