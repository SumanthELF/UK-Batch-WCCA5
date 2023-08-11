package objectClassConcept;

public class DriverP {

	public static void main(String[] args) {
		
		P1 ref = new P1(23);
		P1 refv = new P1(34);
		
		System.out.println(ref==refv);  //false
		
		System.out.println(ref.equals(refv)); //false
	}
}
