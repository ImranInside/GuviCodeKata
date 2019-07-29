/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
      String string, str_rev = "";
      Scanner sc = new Scanner(System.in);
      string = sc.nextLine();
      for(int i = string.length() - 1; i >= 0; i--){
      	str_rev = str_rev + string.charAt(i);
      }
      if(string.equals(str_rev)){
      	System.out.println("The String is palindrome");
      }
      else{
      	System.out.println("The String is not palindrome");
      }
		
	}
}
