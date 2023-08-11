package accessSpecifier;

public class ClassA {

	int privatemember = 44 ;

	public void dance() {
		privatemember = 55;
		System.out.println("From dance method");
		System.out.println(privatemember);
		System.out.println("Disco");
	}
}
