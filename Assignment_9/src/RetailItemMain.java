public class RetailItemMain
{

	public static void main(String[] args) 
	{
		RetailItem item1 = new RetailItem();
		RetailItem item2 = new RetailItem();
		RetailItem item3 = new RetailItem();
		
		item1.setDescription("Jacket");
		item2.setDescription("Designer Jeans");
		item3.setDescription("Shirt");
		
		item1.setUnitsOnHand(12);
		item2.setUnitsOnHand(40);
		item3.setUnitsOnHand(20);
		
		item1.setPrice(59.95);
		item2.setPrice(34.95);
		item3.setPrice(24.95);
		
		System.out.println("\t\tDescription \t\t Units on Hand \t\tPrice");
		System.out.println("Item #1: \t" + item1.getDescription() + "\t\t\t\t" + item1.getUnitsOnHand() + "\t\t" + item1.getPrice() );
		System.out.println("Item #2: \t" + item2.getDescription() + "\t\t\t" + item2.getUnitsOnHand() + "\t\t" + item2.getPrice() );
		System.out.println("Item #3: \t" + item3.getDescription() + "\t\t\t\t" + item3.getUnitsOnHand() + "\t\t" + item3.getPrice() );
	}

}
