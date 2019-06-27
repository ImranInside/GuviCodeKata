import java.util.Scanner;

public class LengthOfGivenVal {
	public static void main(String args[]){
		int number,count = 0;
		System.out.println("Enter the N numbers ");
		Scanner scrn = new Scanner(System.in);
		number = scrn.nextInt();
		scrn.close();
		while (number != 0){
			number = (number/10);
			++count;
		}
		System.out.println("The total length of integer is"+count);
	}
}
