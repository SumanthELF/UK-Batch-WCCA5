package oops;

public class Mobile {

	private String IMEA_Num;
	private int ram_Size;
	private String brand;
	private double price;
	private Sim sim;
	
	//load non static members to heap
	//initialize non static members
	public Mobile(String IMEA_Num, int ram_Size, String brand, double price) {
		this.IMEA_Num = IMEA_Num;
		this.ram_Size = ram_Size;
		this.brand = brand;
		this.price = price;
	}
	
	public Mobile(String imea, int ram, String mobileCom, double cost, int simNum, String service) {
		IMEA_Num = imea;
		ram_Size = ram;
		brand = mobileCom;
		price = cost;
		sim = new Sim(simNum, service);
	}
	
	public void detailsOfMobile() {
		System.out.println("IMEA number is : " + IMEA_Num);
		System.out.println("Ram is : "+ ram_Size);
		System.out.println("Mobile brand : "+ brand);
		System.out.println("Price is : "+ price);
		sim.simDetails();
	}
	
	
}
