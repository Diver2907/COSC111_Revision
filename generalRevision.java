package Revision;
import java.util.Scanner; //Importing Inputs

public class generalRevision {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Initializing Inputs
		int x; //Declaring a variable
		x = 5; //Initializing a variable
		int y = 10; //Declaring and Initializing a variable
		System.out.println(x); //Output of x
		x = 10; //Overwriting x
		x += 10; //Addition
		x -= 10; //Subtraction
		System.out.println("x "+x); //X 10
		
		//Variables:
		int a; //Integer
		double b; //Double/float
		char c; //Character
		String d; //Strings
		boolean e; //True/False
		
		//Switch Case:
		System.out.print("\nInput a number between 1 and 12: ");
		int monthNumber = input.nextInt();
		boolean run = true;
		while (run  == true){
			switch (monthNumber) {
				case 1: System.out.println("January"); run = false; break;
				case 2: System.out.println("February"); run = false; break;
				case 3: System.out.println("March"); run = false; break;
				case 4: System.out.println("April"); run = false; break;
				case 5: System.out.println("May"); run = false; break;
				case 6: System.out.println("June"); run = false; break;
				case 7: System.out.println("July"); run = false; break;
				case 8: System.out.println("August"); run = false; break;
				case 9: System.out.println("September"); run = false; break;
				case 10: System.out.println("October"); run = false; break;
				case 11: System.out.println("November"); run = false; break;
				case 12: System.out.println("December"); run = false; break;
				default:
					System.out.println("Invalid input");
					monthNumber=input.nextInt();
			}
		}
		int m = 5; int n = 5;
		int result = additionMethod(m,n);
		System.out.println(result);
	}
	public static int additionMethod(int val1, int val2) {
		return val1+val2;
	}
}
