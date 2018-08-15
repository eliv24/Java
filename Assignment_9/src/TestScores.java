
public class TestScores
{
	private int testScore1;
	private int testScore2;
	private int testScore3;
	
	public int getTestScore1()
	{
		return testScore1;
	}
	
	public int getTestScore2()
	{
		return testScore2;
	}
	
	public int getTestScore3()
	{
		return testScore3;
	}
	
	public void setTestScore1(int testScore1Given)
	{
		testScore1 = testScore1Given;
	}
	
	public void setTestScore2(int testScore2Given)
	{
		testScore2 = testScore2Given;
	}
	
	public void setTestScore3(int testScore3Given)
	{
		testScore3 = testScore3Given;
	}
	
	public int average()
	{
		return (testScore1 + testScore2 + testScore3) / 3;
	}
	
	public TestScores()
	{
		testScore1 = 0;
		testScore2 = 0;
		testScore3 = 0;
	}
	
}
