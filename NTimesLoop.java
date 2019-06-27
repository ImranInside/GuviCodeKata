import java.util.Scanner;

public class NTimesLoop {
	public static void main(String args[]){
		int number;
		System.out.println("Enter the N numbers ");
		Scanner scrn = new Scanner(System.in);
		number = scrn.nextInt();
		scrn.close();
		for(int i=1; i<= number; i++){
			System.out.println("Hello");
		}
	}
}
