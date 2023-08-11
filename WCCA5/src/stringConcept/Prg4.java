package stringConcept;

import java.util.Scanner;

public class Prg4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your city name");
		String city = sc.nextLine();
		
		System.out.println("Enter the character to check");
		String charToFind = sc.next();
		
		boolean flag = city.contains(charToFind);
		if(flag) {
			System.out.println(charToFind + " is present in " + city);
		}else {
			System.out.println(charToFind + " is not present in " + city);
		}
	}

}
