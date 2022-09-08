/*
Name: Owen Zhang
Block: D
Program: PA14
Date: 9/15/21
*/


public class PA14 {
  //Do ***NOT*** edit this code outside the Main method!
  public static void emptyLine(){
    System.out.println("");
  }
  public static void verse1(){
    System.out.println("The little one stops to suck his thumb");
  }
  public static void verse2(){
    System.out.println("And they all go marching down to the ground");
  }
  public static void verse3(){
    System.out.println("The little one stops to climb a tree");
  }
  public static void endVerse(){
    System.out.println("And they all go marching down.. to the ground..");
    System.out.println("to get out.. of the rain.. boom, boom, boom.");
  }
  public static void chorus(int n){
    System.out.println("The ants go marching "+n+" by "+n+", hurrah, hurrah");
    System.out.println("The ants go marching "+n+" by "+n+", hurrah, hurrah");
    System.out.println("The ants go marching "+n+" by "+n);
  }
  public static void main(String[] args) {
    //ALL OF YOUR CODE SHOULD GO HERE!!!
    //You should be calling the methods above WITHOUT altering them!
	  chorus(1);
	  verse1();
	  endVerse();
	  emptyLine();
	  chorus(2);
	  verse2();
	  endVerse();
	  emptyLine();
	  chorus(3);
	  verse3();
	  endVerse();
	  


  }
}