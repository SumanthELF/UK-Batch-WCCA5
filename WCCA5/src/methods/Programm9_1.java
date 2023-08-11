package methods;

public class Programm9_1 {

	static int a = 10;
	
	public static void main(String[] args) {
		System.out.println("main method begins");
		
		System.out.println(add(8,7.5));//compile time binding
		System.out.println(sub(5,9));
		System.out.println(product(4,4));
		System.out.println(div(5,7));
		
		System.out.println("main method ends");
	}
	
	//change the arguments like 
	//difference in data type, 
	//difference in length of the formal arguments,
	//difference in the order of occurrence of data type
	
	//addition
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static double add(int a, double b) {
		return a+b;
	}
	
	public static double add(double a, int b) {
		return a+b;
	}
	
	public static double add(double a, double b, double c) {
		return a+b+c;
	}
	
	//subtraction
	public static int sub(int a, int b) {
		return a-b;
	}
	
	//multiplication
	public static int product(int a, int b) {
		return a*b;
	}
	
	//division
	public static int div(int a, int b) {
		return a/b;
	}

}
