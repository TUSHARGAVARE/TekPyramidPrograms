package StringsDay2;

public class CategoryProgram {

	public static void main(String[] args) {

		String s="sak$%45jl@#4k";
		String alphabet="";
		String number="";
		String special="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a'&& ch<='z') || (ch>='A'&& ch<='Z')) {
				alphabet+=ch;
			}
			else if(ch>='0'&&ch<='9') {
				number+=ch;
			}
			else
				special+=ch;
		}
		System.out.println("Alphabet: "+alphabet);
		System.out.println("Number: "+number);
		System.out.println("special character: "+special);
	}
}


