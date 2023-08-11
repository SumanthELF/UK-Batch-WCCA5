package methods;

import java.util.Scanner;

public class ReadDataFromKeyboard {

	public static void main(String[] args) {
		
		//Step 1: 
		Scanner sc = new Scanner(System.in);
		
		//Step 2: 
		System.out.println("Enter the length of a rectangle ");
		int lenght = sc.nextInt();
		
		System.out.println("Enter the breadth of a rectangle ");
		int breadth = sc.nextInt();
		
		System.out.println("Area of Rectangle is " +areaOfRectangle(lenght, breadth));
		
	}
	
	public static int areaOfRectangle(int length, int breadth) {
		int area = length * breadth;
		return area;
	}

	//addition of two numbers entered by user
	//multiplication of two numbers entered by user
}
