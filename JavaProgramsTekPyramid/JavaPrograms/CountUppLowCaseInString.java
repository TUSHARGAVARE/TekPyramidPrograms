package JavaPrograms;

public class CountUppLowCaseInString {


			public static void main(String args[])
			{
				String str = "I am a traVeLLer";
				int uppercount = 0, lowercount = 0;

				for(int i = 0; i < str.length(); i++)
				{
					char ch = str.charAt(i);
					if (ch >= 'A' && ch <= 'Z')
						uppercount++;
					else if (ch >= 'a' && ch <= 'z')
						lowercount++;
					
					
				}
				System.out.println("Upper case letters : " + uppercount);
				System.out.println("Lower case letters : " + lowercount);
		

	}

}
