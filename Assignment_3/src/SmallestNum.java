import java.util.Scanner;
public class SmallestNum {

	public static void main(String[] args) {
		
		// Main Variables
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int small;
		
		// Inputs
		System.out.println("Please enter first number");
		num1 = sc.nextInt();
		
		System.out.println("Please enter second number");
		num2 = sc.nextInt();
		
		System.out.println("Please enter third number");
		num3 = sc.nextInt();
		
		// Outputs
		if(num1 < num2 && num1 < 3)
		{
			small = num1;
			System.out.println("Here are the numbers: " + num1 + ", " + num2 + ", " + num3
					+"\nThis is the smallest number: " + small);
		}else if(num2 < num1 && num2 < num3){
			small = num2;
			System.out.println("Here are the numbers: " + num1 + ", " + num2 + ", " + num3
					+"\nThis is the smallest number: " + small);
		}else if(num3 < num1 && num3 < num2) {
			small = num3;
			System.out.println("Here are the numbers: " + num1 + ", " + num2 + ", " + num3
					+"\nThis is the smallest number: " + small);
		}
	}

}
