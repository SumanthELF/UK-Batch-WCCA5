package interfaceConcept;

public class DriverP3 {

	public static void main(String[] args) {
		
		Program1 prg = new Program2();   //upcasting
		System.out.println(prg.a);
		System.out.println(prg.b);
		prg.print();
		prg.display();
		
		Program2 typeP = (Program2)prg;
		typeP.message();
		System.out.println(typeP.a);
		System.out.println(typeP.b);
		typeP.print();
		typeP.display();
		
	}

}
