/***Note to student - Copy and paste this file into Eclipse as PA23.java*/
/*
Name:Owen Zhang
Block:D
Program: PA23
Date:11/10/21
*/

class PA23 {

  /*
   * Given two strings, a and b, return the result of putting them 
   * together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
   */
  public static String makeAbba(String a, String b) {
    return a + b + b + a; 
  }

  /*
   * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as
   * italic text. In this example, the "i" tag makes <i> and </i> which 
   * surround the word "Yay". Given tag and word strings, create the HTML 
   * string with tags around the word, e.g. "<i>Yay</i>".
   */
  public static String makeTags(String tag, String word) {
    return "<" + tag + ">" + word + "</" + tag + ">"; 
  }

  /*
   * Given 2 strings, a and b, return a string of the form short+long+short, 
   * with the shorter string on the outside and the longer string on the 
   * inside. The strings will not be the same length, but they may be 
   * empty (length 0).
   */
  public static String comboString(String a, String b) {
    if (a.length() > b.length()) {
    	return b+a+b;
    } else 
    	return a+b+a;
  }

  /*
   * Given a string, return a string length 2 made of its first 2 chars. 
   * If the string length is less than 2, use '@' for the missing chars.
   */
  public static String atFirst(String str) {
    if(str.length() >= 2) {
    	return str.substring(0,2);
    }else {
    	while(str.length()<2) {
    		str += "@";
    	}
    	return str;
    }
  }

  /* 
   * Given a string, return true if the first 2 chars in the string also 
   * appear at the end of the string, such as with "edited". Return
   * false if sting is not longer than 2 characters.
   */
  public static boolean frontAgain(String str) {
	  if(str.length()<2) {
		  return false;
	  }
    if(str.substring(0,2).equals(str.substring(str.length()-2, str.length()))){
    	return true;
    	
    }else
    	return false;
  }

  /*
   * Given a string, if a length 2 substring appears at both its 
   * beginning and end, return a string without the substring at 
   * the beginning, so "HelloHe" yields "lloHe". The substring may 
   * overlap with itself, so "Hi" yields "". Otherwise, return
   * the original string unchanged.
   */
  public static String without2(String str) {
	  if(str.length() < 2) {
		  return str;
	  }
	  if(str.substring(0,2).equals(str.substring(str.length()-2, str.length()))){
		  return str.substring(2,str.length());
	  }else
		  return str;
  }

  /*
   * Given a string, return a string where for every char in 
   * the original, there are two chars. Yes, you will need a loop
   * for this and the rest of this programming assignment
   */
  public static String doubleChar(String str) {
	String newStr = "";
    for(int i = 0; i<str.length(); i++) {
    	newStr += str.substring(i,i+1) + str.substring(i,i+1);
    }
    return newStr;
  }

  /*
   * Return the number of times that the string "hi" appears 
   * anywhere in the given string.
   */
  public static int countHi(String str) {
	  int count = 0;
	  for(int i = 0; i<str.length()-1; i++) {
		  if(str.substring(i,i+2).equals("hi")) {
			  count++;
		  }
	  }
    return count; //Remove this line when you start to code this method.
  }

  /*
   * Main method. It starts out next to blank. You can create Strings and 
   * test your code here if you would like by calling each method 
   * and printing out to the console. An example of using makeAbba()
   * is provided for you.
   */
  public static void main(String[] args) {
    String a = "Hi"; //Makes a String called "a"
    String b = "Bye"; //Makes a String called "b"
    String c = makeAbba(a,b); //Makes a String called "c" and sets it to the result of makeAbba();
    System.out.println("makeAbba prints: "+c); //Prints the value of c
    //You should test your other code here like how Menghini did above!
    
    
  }
}