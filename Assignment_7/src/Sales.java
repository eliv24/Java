import java.util.*;
public class Sales {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		double total = 0;
		double average = 0;
		
		int dailySales[] = new int[5];
		
		System.out.println("What is the name of the file?");
		name = sc.next();
		
		for(int i = 0; i < dailySales.length; i ++) 
		{
			System.out.println("please enter sale");
			dailySales[i] = sc.nextInt();
			total += dailySales[i];
		}
		
		average = total / dailySales.length;
		
		System.out.println("Name: " + name
							+ "\nTotal revenue of sales: " + total
							+ "\nAverage sales: " + average);
		
	}

}
