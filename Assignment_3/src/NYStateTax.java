import java.util.Scanner;
public class NYStateTax {

	public static void main(String[] args) {
		// Main Variables
		Scanner sc = new Scanner(System.in);
		double income;
		double tax;
		
		// Input
		System.out.println("Please enter your taxable income.");
		income = sc.nextDouble();
		
		// Calculations and Output
		if(income < 20000) {
			tax = income * .02;
			System.out.println("Your tax percentage is 2% and total tax is: " + tax);
		}
		else if(income >= 20000 && income < 50000) {
			tax = income * .03;
			System.out.println("Your tax percentage is 3% and total tax is: " + tax);
		}
		else if(income >= 50000) {
			tax = income * .05;
			System.out.println("Your tax percentage is 5% and total tax is: " + tax);
		}

	}

}
