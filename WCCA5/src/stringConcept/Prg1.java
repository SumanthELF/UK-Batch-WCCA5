package stringConcept;

import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		System.out.println("Enter the city where you live");
		Scanner sc = new Scanner(System.in);
//		String city = sc.nextLine();
//		String value = city.toUpperCase();
//		System.out.println(value);
		System.out.println(sc.nextLine().toUpperCase());
		
	}

}
