package inheritance;

public class Driver {

	public static void main(String[] args) {
		RoyalEnfield ref = new RoyalEnfield();
		ref.transportation();
		ref.riding();
		ref.sound();
		System.out.println("==================================");
		Bike bike = new Bike();
		bike.transportation();
		bike.riding();
		System.out.println("==================================");
		Vehicle vehicle = new Vehicle();
		vehicle.transportation();		
	}

}
