package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};

		int length = input.length;
		System.out.println(length);

		List<String> lst = new ArrayList <String>();
		for (int i = 0; i <= length - 1; i++) {
		lst.add(input[i]);
		}
		System.out.println("Before sort:" + lst);
		Collections.sort(lst);
		System.out.println("After sort:" + lst);

		for (int j = length - 1; j >= 0; j--) {

			System.out.println(lst.get(j));
		}

	}

}
