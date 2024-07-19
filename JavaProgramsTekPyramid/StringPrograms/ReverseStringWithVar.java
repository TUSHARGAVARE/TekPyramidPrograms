package StringPrograms;

public class ReverseStringWithVar {

	public static void main(String[] args) {
			String s = "india";
			char[] ch = s.toCharArray();
			String rev = "";
			for (int i = ch.length - 1; i >= 0; i--) {
				rev = rev + ch[i];
			}
			System.out.println(rev);
		}

}
