package oops;

public class Phone {

	private String IMEA_Num;
	private int ram_Size;
	private String brand;
	private double price;
	Sim sim1;
	Sim sim2;

	public Phone(String imea, int ram, String comp, double cost) {
		IMEA_Num = imea;
		ram_Size = ram;
		brand = comp;
		price = cost;
	}

	public Phone(String imea, int ram, String comp, double cost, int phoneNum, String serviceProvider) {
		IMEA_Num = imea;
		ram_Size = ram;
		brand = comp;
		price = cost;
		sim1 = new Sim(phoneNum, serviceProvider);
	}

	public void addSimCard(int mobileNum, String company) {
		sim1 = new Sim(mobileNum, company);
	}

	public void detailsOfMobile() {
		System.out.println("IMEA number is : " + IMEA_Num);
		System.out.println("Ram is : " + ram_Size);
		System.out.println("Mobile brand is : " + brand);
		System.out.println("Price is : " + price);
		if (sim1 == null) {
			System.out.println("Sim 1 is not inserted");
		} else {
			System.out.println("Details of Sim 1");
			sim1.simDetails();
		}

		if (sim2 == null) {
			System.out.println("Sim 2 is not inserted");
		} else {
			System.out.println("Details of Sim 2");
			sim2.simDetails();
		}
	}

}
