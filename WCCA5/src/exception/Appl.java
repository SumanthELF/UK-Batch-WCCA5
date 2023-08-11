package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Appl {

	static int total_cost_item;
	static int qty;
	static int per_item_cost;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total cost");
		
		try {
			total_cost_item = sc.nextInt();
			System.out.println("Enter the quantity");
			qty = sc.nextInt();
			System.out.println("Calculating the Item cost of an item");
			per_item_cost = total_cost_item/qty;
			System.out.println("Cost of one item is "+ per_item_cost);			
		}catch(ArithmeticException e) {
			System.out.println("Quantity cannot be zero");
		}catch(InputMismatchException e) {
			System.out.println("Please enter the correct input");
		}catch(Exception e) {
			
		}
		
	}

}
