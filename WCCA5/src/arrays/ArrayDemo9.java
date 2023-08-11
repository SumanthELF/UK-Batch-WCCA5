package arrays;

public class ArrayDemo9 {

	//calculate the sum of all the values present in an array
	public static void main(String[] args) {

		int [] arr = {9,65,23,45,12,67,78,89};
		int sumOfArr = 0;
		
		for(int i=0; i<arr.length; i++) {
			sumOfArr = sumOfArr + arr[i];
		}
		
		int a = 10;
		double b = a;
		if(a==10) 
			System.out.println("Hi");
		else if(true)
			System.out.println("Welcome");
		else
			System.out.println("");
		
		int c = (int) b;
		System.out.println("Total number of vowels present in the array is " + sumOfArr);
	}
}

// WAJP to calculate the product of all the numbers present in an array
// WAJP to find the prime numbers present in the given array
// WAJP to find the sum of factorial of each number in the given array
// WAJP to find the sum of squares of each number

