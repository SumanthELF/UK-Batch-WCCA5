package stringConcept;

import java.util.Scanner;

public class Prg2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		String actualName = name.trim();
		int length = actualName.length();
		System.out.println("Your name consists of " + length + " of characters");
	}

}
