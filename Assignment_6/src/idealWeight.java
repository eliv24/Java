import java.util.*;
public class idealWeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double height, weight, ideal;
		String gender;
		
		System.out.println("What is your gender?");
		gender = sc.nextLine();
		gender = gender.toLowerCase();
		
		if(gender.equals("male")) {
			System.out.println("What is your height in inches?");
			height = sc.nextDouble();
				
			System.out.println("What is your weight?");
			weight = sc.nextDouble();
				
			ideal = (height * 4) - 128;
				
			if(weight > ideal) 
			{
				System.out.println("You are overweight.");
			}
			else if (weight < ideal)
			{
				System.out.println("You are underweight");
			}
			else if(weight == ideal)
			{
				System.out.println("You are the ideal weight!");
			}
			
		}
		
		if(gender.equals("female")) {
			System.out.println("What is your height in inches?");
			height = sc.nextDouble();
				
			System.out.println("What is your weight?");
			weight = sc.nextDouble();
			
			ideal = (height * 3.5) - 108;
				
			if(weight > ideal) 
			{
				System.out.println("You are overweight.");
			}
			else if (weight < ideal)
			{
				System.out.println("You are underweight");
			}
			else if(weight == ideal)
			{
				System.out.println("You are the ideal weight!");
			}
		}

	}

}
