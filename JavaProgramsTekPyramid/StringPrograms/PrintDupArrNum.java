package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintDupArrNum {

	public static void main(String[] args) {

		int a[]= {1,1,2,3,2,4,1,5};
		LinkedHashMap<Integer, Integer>	lmap= new LinkedHashMap<>();
		for(int i=0;i<a.length;i++) {
			int Num=a[i];
			if(lmap.containsKey(Num)) {
				lmap.put(Num, lmap.get(Num)+1);
			}
			else
				lmap.put(Num,1);
		}
		System.out.println(lmap);
		for(Map.Entry<Integer, Integer> data:lmap.entrySet()) {
			if(data.getValue()>1) {
				System.out.println(data.getKey()+" ");
			}

		}
	}
}


