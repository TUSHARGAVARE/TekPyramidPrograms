package StringsDay2;

public class RecursionTrynCatch {

	public static void main(String[] args) {

		String input = "Pyramid";
		String op = "";
		int i = 0;
		while (true) {
			try {
				char ch = input.charAt(i);
				op =  ch+op;
				i++;
			} catch (StringIndexOutOfBoundsException s) {
				break;
			}
		}
		System.out.println(op);
	}

}
