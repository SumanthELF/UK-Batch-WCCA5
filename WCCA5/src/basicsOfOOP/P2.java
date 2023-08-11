package basicsOfOOP;

public class P2 {

	static int a=5;
	static int b=6;
	int x;
	int y;
	int accountbalance = 0;

	public static void main(String[] args) {

		System.out.println("===================");
		P2 obj1 = new P2();
		obj1.accountbalance=20000;
		obj1.x=22;
		obj1.y=33;
		System.out.println(obj1.accountbalance);
		System.out.println(obj1.y);
		System.out.println("===================");
		P2 obj2 = new P2();
		obj2.x=102;
		obj2.y=203;
		System.out.println(obj2.accountbalance);
		System.out.println(obj2.y);
		System.out.println("===================");
	}

}
