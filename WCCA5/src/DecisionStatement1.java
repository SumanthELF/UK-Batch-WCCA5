
public class DecisionStatement1 {

	static int a = 25; //48
	
	public static void main(String[] args) {
		System.out.println("main method begins");
		int num = 23;
		
		if(num > 10)
		{
			a += 23;  // a = a + 23;
			System.out.println("The number is greater than 10");
		}
		System.out.println(a);
		System.out.println("main method ends");
	}

}
