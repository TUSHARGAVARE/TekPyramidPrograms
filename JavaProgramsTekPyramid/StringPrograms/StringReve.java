package StringPrograms;

public class StringReve {

	public static void main(String[] args) {
		 String s= "india";
		    String res= "";
		    
		    for(int i=s.length()-1;i>=0;i-- ) {
		    	res = res + s.charAt(i);
		    	
			}
		    System.out.println(res);
	}

}
