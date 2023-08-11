package arrays;

public class Highest {

	public static void main(String[] args) {
		int[] arr = {20,18,27,77,34,45,66,12,8,89,103,43};
		
		int highest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(highest<arr[i]) {
				highest = arr[i];
			}
		}
		System.out.println("The highest number in the given array is "+highest);
	}

}
