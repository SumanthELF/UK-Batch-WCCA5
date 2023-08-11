package arrays;

public class MyFirst {

	static int a =10;
	static int n;
	int b=5;
	int c;
	
	public MyFirst(int num) {
		System.out.println(a+","+b+","+c+","+n+","+num);
	}
	
	{
		b =30;
		n=20;
	}
	
	static {
		a =60;
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println();
		System.out.println();
		MyFirst m1 = new MyFirst(n);
		System.out.println();
				
	}
}





















