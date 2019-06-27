import java.util.Scanner;

public class VowelsOrConsonant {
	public static void main(String args[]){
		char letter;
		Scanner scnr = new Scanner(System.in);
		letter = scnr.next().charAt(0);
		if((letter == 'a') || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
			System.out.println("This is vowels");
		}
		else{
			System.out.println("This is Consonant");
		}
	}
}
