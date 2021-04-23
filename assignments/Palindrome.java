package assignments;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		
		char[] charArray = str.toCharArray();
		for (int i = charArray.length - 1 ; i >=0; i--) {
			rev = rev + charArray[i];
		}
		if (str.equals(rev)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not palindrome");
		}

	}

}
