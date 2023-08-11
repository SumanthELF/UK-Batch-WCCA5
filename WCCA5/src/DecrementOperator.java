
public class DecrementOperator {

	public static void main(String[] args) {
		
		int a = 12;   // 13 // 14 // 15
		int b = 8 + ++a;  //8+13 21 // 22 // 21
		int c = 11 + a++ + ++b;  // 11+13+22 //46 47
		
		int result = a++ + --b + c++; //14 + 21 + 46
		System.out.println(result); //81
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
