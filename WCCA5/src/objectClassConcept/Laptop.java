package objectClassConcept;

import java.util.Random;

public class Laptop {

	int ramSize ;
	int hardDisk;
	String processor;
	
	public Laptop(int ramSize, int hardDisk, String processor) {
		this.ramSize = ramSize;
		this.hardDisk = hardDisk;
		this.processor = processor;
	}
	
	public Laptop() { }
	
	public String toString() {
		return "The properties of laptop is "+"\n"
				+"Ram Size : "+ramSize+", "+"\n"
				+"Hard Disk : " +hardDisk+", "+"\n"
				+"Processor : "+processor+", ";
	}
	
	@Override
	public boolean equals(Object obj) {
		Laptop laptop = (Laptop)obj;
		return this.ramSize == laptop.ramSize &&
				this.hardDisk == laptop.hardDisk &&
				this.processor == laptop.processor;
	}
	
	@Override
	public int hashCode() {
		Random random = new Random();
		return random.nextInt(1000);
	}
	
}
