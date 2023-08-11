package stringConcept;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.next(); 
		int upperCaseCount = 0;
		int splCharCount = 0;
		int numberCount = 0;

		if (password.length() >= 8) {
			char ch = password.charAt(0);
			if (ch >= '0' && ch <= '9' || ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				for (int i = 0; i < password.length(); i++) {
					char letter = password.charAt(i);
					if (letter != ' ') {
						if (letter >= '0' && letter <= '9') {
							numberCount++;
						} else if (letter >= 'A' && letter <= 'Z') {
							upperCaseCount++;
						} else if (!(ch >= 'a' && ch <= 'z')) {
							splCharCount++;
						}
					} else {
						System.out.println("Password should not contain spaces in between");
						break;
					}
				}
				if (numberCount > 0 && upperCaseCount > 0 && splCharCount > 0) {
					System.out.println("It is a valid password");
				} else {
					System.out.println(
							"Password should contain atlease one uppercase character, one special character, one number");
				}
			} else {
				System.out.println("Password should not start with special characters");
			}
		} else {
			System.out.println("The Password length should be atleast 8 characters");
		}

	}

}
