// package Playground;

import java.util.*; 

public class ReverseString {

  public static String FirstReverse(String str) {
    // code goes here  
    String reverse = "";
    for (int i = str.length()-1; i >= 0; i--) {
      char ch = str.charAt(i);
      reverse = reverse + ch;
    }
    return reverse;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
    s.close();
  }

}
