import java.util.Scanner;
import java.util.Random;
public class randomNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		boolean condition = false;
		int guess = 0;
		int num = rand.nextInt(100);
		
		System.out.println("Please try and guess the number that will show.");
		guess = sc.nextInt();
		
		do
		{
			System.out.println("Too low, try again.");
			guess = sc.nextInt();
		}while(guess < num);
		
		do 
		{
			System.out.println("Too high, try again");
			guess = sc.nextInt();
		}while(guess >= num);
				
		
		do
		{
			System.out.println("Correct guess! " + guess);
			condition = true;
		}while(guess == num && condition == true);
	}

}
