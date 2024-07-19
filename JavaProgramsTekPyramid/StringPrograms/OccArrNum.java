package StringPrograms;

import java.util.HashMap;

public class OccArrNum {

	public static void main(String[] args) {

		int a[]= {1,1,2,3,2,4,1,5};
		HashMap<Integer, Integer> map = new HashMap();
		for(int i=0;i<a.length;i++) {
			int Num=a[i];
			if(map.containsKey(Num)) {
				map.put(Num, map.get(Num)+1);
			}else
				map.put(Num, 1);
		}
		System.out.println(map);
	}

}
