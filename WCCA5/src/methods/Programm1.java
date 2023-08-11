package methods;

public class Programm1 {
	
	public static void laila() 
	{
		System.out.println("Laila method begins");
		System.out.println("Hello");
		System.out.println("laila method ends");
	}
	
	public static void main(String[] args) { //JVM 
		System.out.println("Main method begin");
		System.out.println("welcome");
		laila();  // method call stmt
		System.out.println("main method ends");
	}
	

}
