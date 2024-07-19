package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class LearningEntrySet {

	public static void main(String[] args) {

		HashMap<String, Integer> hs = new HashMap();//Entry set required generic collection
		hs.put("sky", 63);
		hs.put("VK", 18);
		hs.put("dhoni", 7);

		for (Map.Entry<String, Integer> data : hs.entrySet()) //data holds key n value 
		{
			System.out.print(data.getKey() + "-");
			System.out.print(data.getValue());
			System.out.println();
		}

	}

}
