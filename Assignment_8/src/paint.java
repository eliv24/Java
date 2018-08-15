import java.util.*;
public class paint 
{

	public static double gallonReq(double gallon)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many gallons of paint do you need?");
		gallon = sc.nextDouble();
		
		return gallon;
	}
	
	public static double gallonCosts(double cost, double gallon, double totalCost)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How much did you pay per gallon?");
		cost = sc.nextDouble();
		
		totalCost = cost * gallon;
		
		System.out.println("Total cost of paint is: " + totalCost);
		
		return totalCost;
	}
	
	public static double laborHour(double hours, double gallon)
	{		
		hours = gallon * hours;
		
		System.out.println("Hours needed: " + hours);
		
		return hours;
	}
	
	public static double laborCharges(double hours, double charges)
	{
		charges = hours * charges;
		
		System.out.println("Labor charges are: " + charges);
		
		return charges;
	}
	
	public static double totalCost(double charges, double totalCost, double cost)
	{
		totalCost = cost + charges;
		
		System.out.println("Total cost of the paint job is: " + totalCost);
		
		return totalCost;
	}
	
	public static void main(String[] args)
	{
		double gallon = 0;
		double sqfeet = 115;
		double cost = 0;
		double hours = 8;
		double charges = 18;
		double totalCost = 0;
		
		double gallons = paint.gallonReq(gallon);
		gallon = gallons;
		double costs = paint.gallonCosts(cost, gallon, totalCost);
		cost = costs;
		double hour = paint.laborHour(hours, gallons);
		hours = hour;
		double workerCharges = paint.laborCharges(hours, charges);
		charges = workerCharges;
		double costTotal = paint.totalCost(workerCharges, totalCost, cost);
		
	}

}
