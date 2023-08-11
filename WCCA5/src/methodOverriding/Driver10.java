package methodOverriding;

class A {

	static int a = 20;

	public static void message() {
		System.out.println("Hi");
	}
}

class B extends A {

	static int a = 45;

	public static void message() { // static methods are not overridden
		System.out.println("Hello");
	}
}

public class Driver10 {
	public static void main(String[] args) {

		A ref = new B();
		System.out.println(ref.a);
		ref.message(); // method shadowing

//		A a = new A();
//		a.message();

//		B b = new B();
//		b.message();
	}
}


// inheritance
// method overriding
