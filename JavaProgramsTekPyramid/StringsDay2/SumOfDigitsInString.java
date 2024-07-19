package StringsDay2;

public class SumOfDigitsInString {

	public static void main(String[] args) {

		String s="12sgj12jdo12";
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				sum=sum+(ch-48);//converting the char into int
			}
		}
		System.out.println("Sum: "+sum);
	}
	}


