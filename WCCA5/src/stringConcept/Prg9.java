package stringConcept;

import java.util.Scanner;

public class Prg9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();

		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			System.out.println(ch +" - "+ (int)ch);
		}
	}

}
