
public class PersonalInformationClassMain 
{

	public static void main(String[] args) 
	{
		PersonalInformation personalInformation1 = new PersonalInformation();
		PersonalInformation personalInformation2 = new PersonalInformation();
		PersonalInformation personalInformation3 = new PersonalInformation();
		
		personalInformation1.setName("Eugene");
		personalInformation2.setName("Mikhail");
		personalInformation3.setName("Irina");
		
		personalInformation1.setAddress("Brooklyn");
		personalInformation2.setAddress("Brooklyn");
		personalInformation3.setAddress("Brooklyn");
		
		personalInformation1.setAge(24);
		personalInformation2.setAge(63);
		personalInformation3.setAge(58);
		
		System.out.println("Name: " + personalInformation1.getName()
							+ "\nAddress: " + personalInformation1.getAddress()
							+ "\nAge: "  + personalInformation1.getAge()
							+ "\nPhone Number: " + personalInformation1.getPhoneNumber());
		
		System.out.println("\n\nName: " + personalInformation2.getName()
							+ "\nAddress: " + personalInformation2.getAddress()
							+ "\nAge: "  + personalInformation2.getAge()
							+ "\nPhone Number: " + personalInformation2.getPhoneNumber());
		
		System.out.println("\n\nName: " + personalInformation3.getName()
							+ "\nAddress: " + personalInformation3.getAddress()
							+ "\nAge: "  + personalInformation3.getAge()
							+ "\nPhone Number: " + personalInformation3.getPhoneNumber());
	}

}
