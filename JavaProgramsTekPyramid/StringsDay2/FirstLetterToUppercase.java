package StringsDay2;

public class FirstLetterToUppercase {

	public static void main(String[] args) 
	{

		String s = "India are world champions in 2024";
		String[] str = s.split(" ");//split the string into words from space
		for(int i=0;i<str.length;i++)
		{
			//first character to Uppercase
			String s1=str[i];
			s1=Character.toUpperCase(s1.charAt(0))+s1.substring(1);
			System.out.print(s1+" ");
		}
	}

}
