package interfaceConcept;

public class AA {

	//constructor overloading
	public AA() {
		System.out.println("Default constructor");
	}

	public AA(int a) {
		this();
		System.out.println(a);
		System.out.println("Constructor 1 -> AA(int) ");
	}
	
	public AA(int a, int b) {  // from one constructor you can call only one constructor
		this(a);
		System.out.println(a);
		System.out.println(b);
		System.out.println("Constructor 2 -> AA(int,int) ");
	}
}
