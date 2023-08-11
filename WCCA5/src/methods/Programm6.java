package methods;

public class Programm6 {

	public static void main(String[] args) {
		System.out.println("main method begins");
		add(14.5,(int)10.5); // actual args --> parameter
		int result = add(20.1,10);
		System.out.println("Sum is "+result);
		System.out.println("main method ends");
	}
	
	
	public static int add(double a, int b) 
	{
		int sum = (int) (a + b);
		return sum;
	}
	
	

}
