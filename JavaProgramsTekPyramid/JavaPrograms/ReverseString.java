package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Hello";
		char[] ch = name.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);
	}

}
