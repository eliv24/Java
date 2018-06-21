import java.util.Scanner;
public class GrossPay {
	public static void main(String[] args)
	{
		// Stores keyboard inputs
		Scanner sc = new Scanner(System.in);
		
		// Stores name
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		// Stores the hours
		System.out.println("What are your hours?");
		int hours = sc.nextInt();
		
		// Stores the pay
		System.out.println("What is your rate of pay?");
		int pay = sc.nextInt();
		
		// Calculates salary
		int salary = hours * pay;
		
		// The output
		System.out.println("Name: " + name
							+ "\nHours: " + hours
							+ "\nPay: " + pay 
							+ "\nWeekly salary: " + salary);
	}
}
