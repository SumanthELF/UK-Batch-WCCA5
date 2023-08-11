package oops;

public class Driver {

	public static void main(String[] args) {
		
//		Car hyundai = new Car(123455, "KA12NE7869", "black", "Hyundai", 7654, 4, 1500, 85);
//		
//		hyundai.engineRef.engineDetails();
//		
//		System.out.println("===================================");
//		hyundai.engineRef = new Engine(9876, 2, 900, 90);
//		System.out.println("Replacing engine");
//		hyundai.engineRef.engineDetails();
		
		Car honda = new Car(547658, "MH01AE9876", "Red", "KIA");
		
		honda.engineRef = new Engine(12, 4, 2000, 97);
		
		honda.engineRef.engineDetails();
		System.out.println("==========================");
		Car bmw = new Car(111,"KA05MM7654","Pearl White","BMW");
		bmw.engineRef = honda.engineRef;
		System.out.println("BMW Engine details");
		bmw.engineRef.engineDetails();
	}

}
