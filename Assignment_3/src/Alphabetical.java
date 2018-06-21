import java.util.Scanner;
public class Alphabetical {

	public static void main(String[] args) {
		
		//Main Variables
		Scanner sc = new Scanner(System.in);
		String first;
		String second;
		String third;
		
		// Inputs
		System.out.println("Enter first word");
		first = sc.nextLine();
		 
		System.out.println("Enter second word");
		second = sc.nextLine();
		 
		System.out.println("Enter third word");
		third = sc.nextLine();
		 

		// Outputs 
		if (first.compareTo(second + third) < 0 && second.compareTo(third) < 0 ) {
			 System.out.println("First word: " + first + " Second word: " + second + " Third word: " + third);
		}
		if(first.compareTo(second+third) < 0 && third.compareTo(second) < 0) {
			 System.out.println("First Word: " + first + " Second Word: " + third + " Third Word: " + second);
		}
		if(second.compareTo(first + third) < 0 && first.compareTo(third) < 0) {
			 System.out.println("First Word: " + second + " Second Word: " + first + " Third Word: " + third);
		}
		if(second.compareTo(first + third) < 0 && third.compareTo(first) < 0) {
			 System.out.println("First Word: " + second + " Second Word: " + third + " Third Word: " + first);
		}
		if(third.compareTo(first + second) < 0 && first.compareTo(second) < 0) {
			 System.out.println("First Word: " + third + " Second Word: " + first + " Third Word: " + second);
		}
		if (third.compareTo(first + second) < 0 && second.compareTo(first) < 0) {
			 System.out.println ("First Word: " + third + " Second Word: " + second + " Third Word: " + first);
		}

	}

}
