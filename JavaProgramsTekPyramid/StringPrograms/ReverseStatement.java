package StringPrograms;

public class ReverseStatement {

	public static void main(String[] args) {
		
		String  s = "welcome to tp welcome to gc18";
		
		String[] str = s.split(" ");//used to separate the statement w.r.t to space
		for(int i = str.length-1;i>=0;i--) 
		{
			System.out.print(str[i]+" ");
		}

	}

}
