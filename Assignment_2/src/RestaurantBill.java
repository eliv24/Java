import java.util.Scanner;
public class RestaurantBill {

	public static void main(String[] args) {
		
		// Stores input.
		Scanner sc = new Scanner(System.in);
		
		// Main variables.
		int appetizer;
		int meal;
		int desert;
		
		// Input appetizer price.
		System.out.println("How much for the Appetizers?");
		appetizer = sc.nextInt();
		
		// Input price for meal.
		System.out.println("How much for the meal?");
		meal = sc.nextInt();
		
		// Input price for desert.
		System.out.println("How much for the desert?");
		desert = sc.nextInt();
		
		// Total Price Calculations.
		int subtotal = appetizer + meal + desert;
		double total = (subtotal * .0675) + subtotal;
		double tip = total * 0.15;
		
		// Output.
		System.out.println("Total price is: " + total
							+ "\nTip:" + tip);

	}

}
