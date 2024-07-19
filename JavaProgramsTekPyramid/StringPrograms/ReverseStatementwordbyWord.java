package StringPrograms;

public class ReverseStatementwordbyWord {

	public static void main(String[] args) {

		String s ="My Name is Dora";
		String [] str= s.split(" ");//split at space n store inside var
		for(int i=0;i<str.length;i++)//loop is used to iterate array index
		{
			String input = str[i];
			for(int j=input.length()-1;j>=0;j--)//reverse the elements access the char of string
			{
				System.out.print(input.charAt(j));
			}
			System.out.print(" ");
		}
		
	}

}
