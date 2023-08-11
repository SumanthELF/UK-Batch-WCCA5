package accessSpecifier;

public class Demo {

	protected String name = "Sumanth";
	
	public static void main(String[] args) {
		
		ClassA ref = new ClassA();
		System.out.println(ref.privatemember);
		ref.dance();
	}
}
