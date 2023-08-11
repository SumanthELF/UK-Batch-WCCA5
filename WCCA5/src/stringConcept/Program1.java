package stringConcept;

public class Program1 { 

	public static void main(String[] args) {
		String name = new String("Selenium");
		String value = new String("Selenium");
		System.out.println(name==value);
		
//		System.out.println(name.toString());
		System.out.println(name.equals(value));
		
		String data = "Crash course";
		String copy = data;
		
		System.out.println(data==copy);
		data = "Revision";
		
		System.out.println(data==copy);  //101    100
	}
}
