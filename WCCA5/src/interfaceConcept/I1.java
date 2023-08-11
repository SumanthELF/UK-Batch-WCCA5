package interfaceConcept;

public interface I1 {  //abstract is added by default
	
	//interface will not have constructor
	
	// by default all the variables declared in an interface will be
	// having public static and final 
	
	//non static method abstract

	int a = 25;  // public static final

	public void session(); 
	
	static void display() {
		System.out.println("I am a static method form Interface I1");
	}
	
}
