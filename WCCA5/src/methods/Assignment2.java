package methods;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Select any one mobile name from the below list");
		System.out.println("samsung, iphone, oneplus, vivo, redmi");
		String mobile = scan.next();
		mobileCost(mobile);
	}

	public static void mobileCost(String mobileName) {

		switch (mobileName) {
		case "samsung":
			System.out.println("The cost of " + mobileName + " is Rs.30000");
			break;
		case "iphone":
			System.out.println("The cost of " + mobileName + " is Rs.99000");
			break;
		case "oneplus":
			System.out.println("The cost of " + mobileName + " is Rs.45000");
			break;
		case "vivo":
			System.out.println("The cost of " + mobileName + " is Rs.15000");
			break;
		case "redmi":
			System.out.println("The cost of " + mobileName + " is Rs.18000");
			break;
		default : System.out.println("Invalid Mobile name");
		}
	}

}
