package assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String [] str = test.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (i%2 == 0) {
				System.out.print(str[i] + " ");
				
			}else {
				char[] a = str[i].toCharArray();
				for (int j = a.length-1; j >=0 ; j--) {
					System.out.print(a[j] + "");	
				}
			}
			
		}

	}

}
