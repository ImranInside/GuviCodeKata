import java.Util.*;
class EvenOrOdd{
  public static void main(String args[]){
    int number;
    Scanner scrn = new Scanner;
    number = scrn.nextInt();
    if(number % 2 == 0){
      System.out.print("The number is Even");
    }
    else{
      System.out.print("The number is Odd");
    }
  }
}
  
