package abstractionConcept;

public class Driver {

	public static void main(String[] args) {
//		Car refVar = new Car();
		
		CarVersion2 car = new CarVersion2("Honda",1200000,5);
		
		System.out.println(car.name_of_car);
		System.out.println(car.price);
		System.out.println(car.no_of_doors);
	}

}
