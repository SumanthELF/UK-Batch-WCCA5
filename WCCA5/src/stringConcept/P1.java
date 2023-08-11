package stringConcept;

public class P1 {

	public static void main(String[] args) {
		
		String name = "hello";
		String msg = "Hello";
		String data = "heLLo";
		
		System.out.println(name==msg);
		System.out.println(msg==data);
		System.out.println(data==name);
		
		System.out.println(name.equals(msg));
	}
}
