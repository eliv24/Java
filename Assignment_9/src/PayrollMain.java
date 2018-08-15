import java.util.*;
public class PayrollMain 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String userName;
		int userID;
		double userHourlyPayRate;
		double userHoursWorked;
		
		System.out.println("Whose Payroll is this?");
		userName = sc.nextLine();
		System.out.println("Enter ID number of " + userName + ": ");
		userID = sc.nextInt();
		System.out.println("Enter the hourly pay rate");
		userHourlyPayRate = sc.nextDouble();
		System.out.println("Enter the hours worked");
		userHoursWorked = sc.nextDouble();
		 
		Payroll payroll1 = new Payroll(userName, userID);
		payroll1.setHourlyPayRate(userHourlyPayRate);
		payroll1.setHoursWorked(userHoursWorked);
		System.out.println(payroll1.getName() + " has a gross pay of " + payroll1.calculateGrossPay());
	}

}
