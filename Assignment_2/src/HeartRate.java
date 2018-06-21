import java.util.Scanner;
public class HeartRate {

	public static void main(String[] args) {
		// Stores Input
		Scanner sc = new Scanner(System.in);
		
		// Primary variables
		int age;
		int resting;
		
		// Stores age
		System.out.println("What is your age?");
		age = sc.nextInt();
		
		// Stores resting heart rate
		System.out.println("What is your resting heart rate?");
		resting = sc.nextInt();
		
		// Calculates training heart rate
		double heartrate = 0.7 * (220 - age) + 0.3 * resting;
		
		System.out.println("This is your training heart rate" + heartrate);

	}

}
