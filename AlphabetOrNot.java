import java.util.Scanner;
public class AlphabetOrNot {
	public static void main(String args[]){
		char letter;
		Scanner scnr = new Scanner(System.in);
		letter = scnr.next().charAt(0);
		if(letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z'){
			System.out.println("Yes! This is alphabet");
		}
		else{
			System.out.println("No! its not alphabet");
		}
	}
}
