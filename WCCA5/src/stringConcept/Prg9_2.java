package stringConcept;

import java.util.Scanner;

public class Prg9_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String statement = sc.nextLine();

		String[] arr = statement.split("z");
		System.out.println("The given stat has "+ arr.length + " words");
	}

}
