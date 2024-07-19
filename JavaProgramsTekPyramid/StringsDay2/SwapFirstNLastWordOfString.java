package StringsDay2;

public class SwapFirstNLastWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is Dora";
		String[] str = s.split(" "); String temp="";
		temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		for(String s1:str) {
			System.out.print(s1+" ");
		}
	}

}


