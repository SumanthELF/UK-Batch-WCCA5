package basicsOfOOP;

public class Actors {

	String actorName = "Prabhas";
	int age = 50;
	{
		System.out.println("loading and executing 1st IIB");
		actorName = "Rajanikanth";
		age = 70;
	}
	{
		System.out.println("loading and executing 2nd IIB");
		actorName = "Ajith";
		age = 52;
	}
	public Actors() {
		System.out.println("Executing user defined instruction in the constructor body");
	}
	public Actors(String a,String b, String c) {
		// add instructions to load
		// add all IIB non static blocks
		// user defined instructions in the constructor
	}
	public static void main(String[] args) {
		Actors actor = new Actors();
		System.out.println(actor.actorName);
		System.out.println(actor.age);
		Actors actor1 = new Actors("a", "b", "c");
	}
}
