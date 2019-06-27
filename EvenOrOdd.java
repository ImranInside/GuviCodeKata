import java.Util.*;
class EvenOrOdd{
  public static void main(String args[]){
    int number;
	    Scanner scrn = new Scanner(System.in);
	    number = scrn.nextInt();
	    if(number % 2 == 0){
	      System.out.print("The number is Even");
	    }
	    else if (number % 2 > 0){
	      System.out.print("The number is Odd");
	    }
	    else{
	      System.out.print("The number is Invalid");
	    }
  }
}
  
