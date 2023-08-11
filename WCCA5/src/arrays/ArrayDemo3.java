package arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		
		String arr [] = {"Ganesh","Ramesh","Suresh","Shivu","Vikas","Manoj","Kiran"};
		int lengthOfArr = arr.length;
		
		System.out.println("The size of array is " +lengthOfArr);
		
		//print the values in reverse direction
		for(int i=lengthOfArr-1; i>=0; i--) 
		{
			System.out.println(arr[i]);
		}
		
	}
}
