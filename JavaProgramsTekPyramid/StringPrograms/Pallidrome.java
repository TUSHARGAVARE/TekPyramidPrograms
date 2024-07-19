package StringPrograms;

public class Pallidrome {

	public static void main(String[] args) {
    String s= "gadag";
    String res= "";
    
    for(int i=s.length()-1;i>=0;i-- ) {
    	res = res + s.charAt(i);
	}
if(s.equals(res)) {
	System.out.println("pallindrome");
}
else {
	System.out.println("not a pallindrome");
}
}
}