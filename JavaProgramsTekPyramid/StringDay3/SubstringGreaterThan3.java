package StringDay3;

public class SubstringGreaterThan3 {

	public static void main(String[] args) {

		String s = "India";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if(s.substring(i,j).length()>=3)
				System.out.print(s.substring(i, j) +" ");
			}
		}
	
	}

}
