package week3.assignments;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		String str = "PayPal India";

		char[] charArray=str.toCharArray();

		Set<Character> charSet=new LinkedHashSet<Character>();

		Set<Character> dupCharSet=new LinkedHashSet<Character>();

		for (int i = 0; i < charArray.length; i++) 
		{
			char String = charArray[i];
			
			if(String !=' ')

			{
				charSet.add(new Character(charArray[i]));  
			}

			if(charSet.contains(charArray[i]))
			{
				dupCharSet.add(new Character(charArray[i]));
			}	    	  
		}

		if(dupCharSet.equals(charSet))
		{
			charSet.remove(dupCharSet);
		}

		Iterator<Character> charlevel = charSet.iterator();

		while (charlevel.hasNext()) {

			System.out.print(charlevel.next());
		}


	}

}
