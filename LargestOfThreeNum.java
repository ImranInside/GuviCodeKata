import java.util.Scanner;

class  LargestOfThreeNum{
	public static void main(String args[]){
		int a,b,c;
		System.out.println("Enter three values of a, b and c:");
		Scanner scrn = new Scanner(System.in);
		a = scrn.nextInt();
		b = scrn.nextInt();
		c = scrn.nextInt();
		scrn.close();
		if(a > b && a >c){
			System.out.println("The Value of a is Greater than b and c");
		}
		else if(b > a && b > c){
			System.out.println("The Value of b is Greater than a and c");
		}
		else{
			System.out.println("The Value of c is Greater than a and b");
		}
	}
}
