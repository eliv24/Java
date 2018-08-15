import java.util.*;
public class dailySales
{
	// Method for calculating the total of all Sales
	public static double total(double sales, double total, int days) 
	{
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < days; i++)
		{
			System.out.println("Input daily sale for the day.");
			sales = sc.nextDouble();
			total += sales;
		}
		
		return total;
	}
	
	// Method for calculating the average of all sales
	public static double average(double average, double total, int days)
	{
		average = total / days;
		
		return average;
	}
	
	// Method  to output the results
	public static void output(double total, double average)
	{
		System.out.println("Total sales of the week: " + total
							+ "\nAverage: " + average);
	}
	
	public static void main(String[] args) 
	{
				
		int days = 7;
		double sales = 0;
		double total = 0;
		double average = 0;
		
		total = dailySales.total(sales, total, days);
		
		average = dailySales.average(average, total, days);
		
		dailySales.output(total, average);
		
	}

}
