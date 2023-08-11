package stringConcept;

public class P3 {

	public static void main(String[] args) {
		String value = "Java - Selenium";
		String data = "Java - Selenium";
		
		String ref = new String("Java - Selenium");
		String ref1 = new String("Selenium");
		
		System.out.println(ref==ref1);
		System.out.println(ref.equals(ref1));
	}

}
