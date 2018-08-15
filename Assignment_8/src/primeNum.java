import java.util.*;
public class primeNum
{

	public static boolean isPrime(int num)
	{
		
		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Please enter an integer");
		num = sc.nextInt();
		
		primeNum.isPrime(num);
		
		if(primeNum.isPrime(num) == true) 
		{
			System.out.println("This number is prime");
		}
		else
		{
			System.out.println("This number is not prime");
		}
	}

}
