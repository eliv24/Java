import java.util.*;
public class rainFall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = 0;
		int months = 12;
		double inches = 0;
		double totalInches = 0;
		int totalMonths = 0;
		
		System.out.println("How many number of years?");
		year = sc.nextInt();
		
		for(int y = 0; y < year; y++) 
		{
			for(int m = 0; m < months; m++)
			{
				System.out.println("please enter inches of rainfall");
				inches = sc.nextDouble();
				totalInches += inches;
				
				while(inches < 1)
				{
					System.out.println("Invalid entry. Please input a number that isn't less than 1");
					inches = sc.nextDouble();
					totalInches += inches;
				}
			}
		}
		
		totalMonths = year * months;
		
		System.out.println("These are the total number of inches: " + totalInches + "\nTotal Months: " + totalMonths);
		
	}

}
