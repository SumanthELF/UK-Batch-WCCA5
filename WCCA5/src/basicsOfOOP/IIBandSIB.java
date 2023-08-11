package basicsOfOOP;

public class IIBandSIB {

	int x;
	static String name;
	
	static 	{
		System.out.println(name);
		System.out.println("I will be executed before main method");
		name = "Java Selenium";
	}	
	{
		System.out.println("I will be executed during the creation of object");
		x = 20;
	}	
	{
		System.out.println("I will be executed after the execution of first non static block");
		x = 50;
	}	
	static {
		name = "Only Selenium";
		System.out.println("executing secon static block");
	}	
	public static void main(String[] args) {
		System.out.println("main method begins");
		System.out.println("The name is : "+ name);
		System.out.println("main method ends");
		IIBandSIB refvar = new IIBandSIB();
		refvar.test();
	}
	public void test() {
		System.out.println("I will be executed only when called");
		System.out.println(x+25);
	}

}
