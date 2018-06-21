import java.util.Scanner;
public class FavoriteCity {

	public static void main(String[] args) {
		// Keyboard input
		Scanner sc = new Scanner(System.in);
		
		// Where city is stored
		System.out.println("What is your favorite city?");
		String input = sc.nextLine();
		
		// Output using multiple methods
		System.out.println("Total number of characters: " + input.length()
				+ "\nName in upper case: " + input.toUpperCase()
				+ "\nName in lowercase: " + input.toLowerCase()
				+ "\nFirst character: " + input.charAt(0));

	}

}
