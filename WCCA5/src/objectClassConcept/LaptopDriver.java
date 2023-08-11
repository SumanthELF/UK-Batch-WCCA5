package objectClassConcept;

public class LaptopDriver {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop(4, 500, "I3");
		Laptop l2 = new Laptop(6,1024,"I5");
		Laptop l3 = new Laptop(6, 1024, "I5");
		
		System.out.println(l1);
		System.out.println("========================");
		System.out.println(l2);
		System.out.println("========================");
		System.out.println(l3);
		System.out.println("========================");
		
		System.out.println(l1.equals(l2));
		
		System.out.println(l2.equals(l3));
		
		System.out.println(l1.hashCode());
		
	}

}
