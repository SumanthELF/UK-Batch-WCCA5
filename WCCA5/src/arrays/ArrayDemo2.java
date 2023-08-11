package arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		int arr [] = {17,03,23,16,52,34,566,34,34,231,12,87,97,76,4,534,43,2,323,32,23};
		int lengthOfArr = arr.length;
		
		System.out.println("The size of array is " +lengthOfArr);
		for(int i=0; i<lengthOfArr; i++) 
		{
//			System.out.println(arr[i]);
		}
		
		//print the values in reverse direction
		for(int i=lengthOfArr-1; i>=0; i--) 
		{
			System.out.println(arr[i]);
		}
		
	}
}
