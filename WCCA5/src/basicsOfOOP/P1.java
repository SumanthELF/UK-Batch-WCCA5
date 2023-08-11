package basicsOfOOP;

public class P1 {

	static int a = 10;	
	int b = 20;	

	public static void print() 
	{
		System.out.println("Hi i am a static method");
	}
	
	public void display() 
	{
		System.out.println("Hello I am a non static method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		print();
		System.out.println(new P1().b);
		new P1().display();
	}

}
