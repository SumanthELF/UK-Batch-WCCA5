package basicsOfOOP;

public class InitializerDemo2 {
	
	int x;
	boolean y;
	
	{
		System.out.println("block 1");
		System.out.println("before creating object");
		x=110;
		y=false;
	}
	
	{
		System.out.println("block 2");
		System.out.println("before creating object");
		x=110;
		y=false;
	}
	
	public void test() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		System.out.println("Hi welcome");
		InitializerDemo2 refvar = new InitializerDemo2();
		System.out.println("Object created once ");
		System.out.println(refvar.x); 
		System.out.println(refvar.y);
		InitializerDemo2 refvar1 = new InitializerDemo2();
		System.out.println("Object created for the second time");
		System.out.println(refvar1.x);
		System.out.println(refvar1.y);
	}
	
	{
		System.out.println("block 3");
		System.out.println("before creating object");
		x=110;
		y=false;
	}
}
