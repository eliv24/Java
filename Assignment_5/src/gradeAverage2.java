import javax.swing.JOptionPane;

public class gradeAverage2 {

	public static void main(String[] args) {
		// Main Variables
		String input;
		int grade = 0; 
		double avgGrade = 0;
		int grades = 0;
		int counter = 0;
		double totalGrade = 0;
		int sentinel = 5;
		
		// Inputs
		input = JOptionPane.showInputDialog("How many inputs?");
		grades = Integer.parseInt(input);
		
		// Calculations
		while (counter < grades && counter != sentinel) {
			input = JOptionPane.showInputDialog("Please enter your grade");
			grade = Integer.parseInt(input);
			totalGrade += grade;			
			counter++;
			if(counter == sentinel) {
				JOptionPane.showMessageDialog(null, "Maximum amount of classes reached");
			}
		}
		
		avgGrade = totalGrade / grades;
		
		// Output
		JOptionPane.showMessageDialog(null,"The class average grade is " + avgGrade);

	}

}
