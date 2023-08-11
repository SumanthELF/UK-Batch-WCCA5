package oops;

//Doctor --> parent / super class
//Cardiologist --> child / sub class

public class Cardiologist extends Doctor {

	public void heartTransplant() {
		
		System.out.println("Heart transplant is successfull...!!");
	}
	
	{
		System.out.println("I am IIB of Cardiologist");
	}
	
	public Cardiologist() {
		System.out.println("HI");
		System.out.println("Loading Cardiologist members");
	}
	
}
