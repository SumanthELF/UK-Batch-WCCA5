package oops;

public class Car {

	private int chasisNumber;
	private String regNum;
	private String color;
	private String brand;
	Engine engineRef = new Engine(chasisNumber, chasisNumber, chasisNumber, chasisNumber);

	public Car(int chasis, String registerationNum, String colour, 
			String company, int engineNumber, int cylinders,
			double capacity, double power) {
		chasisNumber = chasis;
		regNum = registerationNum;
		color = colour;
		brand = company;
		engineRef = new Engine(engineNumber, cylinders, capacity, power);
	}
	
	public Car(int chasis, String registerationNum, String colour, 
			String company) {
		chasisNumber = chasis;
		regNum = registerationNum;
		color = colour;
		brand = company;
	}
	
	public void detailsOfCar() {
		System.out.println(chasisNumber);
		System.out.println(regNum);
		System.out.println(color);
		System.out.println(brand);
	}
}
