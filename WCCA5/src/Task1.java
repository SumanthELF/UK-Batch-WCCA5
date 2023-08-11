
public class Task1 {

	static int a = 21;  //22 23
	static int b = 33;
	static int d; //1
	static int e; //1 2
	
	public static void main(String[] args) {
		int a = 22; // 23
		int b = 42; // 43
		
		int c = ++a + Task1.a++ + Task1.b + ++b + e++; //120 
		      //23 + 21 + 33 + 43 + 0
		System.out.println(c); //120
		System.out.println(d); //0
		int d = c +  ++Task1.d + Task1.a++ + ++e ;
		       // 120 +  1 + 22 +  2
		System.out.println(d);  //145
	}

}
