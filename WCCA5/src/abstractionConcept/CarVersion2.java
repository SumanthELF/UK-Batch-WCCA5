package abstractionConcept;

public class CarVersion2 extends Car {

	public CarVersion2(String name,double price, int doors) {
		 super(name,price,doors);
	}

	@Override
	public void race() {
		System.out.println("2Km drag race");
	}

	public void sunRoof() {
		System.out.println("Enjoy air and nature from the sunroof");
	}

	@Override
	public void drift() {
		System.out.println("Drifting the car....@@@@");		
	}

}
