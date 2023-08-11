package stringConcept;

import java.util.Scanner;

public class ConvertToUppercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String text = sc.next();
		
		for(int i=0; i<text.length(); i++) {
			System.out.print((char)(text.charAt(i)-32));
		}
	}

}
