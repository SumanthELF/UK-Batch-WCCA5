
public class FindLargestOf3Numbers {

	public static void main(String[] args) {
		int a = 43;
		int b = 113;
		int c = 22;
		
		// two ternary operators	
//		int result1 = (a>b) ? a : b;
//		int largest = (result1>c) ? result1 : c;
//		System.out.println("The largest out of 3 numbers is " + largest);
		
		// using one ternary operator
		int highest = (a>b) ? (a>c ? a : c) : (b>c ? b : c);
		System.out.println("Highest number is " + highest);
	}

}
