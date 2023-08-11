import java.util.Scanner;

public class AddTwoNumbers {

	// Accept two numbers and add
	public static void main(String[] args) {
		float num1;
		float num2;
		float sum;

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("Enter number 1 : ");
		num1 = sc.nextByte();

		System.out.println();
		System.out.println("Enter number 2 : ");
		num2 = sc.nextByte();

		sum = num1 + num2;  //adding byte and byte result is int

		System.out.println();
		System.out.println("The sum of number 1 " + num1 + " and number 2 " + num2 + " is " + sum);

	}
}
