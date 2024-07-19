package StringDay3;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {

		String str1 = "Race";
		String str2 = "Care";
		boolean flag = true;

		if (str1.length() != str2.length()) {
			flag = false;
			System.out.println("Not An Anagram");
			return;
		} else {
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();

			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					flag = false;//if not used then print 4 times
					System.out.println("Not a Anagram");
					break;
				}
			}
		}
		if (flag) {
			System.out.println("Anagram");
		}
	}

}
