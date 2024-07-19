package JavaPrograms;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		String input = "Puneet is my panda";
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			char ch1 = Character.toLowerCase(ch);
			char ch2 = Character.toUpperCase(ch);
			if (output.indexOf(ch1) == -1 && output.indexOf(ch2) == -1) {
				output+= ch; // output=output + ch
			}
		}
		System.out.println(output);
	}

}