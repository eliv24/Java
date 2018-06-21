import java.text.DecimalFormat;
public class numFormat {

	public static void main(String[] args) {
		// Main variables
		String num = "#########.#";
		String num2 = "###,###,###.##";
		String num3 = "###,###,###.###";
		
		DecimalFormat decFormat = new DecimalFormat(num);
		DecimalFormat decFormat2 = new DecimalFormat(num2);
		DecimalFormat decFormat3 = new DecimalFormat(num3);
		
		String format = decFormat.format(123456789.1234567890);
		String format2 = decFormat2.format(123456789.1234567890);
		String format3 = decFormat3.format(123456789.1234567890);
		
		System.out.println("Numbers 1 ");
		System.out.printf(format);
		
		System.out.println("\n\nNumbers 2");
		System.out.printf(format2);
		
		System.out.println("\n\nNumbers 3");
		System.out.printf(format3);
		


	}

}
