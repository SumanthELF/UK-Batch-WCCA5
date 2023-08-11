package basicsOfOOP;

public class InitializerDemo {

	static int a;
	static 
	{
		System.out.println("before initializing a in static block");
		System.out.println(a);
		a =10;
		if(true) {
			a=30;
		}
		System.out.println("Third static initializer");
	}
	
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println("hi");
	}

}
