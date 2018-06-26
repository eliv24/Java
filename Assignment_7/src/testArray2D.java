import java.util.*;
public class testArray2D {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double testScore[][];
		testScore = new double[3][5];
		double test1 = 0;
		double test2 = 0;
		double test3 = 0;
		double average = 0;
		double total = 0;
		
		for(int row = 0; row < testScore.length; row++)
		{
			for(int column = 0; column < testScore[row].length; column++)
			{
				System.out.println("Please enter test score");
				testScore[row][column] = sc.nextDouble();
				total += testScore[row][column];
			}
			average = total / testScore[row].length;
			System.out.println("Test Score average is: " + average);
			total = 0;
		}
	
	}

}
