public class Payroll 
{
	private String name;
	private int idNumber;
	private double hourlyPayRate;
	private double hoursWorked;
	
	public String getName()
	{
		return name;
	}
	
	public int getIdNumber()
	{
		return idNumber;
	}
	
	public double getHourlyPayRate()
	{
		return hourlyPayRate;
	}
	
	public double getHoursWorked()
	{
		return hoursWorked;
	}
	
	public void setName(String nameGiven)
	{
		name = nameGiven;
	}
	
	public void setIdNumber(int idNumberGiven)
	{
		idNumber = idNumberGiven;
	}
	
	public void setHourlyPayRate(double hourlyPayRateGiven)
	{
		hourlyPayRate = hourlyPayRateGiven;
	}
	
	public void setHoursWorked(double hoursWorkedGiven)
	{
		hoursWorked = hoursWorkedGiven;
	}
	
	public double calculateGrossPay()
	{
		return hoursWorked * hourlyPayRate;
	}
	
	public Payroll(String nameGiven, int idNumberGiven)
	{
		name = nameGiven;
		idNumber = idNumberGiven;
		hourlyPayRate = 0;
		hoursWorked = 0;
	}
}
