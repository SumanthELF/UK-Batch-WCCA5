package oops;

public class Engine {

	private int engineNum;
	private int noOfCylinders;
	private double cc;
	private double hp;
	
	public Engine(int engineNumber, int cylinders, double capacity, double power) {
		engineNum = engineNumber;
		noOfCylinders = cylinders;
		cc = capacity;
		hp = power;
	}
	
	public void engineDetails() {
		System.out.println(engineNum);
		System.out.println(noOfCylinders);
		System.out.println(cc);
		System.out.println(hp);
	}
	
}
