import javax.swing.JOptionPane;
public class Payroll {
	public static void main(String[] args) {
		
		String name;
		double hours;
		double pay;
		
		name = JOptionPane.showInputDialog("What is your name?");
		
		hours = Double.parseDouble(JOptionPane.showInputDialog("What are your hours?"));
		
		pay = Double.parseDouble(JOptionPane.showInputDialog("What is your pay?"));
		
		double grossPay = (hours * pay) * 2;
		
		double PaycheckTax = .25;
		
		double IncomeTax = PaycheckTax * grossPay;
		
		double payCheck = grossPay - IncomeTax;
		
		JOptionPane.showMessageDialog(null, "Name: " + name
										+ "\nHours: " + hours
										+ "\nPay: " + pay
										+ "\nGross pay: " + grossPay
										+ "\nIncome tax reduction:" + IncomeTax
										+ "\nTotal Income: " + payCheck);
										
	}
}
