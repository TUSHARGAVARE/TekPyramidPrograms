package JavaPrograms;

public class LongWordString {


	public static void main(String [] args) {
		String str = "I am a Student";
		String[] word =str.split(" ");
		String longword="";
		for(int i=0;i<word.length;i++)
		{
			if(word[i].length()>= longword.length()) {
				longword=word[i];
			}
		}
		System.out.println(longword);
	}
}