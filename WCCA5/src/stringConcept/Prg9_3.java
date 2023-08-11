package stringConcept;

import java.util.Scanner;

public class Prg9_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String statement = sc.nextLine();

		String[] arr = statement.split(" ");
		
		for(int i=arr.length-1 ;i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
