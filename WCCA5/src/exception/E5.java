package exception;

public class E5 {

	public static void main(String[] args) {
		System.out.println("Main begins");
		int a = 10;
		System.out.println("Value of a is " + a);
		int b = 0;
		System.out.println("Value of b is " + b);
		int result =0;
		try {
			result = divide(a, b);
		}catch(ArithmeticException e) {
			
		}
		if(result==0) {
			System.out.println("Pass a valid number");
		}else {
			System.out.println(a + " / " + b + " = " + result);
		}
		System.out.println("Main ends");
	}

	public static int divide(int a, int b) {
		System.out.println("Divide method begins");
		System.out.println("Performing division");
		int res = 0;
		try {
			res = a / b;
		}catch(ArithmeticException e){
			System.out.println("cannot divide by zero");
		}
		System.out.println("Divide method ends");
		return res;
	}

}
