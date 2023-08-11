package arrays;

import java.util.Scanner;

public class ArrayDemo5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		double [] darr = new double[size];
		System.out.println("Enter the data");
		
		for(int i=0; i<size; i++) {
			darr[i] = scan.nextDouble();
		}
		
		for(int i =0; i<size ; i++) {
			System.out.print(darr[i]+", ");
		}
		
	}
}
