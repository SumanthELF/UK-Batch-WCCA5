package methods;

public class Programm5 {

	public static void main(String[] args) {
		System.out.println("main method begins");
		add(14.5,(int)10.5); // actual args --> parameter
		System.out.println("main method ends");
	}
	
	// to pass data/parameter
	public static void add(double a, int b) {//formal args
		System.out.println("add method begins");
		double sum = a + b;
		System.out.println("The sum of "+a+" and "+b+" is "+sum);
		System.out.println("add method ends");
	}
	
	

}
