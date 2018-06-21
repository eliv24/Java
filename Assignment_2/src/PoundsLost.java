import java.util.Scanner;
public class PoundsLost {

	public static void main(String[] args) {
		// Stores input
		Scanner sc = new Scanner(System.in);
		
		// Primary variables
		int hours;
		int bi;
		int jog;
		int swim;
		int calories;
		int pounds;
		
		// Input hours spent bicycling
		System.out.println("How many hours have you spent in bicycling?");
		bi = sc.nextInt();
		
		// Input hours spent jogging
		System.out.println("How many hours have you spent in jogging?");
		jog = sc.nextInt();
		
		// Input hours spent swimming
		System.out.println("How many hours have you spent in swimming?");
		swim = sc.nextInt();
		
		// Calculates total hours
		hours = bi + jog + swim;
		
		// Calculates calories burned
		calories = (bi * 200) + (jog * 475) + (swim * 275);
		
		// Calculates pounds lost
		pounds = calories / 3500;
		
		//Output
		System.out.println("Hours spent: " + hours);
		
		System.out.println("Calories burned: " + calories);
				
		System.out.println("Pounds lost: " + pounds); 
		
	}

}
