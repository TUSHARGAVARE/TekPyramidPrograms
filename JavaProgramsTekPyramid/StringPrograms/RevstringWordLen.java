package StringPrograms;

public class RevstringWordLen {

	public static void main(String[] args) {
		String s = "India";
		String res = "";
		for (char value : s.toCharArray()) {
			res = value + res;	
		}
		System.out.println(res);
	

	}

}
