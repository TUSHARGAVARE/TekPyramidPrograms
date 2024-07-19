package JavaPrograms;

public class LargeSmallNumArray {

	public static void main(String[] args) {
		// numbers array
		int numbers[] = new int[] { 1, 3, 5, 6, 2, 7 };

		// assign first element of an array to largest and smallest
		int smallest = numbers[0];
		int largest = numbers[0];

		for (int i = 1;i < numbers.length; i++) {
			if (numbers[i] > largest)
				largest = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
		}

		System.out.println("Largest Number is : " + largest);
		System.out.println("Smallest Number is : " + smallest);
	}
}
