package methods;

public class Programm2 {

	public static void main(String[] args)  // calling method
	{
		System.out.println("Main method begins");
		System.out.println("Hi welcome");
		greet();  // method call stmt
		System.out.println("Main method ends");
	}	
	
	public static void greet() // called method
	{
		System.out.println("Greet begins");
		System.out.println("Hola");
		welcome();  // method call stmt
		System.out.println("Greet ends");
	}
	
	public static void welcome() 
	{
		System.out.println("Namaste");
	}

}
