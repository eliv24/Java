import java.util.Scanner;
public class speedMedium {

	public static void main(String[] args) {
		// Main Variables
		Scanner sc = new Scanner(System.in);
		String medium;
		
		// Input
		System.out.println("Please enter your medium (air, water, or steel)");
		medium = sc.nextLine();
		
		// Calculations and output
		switch(medium.toLowerCase()) {
		
		case "air": 
			System.out.println("Speed of sound in air is 1100 feet/sec");
			break;
		
		case "water": 
			System.out.println("Speed of sound in water is 4900 feet/sec");
			break;
		
		case "steel": 
			System.out.println("Speed of sound in steel is 16,400 feet/sec");
			break;
			
		default:
			System.out.println("Invalid entry!");
		}

	}

}
