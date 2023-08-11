package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {

		System.out.println("main begins");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			int a = sc.nextInt();
			System.out.println("Enter another number");
			int b = sc.nextInt();
			System.out.println("Performing division");
			int res = a / b; // b is 0
			System.out.println("Dividing " + a + " by " + b + " and the result is " + res);
		} catch (ArithmeticException e) {
			System.out.println("You cannot divide a number by zero");
		} catch(InputMismatchException e) {
			System.out.println("Please enter a valid number");
		}
		System.out.println("main ends");
	}
}
