package collectionConcept;

import java.util.ArrayList;
import java.util.TreeMap;

public class W2 {

	public static void main(String[] args) {
		
		ArrayList<Double> list = new ArrayList<>();
		list.add(100d);
		list.add(25.56);
		System.out.println(list.get(1).toString());
		
		TreeMap<Integer,Student> ref = new TreeMap<>();
		ref.put(10, new Student());
		
	}
}
