package arrays;

public class Lowest {

	public static void main(String[] args) {
		int[] arr = {20,18,27,77,34,45,66,12,8,89,103,43};
		
		int lowest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(lowest>arr[i]) {
				lowest = arr[i];
			}
		}
		System.out.println("The lowest number in the given array is "+lowest);
	}

}
