package stringConcept;

import java.util.Scanner;

public class Prg3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		int length = name.length();
		String lengthOfStr = " - " + length;
		
		System.out.println(name.concat(lengthOfStr));
	}

}
