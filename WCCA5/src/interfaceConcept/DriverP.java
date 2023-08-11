package interfaceConcept;

public class DriverP {

	public static void main(String[] args) {
		
		System.out.println(Program2.b);
		Program2.display();
		System.out.println("================================");
		Program2 prg = new Program2();
		System.out.println(prg.a);
		prg.print();
		prg.message();
	}

}
