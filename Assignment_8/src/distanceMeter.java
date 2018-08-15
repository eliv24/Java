import java.util.*;
public class distanceMeter
{
	public static void kiloConvert(double meters, double kilometers)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many meters do you wish to convert to kilometers?");
		meters = sc.nextDouble();
		
		kilometers = meters * 0.001;
		
		System.out.println(meters + " meters become: " + kilometers + " Kilometers.");
	}
	
	public static void inchConvert(double meters, double inches)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many meters do you wish to convert to inches?");
		meters = sc.nextDouble();
		
		inches = meters * 39.37;
		
		System.out.println(meters + " meters become: " + inches + " inches.");
	}
	
	public static void feetConvert(double meters, double feet)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many meters do you wish to convert to feet?");
		meters = sc.nextDouble();
		
		feet = meters * 3.281;
		
		System.out.println(meters + " meters become: " + feet + " feet.");
	}
	
	public static void quit()
	{
		System.exit(0);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double meters = 0;
		double kilometers = 0;
		double inches = 0;
		double feet = 0;
		String input;
		
		
		System.out.println("What would you like to do today? Please select a,b,c, or d. \na. Convert to Kilometers. \nb. Convert to inches. \nc. Convert to feet. \nd. Quit the program.");
		input = sc.nextLine();
		
		switch(input.toLowerCase())
		{
			case("a"): distanceMeter.kiloConvert(meters, kilometers);
			break;
			
			case("b"): distanceMeter.inchConvert(kilometers, inches);
			break;
			
			case("c"): distanceMeter.feetConvert(kilometers, feet);
			break;
			
			case("d"): distanceMeter.quit();
			break;
		}

	}

}
