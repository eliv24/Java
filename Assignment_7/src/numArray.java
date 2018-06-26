import java.util.*;
public class numArray {

	public static void main(String[] args)
	{
		// Main Variables
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int average = 0;
		int max = 0;
		int min = 0;
			
		// Asking the user how many numbers to store inside of an array.
		int length;
		
		System.out.println("How many numbers do you want to use as an array.");
		length = sc.nextInt();
		
		// Plugging "length" into the array
		int array[] = new int[length];
				
		// Asking for numbers of each array variable and totaling the sum 
		for(int a = 0; a < array.length; a++)
		{
			System.out.println("Please enter number for the array.");
			array[a] = sc.nextInt();
			total += array[a];	
		}
		
		// Calculating average
		average = total / array.length;
		
		// Calculating highest and lowest number
		max = array[0];
		min = array[0];
		
		for(int b = 0; b < array.length; b++) 
		{
			if(max < array[b]) 
			{
				max = array[b];
			}
			if(min > array[b]) 
			{
				min = array[b];
			}
		}
		
		// Output
		System.out.println("Total sum: " + total 
							+ "\nAverage: " + average 
							+ "\nHighest: " + max 
							+ "\nLowest " + min);

	}

}
