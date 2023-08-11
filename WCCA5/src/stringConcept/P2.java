package stringConcept;

public class P2 {

	public static void main(String[] args) {
		
		String p1 = "Hi hello";
		String p2 = p1;
		
		System.out.println(p1);   //Hi hello
		System.out.println(p2);   //Hi hello
		System.out.println("==========================");
		p1 = "Welcome";
		
		System.out.println(p1);   //Welcome
		System.out.println(p2);   //Hi hello
		
	}
}
