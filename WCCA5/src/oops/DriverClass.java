package oops;

public class DriverClass {

	public static void main(String[] args) {
		
		Cardiologist doctor1 = new Cardiologist(); //super()
		System.out.println(doctor1.getLicense_num());
		doctor1.checkPulseRate();
		doctor1.heartTransplant();
	}

}
