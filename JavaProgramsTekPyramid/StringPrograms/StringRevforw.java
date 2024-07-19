package StringPrograms;

public class StringRevforw {

	public static void main(String[] args) {
		 String s= "india";
		    String res= "";
		    
		    for(int i=0;i<s.length();i++ ) {
		    	res = s.charAt(i)+res;
		    	
			}
		    System.out.println(res);
	}

}

