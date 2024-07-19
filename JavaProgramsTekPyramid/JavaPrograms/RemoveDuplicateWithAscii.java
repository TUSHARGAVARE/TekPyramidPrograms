package JavaPrograms;

public class RemoveDuplicateWithAscii {

	public static void main(String[] args) {
		String input = "Puneet is my panda0101";
		String output="";
		
		for(int i=0;i<input.length();i++)
		{
		char ch = input.charAt(i);
		char ch1='\u0000';
		char ch2='\u0000';
		if(ch>='a' && ch<='z') {
			ch1=(char)(ch-32);
		}
		else 
			ch1=ch;
		
		if(ch>='A' && ch<='Z') {
			ch2=(char)(ch+32);
		}
		else
			ch2=ch;
		if (output.indexOf(ch1) == -1 && output.indexOf(ch2) == -1) {
			output+= ch; // output=output + ch
		}
		}
		System.out.println(output);
	}

}
