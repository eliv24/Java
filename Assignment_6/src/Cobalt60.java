
public class Cobalt60 {

	public static void main(String[] args) {
		double cobalt60 = 10;
		double decay = 0.12;
		double totalDecay = 0;
		
		for(int i = 0; i < 5; i++) {
			totalDecay = cobalt60 - (cobalt60 * decay) ;	
			cobalt60 = totalDecay;		
		}
		System.out.println("After 5 years, about " + Math.round(totalDecay) + " grams of Cobalt 60 remains");
	}

}
