import java.util.*;
public class bankCharge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int checks;
		double monthlyFee;
		int baseFee = 10;
		
		System.out.println("How many checks have you written for the month?");
		checks = sc.nextInt();
		
		if(checks < 20) {
			monthlyFee = baseFee + (checks *.10);
			System.out.println("Your monthly fee is: " + monthlyFee);
		}
		else if(checks >= 20 && checks < 40) {
			monthlyFee = baseFee + (checks *.08);
			System.out.println("Your monthly fee is: " + monthlyFee);
		}
		else if(checks >= 40 && checks < 60) {
			monthlyFee = baseFee + (checks *.06);
			System.out.println("Your monthly fee is: " + monthlyFee);
		}
		else if(checks >= 60) {
			monthlyFee = baseFee + (checks *.04);
			System.out.println("Your monthly fee is: " + monthlyFee);
		}

	}

}
