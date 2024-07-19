package StringDay3;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		
		System.out.println("Before Swapping");
		System.out.println("x :"+x);
		System.out.println("x :"+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping");
		System.out.println("x :"+x);
		System.out.println("y :"+y);
		
		
		
	}

}
