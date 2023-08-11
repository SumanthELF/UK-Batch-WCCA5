package collectionConcept;

public class DriverStudent {

	public static void main(String[] args) {
//		
		Student [] sarr = new Student[10];
		Student s1 = new Student(1, "Kiran", "Third");
//		sarr[0] = s1;
//		
//		System.out.println(sarr[0]);
//		System.out.println(sarr[1]);
		
		display(10);
		display("Sumanth");
		display(true);
		display(s1);
	}
	
	public static void display(Object o) {
		System.out.println(o);
	}

}
