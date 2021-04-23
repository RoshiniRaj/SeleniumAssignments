package assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] str= text.split(" ");
		
		for (int i = 0; i <= str.length-1; i++) {
			for (int j = i+ 1; j <= str.length-1; j++) {
				if (str[i].equals(str[j])) {
					str[j]= "";
				}
				}
			System.out.print(str[i] + " ");
			}
		}
		
	}
