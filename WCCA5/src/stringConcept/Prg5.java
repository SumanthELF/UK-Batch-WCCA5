package stringConcept;

import java.util.Scanner;

public class Prg5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fruit name");
		String fruit = sc.nextLine();
		
		System.out.println(fruit.substring(0, 3));		
	}

}
