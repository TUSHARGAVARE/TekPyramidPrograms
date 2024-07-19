package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class UniqueArrayNum {

	public static void main(String[] args) {

		int a[] = { 1, 1, 2, 3, 2, 4, 1, 5 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int word = a[i];
			if (map.containsKey(word)) {
				
				map.put(word, map.get(word) + 1);
			} else
				map.put(word, 1);
			
		}
		System.out.println(map);
		for (Map.Entry<Integer, Integer> data1 : map.entrySet()) {
			if (data1.getValue() == 1) {
				System.out.print(data1.getKey() + " "); // gives occurance of unique characters
			}

		}
	
	}

}
