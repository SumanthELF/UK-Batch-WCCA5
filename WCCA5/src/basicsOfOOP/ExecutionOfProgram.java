package basicsOfOOP;

public class ExecutionOfProgram {

	int a ;
	static int b;
	
	static {
		System.out.println("Executed after Loading global static members");
		System.out.println(b);
		b=20;
	}
	
	{
		System.out.println("Executes after loading non static members and befre executing constructor block");
		System.out.println(a);
		a = 10;
	}
	
	public ExecutionOfProgram(int data) {
		// add non static blocks
		System.out.println("Executed after executing non static block");
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
		ExecutionOfProgram ep = new ExecutionOfProgram(30);
	}
}
