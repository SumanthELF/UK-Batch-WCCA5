package oops;

public class ClassB extends ClassA {
	
	ClassB(){	
		super(5);
		System.out.println("Hi i am ClassB constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome back");	
		ClassB ref = new ClassB();
		ref.display();
	}
}
