package arrays;

public class ArrayDemo8 {

	public static void main(String[] args) {

		int[] arr = { 123, 235, 442, 657, 689, 578, 234 };

		int evenCount = 0;
		int oddCount = 0;
		
		// count the even num present in the array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			}
		}

		// count odd num present in the array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		
		System.out.println("Total number of even numbers present in the array is "+evenCount);
		System.out.println("Total number of odd numbers present in the array is "+oddCount);
	}
}
