package basicsOfOOP;

public class Driver {

	static int a = 10;
	static int x = 20;
	int b =55;
	
	static void print() {
		System.out.println("Welcome to Object");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(x);
		print();
		Program3 refVar = new Program3();
		System.out.println(refVar.y);
		System.out.println(refVar.x);
		refVar.test();
		refVar.display();
	}

}
