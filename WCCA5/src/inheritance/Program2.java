package inheritance;

public class Program2 extends Program1 {

	int j = 78;
	
	public static void main(String[] args) {
		
		Program2 ref = new Program2();
		System.out.println(ref.a);
		System.out.println(ref.b);
		ref.add();
		ref.message();
		System.out.println(ref.j);
		
	}
}
