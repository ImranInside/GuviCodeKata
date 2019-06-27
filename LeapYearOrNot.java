package newOneOfJava;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String args[]){
		int year;
		System.out.println("Enter the year: ");
		Scanner scrn = new Scanner(System.in);
		year = scrn.nextInt();
		scrn.close();
		if(year % 4 == 0){
			System.out.println("its Leap year");
		}
		else{
			System.out.println("its not a leap year");
		}
	}
}
