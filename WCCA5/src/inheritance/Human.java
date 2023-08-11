package inheritance;

public class Human extends Animal{

	public Human() {
		super(43);
	}
	
	int height;
	String name;
	String colourComplextion;
	
	public void read() {
		System.out.println("Reading");
	}
}
