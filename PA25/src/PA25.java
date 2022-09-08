/***Note to student - Copy and paste this file into Eclipse as PA25.java*/
/*
Name:Owen Zhang
Block:D
Program: PA25
Date:12/10/21
*/ 

class PA25 {

  
  /*
   * This method should return the String "word" but in Pig Latin.
   */
  public static String pigLatin(String word){
	  String pigLatin = "";
	  pigLatin = word;
	  if(word.substring(0,1).equals("a")||word.substring(0,1).equals("e")|| word.substring(0,1).equals("i")|| word.substring(0,1).equals("o")|| word.substring(0,1).equals("u")||word.substring(0,1).equals("A")||word.substring(0,1).equals("E")||word.substring(0,1).equals("I")|| word.substring(0,1).equals("O")|| word.substring(0,1).equals("U") || word.substring(0,1).equals("1")) {
		  return word + "-way";
	  }else if(!(word.substring(0,1).equals("a")||word.substring(0,1).equals("e")|| word.substring(0,1).equals("i")|| word.substring(0,1).equals("o")|| word.substring(0,1).equals("u")||word.substring(0,1).equals("A")||word.substring(0,1).equals("E")||word.substring(0,1).equals("I")|| word.substring(0,1).equals("O")|| word.substring(0,1).equals("U"))) {
		  pigLatin += "-";
		  while(!(pigLatin.substring(0,1).equals("a") || pigLatin.substring(0,1).equals("e") || pigLatin.substring(0,1).equals("i") || pigLatin.substring(0,1).equals("o") || pigLatin.substring(0,1).equals("u") || pigLatin.substring(0,1).equals("A") || pigLatin.substring(0,1).equals("E") || pigLatin.substring(0,1).equals("I") || pigLatin.substring(0,1).equals("O") || pigLatin.substring(0,1).equals("U") || pigLatin.substring(0,1).equals("y") || pigLatin.substring(0,1).equals("Y"))) {
			  	pigLatin = pigLatin.substring(1) + pigLatin.substring(0,1);
	}
			  pigLatin += "ay";
			  }
	  return pigLatin;
		  }
  

  /*
   * Main method. It starts blank. You can create Strings and 
   * test your code here if you would like by calling each method 
   * and printing out to the console.
   */
  public static void main(String[] args) {
    String english = "eye";
    String pigLatin = pigLatin(english);
    System.out.println(pigLatin);
  }
}