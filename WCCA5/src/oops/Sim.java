package oops;

public class Sim {

	private long sim_Number;
	private String service_Provider;

	public Sim(int mobileNum, String company) {
		sim_Number = mobileNum;
		service_Provider = company;
	}

	public void simDetails() {
		System.out.println("Sim number is :" + sim_Number);
		System.out.println("Service provider is :" + service_Provider);
	}
}
