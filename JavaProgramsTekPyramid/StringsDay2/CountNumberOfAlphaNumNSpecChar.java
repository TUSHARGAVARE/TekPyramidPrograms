package StringsDay2;

public class CountNumberOfAlphaNumNSpecChar {

	public static void main(String[] args) {

		String s="abh234$##hjk@#$";
	     int alphabetLower=0;
	     int alphabetUpper=0;
	     int digits=0;
	     int specialChar=0;
	     for(int i=0;i<s.length();i++) {
	    	 char c=s.charAt(i);
	    	 if(c>='a'&&c<='z') {
	    		 alphabetLower++;
	    	 }
	    	 else if(c>='A'&&c<='Z') {
	    		 alphabetUpper++;
	    	 }
	    	 else if(c>='0'&&c<='9') {
	    		 digits++;
	    	 }
	    	 else
	    		 specialChar++; 
	     }
	     
	     System.out.println("AlphabetLower : "+alphabetLower);
	     System.out.println("alphabetUpper : "+alphabetUpper);
	     System.out.println("digits : "+digits);
	     System.out.println("specialChar : "+specialChar);
	     
		}
	
	}


