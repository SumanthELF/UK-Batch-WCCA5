package objectClassConcept;

public class P1 {

	public P1(int data) {
		this.marks = data;
	}
	int marks;
	
	public void demo() {
		System.out.println("From Demo of P1");
	}
	
	@Override
	public String toString() {
		return ""+marks;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.marks == ((P1)obj).marks;
	}
}
