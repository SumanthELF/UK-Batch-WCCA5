package oops;

public class Doctor {

	private int license_num;
	
	public int getLicense_num() {
		return license_num;
	}

	public void setLicense_num(int license_num) {
		this.license_num = license_num;
	}

	void checkPulseRate() {
		System.out.println("Checking the pulse rate");
	}
	
	{
		System.out.println("I am a IIB from Doctor class");
	}
	
	public Doctor() {
		System.out.println("Loading of Doctor class Members");
	}
	
//	public Doctor(int license) {
//		license_num = license;
//	}
}
