import java.util.*;
public class TestScoresMain
{

	public static void main(String[] args) 
	{
		TestScores testScore = new TestScores();
		
		Scanner sc = new Scanner(System.in);
		
		int userTestScore;
		
		System.out.println("What is the first test score?");
		userTestScore = sc.nextInt();
		testScore.setTestScore1(userTestScore);
		
		System.out.println("What is the second test score?");
		userTestScore = sc.nextInt();
		testScore.setTestScore2(userTestScore);
		
		System.out.println("What is the third test score?");
		userTestScore = sc.nextInt();
		testScore.setTestScore3(userTestScore);
		
		System.out.println("Test Score 1: " + testScore.getTestScore1()
							+ "\nTest Score 2: " + testScore.getTestScore2()
							+ "\nTest Score 3: " + testScore.getTestScore3()
							+ "\nAverage: " + testScore.average());
		
		
	}

}
