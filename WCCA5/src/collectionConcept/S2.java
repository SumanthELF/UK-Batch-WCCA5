package collectionConcept;

import java.util.TreeSet;

public class S2 {

	public static void main(String[] args) {
		
		TreeSet ref = new TreeSet();		
		ref.add("Tommy");
		ref.add("Puma");
		ref.add("Addidas");
		ref.add("Levis");
		ref.add("Woodland");
		ref.add("PeterEngland");
		ref.add("PeterEngland");
		ref.add("Fasttrack");
		ref.add("Titan");
		ref.add("PeterEngland");
		
		System.out.println(ref.remove("Woodland"));
		System.out.println(ref.contains("Levis"));
		
	}

}
