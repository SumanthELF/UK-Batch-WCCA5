package arrays;

import java.util.Scanner;

public class ArrayDemo6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
			
		int size = scan.nextInt();
		
		String [] sarr = new String[size];
		System.out.println("Enter the 5 different country names");
		
		for(int i=0; i<size; i++) {
			sarr[i] = scan.next();
		}
		
		for(int i =0; i<size ; i++) {
			System.out.print(sarr[i]+", ");
		}
		
	}
}
