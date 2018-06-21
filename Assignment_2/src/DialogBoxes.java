import javax.swing.JOptionPane;
public class DialogBoxes {
	public static void main(String[] args){
		// Stores name
		String name = JOptionPane.showInputDialog("What is your name?");
		
		// Stores hours
		String hours = JOptionPane.showInputDialog("What are your hours?");
		
		// Stores pay
		String pay = JOptionPane.showInputDialog("What is your pay?");
		
		// Output
		JOptionPane.showMessageDialog(null, "Name: " + name
										+ "\nHours: " + hours
										+ "\nPay: " + pay + " dollars an hour.");
	}
}
