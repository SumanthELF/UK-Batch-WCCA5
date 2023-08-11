package methods;

import java.util.Scanner;

public class Programm8 {

	public static void main(String[] args) {
		System.out.println("Main method begin");
		for (int i = 0; i < 3; i++) {
			employeeDetails();
		}
		System.out.println("Main method end");
	}

	public static void employeeDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String empName = sc.next();
		System.out.println("Enter your employement id");
		String empId = sc.next();
		System.out.println("Enter your phone number");
		long phoneNumber = sc.nextLong();
		System.out.println("Enter the grade");
		char empGrade = sc.next().charAt(0);
		System.out.println("================================");
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Phone num : " + phoneNumber);
		System.out.println("Employee Grade : " + empGrade);
		System.out.println("================================");
	}
}
