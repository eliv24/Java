
public class stringArray {

	public static void main(String[] args)
	{
		// Main array for program.
		String names[] = new String[5];
		names[0] = "Eugene";
		names[1] = "Irina";
		names[2] = "Mikhail";
		names[3] = "Thomas";
		names[4] = "David";
		
		// Array used to find the first character of each word.
		char charNames[] = new char[5];
		names[0] = "Eugene";
		names[1] = "Irina";
		names[2] = "Mikhail";
		names[3] = "Thomas";
		names[4] = "David";
		
		// Variables needed to find the length of the characters in the array.
		int length = names.length;
		
		// This outputs all of the names in upper case.
		for(int u = 0; u < names.length; u++)
		{
			names[u] = names[u].toUpperCase();
			System.out.println(names[u]);
		}
		
		System.out.println("\n");
		
		// This outputs in lower case.
		for(int l = 0; l < names.length; l++ )
		{
			names[l] = names[l].toLowerCase();
			System.out.println(names[l]);
		}		

		System.out.println("\n");
		
		// This outputs the first character of each name.
		for(int c = 0; c < charNames.length; c++)
		{
			charNames[c] = names[c].charAt(0);
			System.out.println(charNames[c]);
		}
		
		System.out.println("\n");
		
		// This counts and outputs the length of each word.
		for(int e = 0; e < names.length; e++)
		{
			length = names[e].length();
			System.out.println(length);
		}
	}

}
