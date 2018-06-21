import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// Main Variables
		Scanner sc = new Scanner(System.in);
		int year;
		
		// Input
		System.out.println("Please input year.");
		year = sc.nextInt();
		
		
		// Output and Calculations
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("Congradulations! This is a leap year!");
		}
		else {
			System.out.println("This is not a leap year.");
		}
	}

}
