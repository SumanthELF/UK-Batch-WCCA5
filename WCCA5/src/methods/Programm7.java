package methods;

public class Programm7 {

	public static void main(String[] args) {
		System.out.println("main begins");
		System.out.println(squareOfANumber(5));
		
		// to find the sum of 2 square and 3 square
		System.out.println(squareOfANumber(2) + squareOfANumber(3));
		int a = 20;
		int b = 30;
		int prod = product(a, b);
		System.out.println("The product of " + a + " and " + b + " is " + prod);
		System.out.println(factorial(5));
		System.out.println(factorial(10));
		System.out.println("main ends");		
	}

	public static int squareOfANumber(int a) {
		int square = a * a;
		return square;
	}

	public static int product(int a, int b) {
		return a * b;
	}
	
	public static int factorial(int a) 
	{
		int factorial = 1;
		for(int i=a; i>0; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}

	// WA method to calculate the product of 2 numbers //method to calculate
	// factorial of a number 
	// 5 -> 5*4*3*2*1 
	//      1*2*3*4*5
	//8 -> 8*7*6*5*4*3*2*1
}
