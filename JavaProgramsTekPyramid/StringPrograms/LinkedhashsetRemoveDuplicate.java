package StringPrograms;

import java.util.LinkedHashSet;

public class LinkedhashsetRemoveDuplicate {

	public static void main(String[] args) {

		String  s = "welcome to tp welcome to gc18";
		String[] str = s.split(" ");//used to separate the statement w.r.t to space

		LinkedHashSet<String> hs = new LinkedHashSet();//maintains insertion Order & doesnt allow duplicates
		for (int i = 0; i < str.length; i++) {
			hs.add(str[i]+" ");
		}
		for (String o : hs) {
			System.out.print(o);
		}
	}

}
