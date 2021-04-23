package assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2 == 0)
			{
				String a = "" +charArray[i];
				String b = a.toUpperCase();
				System.out.println(b);
			}
			else System.out.println(charArray[i]);
		}

	}

}
