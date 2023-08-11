package oops;

public class Run {

	public static void main(String[] args) {
		
		X ref = new X(12, 23, "Sample");
		System.out.println(ref.a);
		System.out.println(ref.b);
		System.out.println(ref.name);
		
		X refVar;
		refVar = new X(23,54,"Demo");
		System.out.println(refVar.a);
		System.out.println(refVar.b);
		System.out.println(refVar.name);
		
	}

}
