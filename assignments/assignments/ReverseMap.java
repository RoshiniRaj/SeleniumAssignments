package week3.assignments;

import java.util.Collections;
import java.util.TreeMap;

public class ReverseMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(Collections.reverseOrder());

		map.put(01, "Roshini");
		map.put(02, "Kamal");
		map.put(03, "Bharani");
		map.put(04, "Babu");
		System.out.println(map.size());
		

		System.out.println(map);

	}

}
