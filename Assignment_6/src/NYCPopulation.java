
public class NYCPopulation {

	public static void main(String[] args) {
		int totalPop = 81751333;
		int year = 2010;
		int lowPop = 0;
		
		do {
			lowPop = totalPop / 2;
			totalPop -= lowPop;
			year = year - 40;	
								
		}
		while(lowPop >= 10000);
		
		System.out.printf("year and population respectfully is %d and %d ", year, lowPop);
		

	}

}
