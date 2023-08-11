package abstractionConcept;
                             //both concrete methods and abstract methods
public abstract class Car {  //100% abstraction interface 

	String name_of_car;
	double price;
	int no_of_doors;
	
	public Car() { }
	
	public Car(String name, double price, int doors) {
		name_of_car = name;
		this.price = price;
		no_of_doors = doors;
	}
	
	public void transport() {
		System.out.println("Carrying things from one place to another");
	}
	
	public abstract void race();
	
	public abstract void drift();
}
