import javax.swing.*;
public class Presidency {

	public static void main(String[] args) {
		
		String input, citizen;
		int age;
		
		input = JOptionPane.showInputDialog("If you wish to run for president, please enter your age to determine your eligibility.");
		age = Integer.parseInt(input);
		
		citizen = JOptionPane.showInputDialog("Are you a natural born US citizen?");
		
		
		if (age >= 35 && citizen.equals("yes") || citizen.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Congratulations! you are eligible to run for president of the US!");
		}
		else {
			JOptionPane.showMessageDialog(null, "We are sorry. You are not eligible to run for president.");
		}
		
	}

}
