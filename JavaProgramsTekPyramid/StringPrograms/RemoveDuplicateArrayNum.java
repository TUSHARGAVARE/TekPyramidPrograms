package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateArrayNum {

	public static void main(String[] args) {

		 int a[]= {1,1,2,3,2,4,1,5};
		 LinkedHashSet<Integer> lmap = new LinkedHashSet();	
		 for(int i=0;i<a.length;i++) {
	      lmap.add(a[i]);
	}
		 for(Integer data:lmap) {
			 System.out.print(data+" ");
		 }
	
	}

}
