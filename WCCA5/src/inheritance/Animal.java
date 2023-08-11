package inheritance;

public class Animal {

	public Animal(int age) {
		this.age=age;
	}
	
	int age;
	String type;
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void sound() {
		System.out.println("Make some noise");
	}
}
