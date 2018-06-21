import java.util.Scanner;
public class NameOutput {

	public static void main(String[] args) {		
		// Main Variables
		Scanner sc = new Scanner(System.in);
		String firstName;
		String lastName;
		
		// Input
		System.out.println("Please enter your first and last name");
		firstName = sc.next();
		lastName = sc.next();
		
		// Output
		System.out.println("First name: " + firstName 
							+ "\nLast name: " + lastName);

	}

}
