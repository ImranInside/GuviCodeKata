import java.util.Scanner;

public class AddingNNumbers {
	public static void main(String args[]){
		int number, finalnum = 0, result = 0;
		System.out.println("Enter the N numbers ");
		Scanner scrn = new Scanner(System.in);
		number = scrn.nextInt();
		scrn.close();
		for(int i=0; i<= number; i++){
			result = finalnum+i;
			finalnum = result;
		}
		System.out.println(result);
	}
}
