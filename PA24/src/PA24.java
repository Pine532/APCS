/***Note to student - Copy and paste this file into Eclipse as PA24.java*/
/*
Name:Owen Zhang
Block:D
Program: PA24
Date:11/30/21
*/

class PA24 {

  
  /*
   * This method should return the string number WITHOUT
   * spaces " ", hyphens "-", periods "." and parenthesis "(" and ")" in the string.
   */
  public static String removeSpecial(String str){
	  String number = "";
	  for(int i = 0; i<str.length(); i++) {
		  if(str.substring(i,i+1).equals(" ") || str.substring(i,i+1).equals("-") || str.substring(i,i+1).equals(".") || str.substring(i,i+1).equals("(") || str.substring(i,i+1).equals(")")) {
			  continue;
		  }else {
			  number = number + str.substring(i,i+1);
		  }
	  }
    return number;
  }
  /*
   * This method should return true if the string has only numbers in it.
   * It should return false if it has any other character.
   */
  public static boolean checkIfOnlyNums(String daString){
	  int count = 0;
	  for(int i = 0; i<daString.length(); i++) {
		  if(!(daString.substring(i,i+1).equals("0") || daString.substring(i,i+1).equals("1") || daString.substring(i,i+1).equals("2") || daString.substring(i,i+1).equals("3") || daString.substring(i,i+1).equals("4") || daString.substring(i,i+1).equals("5") || daString.substring(i,i+1).equals("6") || daString.substring(i,i+1).equals("7") || daString.substring(i,i+1).equals("8") || daString.substring(i,i+1).equals("9"))) {
			  count++;
		  }
	  }
	  if(count == 0) {
		  return true;
	  }else {
		  return false;		  
	  }
  }
  /*
   * This method should use the removeSpecial() and checkIfOnlyNums() methods to help determine
   * if the parameter given is a valid number. If it is a valid number, return true.
   * Otherwise, return false.
   */
  public static boolean isValidPhoneNumber(String number){
	  int count = 0;
	  for(int i = 0; i<number.length(); i++) {
	  if(number.substring(i,i+1).equals("0") || number.substring(i,i+1).equals("1") || number.substring(i,i+1).equals("2") || number.substring(i,i+1).equals("3") || number.substring(i,i+1).equals("4") || number.substring(i,i+1).equals("5") || number.substring(i,i+1).equals("6") || number.substring(i,i+1).equals("7") || number.substring(i,i+1).equals("8") || number.substring(i,i+1).equals("9")) {
		  count++;
		  }
	  }
	  if(number.substring(0,1).equals("1")) {
		  return false;
	  }else if(number.substring(3,4).equals("1")) {
		  return false;
	  }else if(number.substring(5,7).equals("11")) {
		  return false;
	  }else if(number.substring(6,7).equals("a")) {
		  return false;
	  }
	  else if(count == 10) {
		  return true;
	  }else {
		  return false;
	  }
  }
  
  /*
   * Main method. It starts blank. You can create Strings and 
   * test your code here if you would like by calling each method 
   * and printing out to the console.
   */
  public static void main(String[] args) {

  }
}