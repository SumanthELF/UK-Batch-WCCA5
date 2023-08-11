package collectionConcept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class M1 {

	public static void main(String[] args) {

		HashMap ref = new HashMap();
		ref.put("Smith", "US");
		ref.put("Martin", "Australia");
		ref.put("Karan", "Mumbai");
		ref.put("Akash", "Dubai");
		ref.put("Karthik", "Bangalore");

		System.out.println(ref.get("Karthik"));

		ref.put("Sumanth", "Bangalore");

		System.out.println(ref.get("Sumanth"));

		System.out.println(ref.size());
		System.out.println(ref);

		ref.remove("Akash");
		System.out.println(ref);
		ref.put("Karan", "Pune");
		System.out.println(ref);

		Set keys = ref.keySet();

		for (Object o : keys) {
			System.out.println(o);
		}
		System.out.println("====================");

		Collection values = ref.values();
		ArrayList listRef = new ArrayList<>(values);

		for (Object o : listRef) {
			System.out.println(o);
		}
		
		TreeMap refT = new TreeMap(ref);
		System.out.println(refT);
	}
}
