package methods;

import java.util.Scanner;

public class Factorial {

	static int result = 1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		fact(num);
		System.out.println("The factorial of the given number "+num+" is "+result);
	}

	public static int fact(int n) {
		result = result * n;
		n--;
		if (n >= 1)
			fact(n);
		return result;
	}
}
