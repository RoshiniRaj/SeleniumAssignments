package week3.assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindOccurance {

	public static void main(String[] args) {
		String str = "welcome to Selenium automation";

		char[] charArray = str.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) 
		{
			if (map.containsKey(charArray[i])) 
			{
				Integer value = map.get(charArray[i]);
				int newValue = value + 1;
				map.put(charArray[i], newValue);
			}
			else 
			{
				map.put(charArray[i], 1);
			}
		}

		System.out.println(map);

	}

}
