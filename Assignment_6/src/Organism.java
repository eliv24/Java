import java.util.*;
public class Organism {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double startNum = 0;
		double percen = 0;
		double percentage;
		int days = 0;
		double totalPop = 0;
		
		System.out.println("What is the starting number of this organism population?");
		startNum = sc.nextDouble();
		
		while(startNum < 2)
		{
			System.out.println("Cannot start out with less than two organisms. Please enter new number.");
			startNum = sc.nextDouble();
		}
		
		System.out.println("What is the percentage of population increase per day?");
		percen = sc.nextDouble();
		
		while(percen < 0)
		{
			System.out.println("Cannot accept a negative percentage. Enter new value.");
			percen = sc.nextDouble();
		}
		
		percentage = percen / 100;
		
		System.out.println("How many days will they multiply for?");
		days = sc.nextInt();
		
		while(days < 1) 
		{
			System.out.println("Cannot accept less than one day. Please enter new value.");
			days = sc.nextInt();
		}
		
		for(int d = 0; d < days; d++)
		{
			startNum = (startNum * percentage) + startNum;
			totalPop += startNum;
			System.out.println("Total population: " + Math.round(totalPop)
								+ "\nAfter Day:" + d);
		}
		
	}

}
