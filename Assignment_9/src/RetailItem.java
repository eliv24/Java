public class RetailItem 
{
	private String description;
	private int unitsOnHand;
	private double price;
	
	public String getDescription()
	{
		return description;
	}
	
	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setDescription(String descriptionGiven)
	{
		description = descriptionGiven;
	}
	
	public void setUnitsOnHand(int unitsGiven)
	{
		unitsOnHand = unitsGiven;
	}
	
	public void setPrice(double priceGiven)
	{
		price = priceGiven;
	}
	
	public RetailItem()
	{
		description = "";
		unitsOnHand = 0;
		price = 0;
	}
}
