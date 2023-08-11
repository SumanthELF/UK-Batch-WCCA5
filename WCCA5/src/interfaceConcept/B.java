package interfaceConcept;

public class B extends A {

	int a = 200;
	
	public void storm() {
		System.out.println("!!!!!!!!!!!!!!");
	}
	
	public void display( ) {    // this() and super()  --> for constructor chaining 
		int a = 300;                            //this   and super
		System.out.println("local variable a : " + a);
		System.out.println("global variable of class b "+this.a);
		System.out.println("Super class member " + super.a);
		super.rain();
		this.storm();
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.display();
		
	}
}
