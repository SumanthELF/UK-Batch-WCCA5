
public class UnaryOperator {

	public static void main(String[] args) {
		
		int a = 12;  //13 //14 //15
		int b = ++a; //13 // 14 //15
		int c = b++ + ++a; //13 + 14 = 27 // 28
		int result = a++ + ++b + c++; //14 + 15 + 27 // 56
		System.out.println(a); //15
		System.out.println(b); //15
		System.out.println(c); //28
		System.out.println(result); //56
	}

}
