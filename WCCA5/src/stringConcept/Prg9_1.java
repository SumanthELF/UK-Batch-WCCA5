package stringConcept;

import java.util.Scanner;

public class Prg9_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();

//		for(int i = name.length()-1 ; i>=0 ; i--) {
//			System.out.print(name.charAt(i));
//		}
		
		String rev = ""; //k ak sak hsak mhsak imhsak rimhsak
		for(int i=0; i<name.length(); i++) {
			rev = name.charAt(i) + rev; //r + imhsak
		}
		System.out.println(rev);
	}

}
