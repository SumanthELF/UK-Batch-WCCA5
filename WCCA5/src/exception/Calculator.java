package exception;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("main begin");
		System.out.println("calling method of Addition class");
		Addition ref = null;
		ref.add(10,20);
		System.out.println("main end");
		
//		Thread.sleep(2000);  //pause the execution of your program for 2 seconds
	}
}
