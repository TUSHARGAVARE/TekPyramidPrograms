package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateWords {

	public static void main(String[] args) {
		String  s = "welcome to tp welcome to gc18";
		String[] str = s.split(" ");//used to separate the statement w.r.t to space

		HashMap<String,Integer> map = new HashMap(); 
		for (int i = 0; i <str.length; i++) 
		{
			String  word = str[i];//store charAt in var to use frequently
			if (map.containsKey(word))//it will check whether key in present in the map or not return boolean
			{
				map.put(word, map.get(word) + 1);//if key already present then we use get method to update the already present value
			} else {
				map.put(word, 1);//if its not present put method will add into map along with default count as 1

	}
		}
		for(Map.Entry<String,Integer> data : map.entrySet())
		{
			if(data.getValue()>1)//if count of the key is greater then one
			{
				System.out.println(data.getKey()+" ");//print the key(character) which occurs may times
			}
		}

}
}