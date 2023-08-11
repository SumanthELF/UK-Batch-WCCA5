package stringConcept;

import java.util.Scanner;

public class Prg7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("Enter the character to check");
		String charToSearch = sc.next();
		int position = name.indexOf(charToSearch);
		if(position==-1) {
			System.out.println("The given character is not present in the given String ".concat(name));
		} else {
			System.out.println("The given character is present in "+position);
		}
	}

}
