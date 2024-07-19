package StringPrograms;

import java.util.HashMap;

public class NumberOfOccurance {

	public static void main(String[] args) {
		// hash map insertion order not maintain
		// stored in form of key and value pair
		String s = "india"; //store india string into variable s
		HashMap<Character, Integer> map = new HashMap(); 
		for (int i = 0; i <s.length(); i++) 
		{

			char ch = s.charAt(i);//store charAt in var to use frequently
			if (map.containsKey(ch))//it will check whether key in present in the map or not return boolean
			{
				map.put(ch, map.get(ch) + 1);//if key already present then we use get method to update the already present value
			} else
				map.put(ch, 1);//if its not present put method will add into map along with default count as 1

		}
		System.out.println(map);

	}
}