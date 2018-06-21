import java.util.*;
public class wordSwitching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence, word1, word2, endSent;
		
		System.out.println("Please enter a sentence along with a word from that sentence and what to replace it with.");
		sentence = sc.nextLine();
		
		word1 = sc.nextLine();
		
		word2 = sc.nextLine();
		
		if(sentence.contains(word1)) {
			System.out.println("Great!");
		}
		else {
			System.out.println("Word is not in sentence. please try again");
			System.exit(0);
		}
		
		endSent = sentence.replaceAll(word1, word2);
		System.out.println(endSent);

	}

}
