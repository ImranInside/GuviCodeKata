import java.util.Scanner;

public class PositiveOrNegativeOrZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner scar = new Scanner(System.in);
		input = scar.nextInt();
		if( input > 0){
		System.out.println("Positive");
		}
		else if(input < 0){
		System.out.println("Negative");
		}
		else{
		System.out.println("zero");
		}
	}

	}


