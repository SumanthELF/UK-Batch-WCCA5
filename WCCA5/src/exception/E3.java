package exception;

public class E3 {

	public static void main(String[] args) {		
		System.out.println("Main begins");
		int a = 10;
		System.out.println("Value of a is "+a);
		int b = 0;
		System.out.println("Value of b is "+b);
		int result = divide(a,b);
		System.out.println(a+" / "+b +" = " + result);
		System.out.println("Main ends");		
	}
	
	public static int divide(int a, int b) {
		System.out.println("Divide method begins");
		System.out.println("Performing division");
		int res = a/b;
		System.out.println("Divide method ends");
		return res;
	}

}
