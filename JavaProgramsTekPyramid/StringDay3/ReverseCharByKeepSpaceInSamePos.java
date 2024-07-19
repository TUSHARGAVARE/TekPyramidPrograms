package StringDay3;

public class ReverseCharByKeepSpaceInSamePos {

	public static void main(String[] args) {

		String s = "i love india";

		String s1=s.replaceAll(" ","");//iloveindia replace space with no space
		int n = s1.length()-1;//last index of s1
		for(int i=0;i<s.length();i++)//to read original string
			if(s.charAt(i)==' ')
			{
				System.out.print(' ');
			}
			else
			{
				System.out.print(s1.charAt(n));//print from reverse order
				n--;//
			}
	}

}
/*
 * String s="i love india" s1=iloveindia
 * remove space
 * n=s1.length()-1
 * for(int i =0;i<s.length();i++
 * 
 */