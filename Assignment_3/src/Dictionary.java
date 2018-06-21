import java.util.Scanner;
public class Dictionary {

	public static void main(String[] args) {
		// Main Variables
		Scanner sc = new Scanner(System.in);
		String input;
		
		// Input
		System.out.print("Please enter word for your definition");
		input = sc.nextLine();
		
		// Processing and Output
		switch(input) {
		
			case "CPU":
				System.out.println("The CPU (Central Processing Unit) is the brain of the computer. It handles the processes and calculations");
				break;
			
			case "RAM": 
				System.out.println("RAM (Random Access Memory) is the computer's primary memory storage. All of the memory stored in the RAM is deleted when the computer is shut off");
				break;
			
			case "GPU": 
				System.out.println("GPU (Graphics Processing Unit) is like a CPU, but instead it is designed to create images.");
				break;
				
			case "SSD":
				System.out.println("Solid State Drives use flash memory to quickly read and write data. Data is saved forever even when computer is shut off");
				break;
				
			case "HDD":
				System.out.println("Hard Disk Drive is a mechanical drive whose speed is determined by RPM (rotations per minute). They are a lot slower than SSDs and memory stored within does not disappear when computer is shut off.");
				break;
			
		default:
			System.out.println("That word is not in our dictionary!");
		}
	}

}
