package arrays;


public class Sorting {

	public static void main(String[] args) {
		
		int[] arr = {20,18,27,77,34,45,66,12,8,89,103,43};
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int a : arr) {
			System.out.print(a+" , ");
		}
		System.out.println("The lowest number is "+arr[arr.length-1]);
		System.out.println("The highest number is "+arr[0]);
	}
}
