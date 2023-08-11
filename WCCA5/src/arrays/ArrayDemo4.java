package arrays;

public class ArrayDemo4 {

	public static void main(String[] args) {
		
		String arr [] = {"Ganesh","Ramesh","Suresh","Shivu","Vikas","Manoj","Kiran"};
		int lengthOfArr = arr.length;
		
		System.out.println("The size of array is " +lengthOfArr);
		
		//print the values in forward direction
		for(int i=0; i<lengthOfArr; i++) 
		{
			System.out.println(arr[i]);
		}
		
	}
}
