import javax.swing.JOptionPane;
public class TestGrade {

	public static void main(String[] args) {
		// Main Variables
		int test1, test2, test3;
		double average;
		
		// Input
		test1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter score for Test #1"));
		
		test2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter score for Test #2"));
		
		test3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter score for Test #3"));
		
		// Calculations
		average = (test1 + test2 + test3) / 3;
		
		// Outputs
		if(average >= 50 && average < 60) {
			JOptionPane.showMessageDialog(null, "Final grade: F");
		}
		else if(average >= 60 && average < 70) {
			JOptionPane.showMessageDialog(null, "Final grade: D");
		}
		else if(average >= 70 && average < 80) {
			JOptionPane.showMessageDialog(null, "Final grade: C");
		}
		else if(average >= 80 && average < 90) {
			JOptionPane.showMessageDialog(null, "Final Grade: B");
		}
		else if(average >= 90 && average < 100) {
			JOptionPane.showMessageDialog(null, "Final Grade: A");
		}

	}

}
