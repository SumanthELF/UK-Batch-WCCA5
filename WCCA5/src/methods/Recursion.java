package methods;

//method calling 
public class Recursion {

	static long product = 1;

	public static void main(String[] args) {
		factorial(13);
		System.out.println("The factorial is " + product);
	}

	public static void factorial(int num) {
		product = product * num;
		if (num != 1) {
			factorial(num - 1);
		}

	}
}
