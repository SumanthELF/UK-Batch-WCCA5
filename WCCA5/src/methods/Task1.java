package methods;

public class Task1 {

	static String name = "ramesh";
	
	public static void main(String[] args) {
		
		System.out.println("main method begins");
		System.out.println("before calling update");
		System.out.println(name);
		update("Akash");
		System.out.println("after calling update");
		System.out.println(name);
		System.out.println("main method ends");
	}
	
	public static void update(String name) {
		System.out.println("Update started");
		name = "Suresh"; //re initializing the variable
		System.out.println("Update complete");
	}

}
