package StringDay3;

public class ExpandString {

	public static void main(String[] args) {

		String s1 = "a2b3c1a1b2";
		//a-2,b-2,,c-2,a-1,be=2
		for(int i=0;i<s1.length()-1;i=i+2)
		{
			char ch = s1.charAt(i);//a b c a b
			int count = s1.charAt(i+1)-48;//2 2 1 1 2
			for(int j=0;j<count;j++)
			{
				System.out.print(ch);
			}
		}
		
	}

}
