package arrays;

public class ArrayDemo7 {

	public static void main(String[] args) {

		int[] arr = { 123, 235, 442, 657, 689, 578, 234 };

		// print even num present in the array
		System.out.println("Prinitng even numbers");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("=================================");
		// print odd num present in the array
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
