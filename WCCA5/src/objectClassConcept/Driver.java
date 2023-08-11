package objectClassConcept;

public class Driver {

	public static void main(String[] args) {		
		
		Program1 prg1 = new Program1(); //members of P1
		prg1.toString();
//		System.out.println("Instance of Program1 in prg1 ref " + (prg1 instanceof Program1));
//		System.out.println("Instance of Program2 in prg1 ref " + (prg1 instanceof Program2));
		System.out.println("Members of Object class " + (prg1 instanceof Object));
		
		System.out.println("==================================");
		
		Program2 prg2 = new Program2(); // members P1, P2
//		System.out.println("Instance of Program1 in prg2 ref " + (prg2 instanceof Program1));
//		System.out.println("Instance of Program2 in prg2 ref " + (prg2 instanceof Program2));
		System.out.println("Members of Object class " + (prg2 instanceof Object));

	}
}
