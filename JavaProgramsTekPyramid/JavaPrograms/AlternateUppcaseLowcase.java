package JavaPrograms;

public class AlternateUppcaseLowcase {

	public static void main(String[] args) {

		String str = "Listen";
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i = i + 2) 
		{
			ch[i] = Character.toUpperCase(ch[i]);
		}
		System.out.println(ch);
	}
}