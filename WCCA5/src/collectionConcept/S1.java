package collectionConcept;

import java.util.HashSet;
import java.util.Iterator;

public class S1 {

	public static void main(String[] args) {
		
		HashSet ref = new HashSet();
		
		ref.add("HP");
		ref.add("DELL");
		ref.add("APPLE");
		ref.add("ASUS");
		ref.add("SONY");
		ref.add("ASUS");
		ref.add("TOSHIBA");
		ref.add("YOGA");
		ref.add("HP");
		ref.add("HP");
		ref.add("HP");
		
		System.out.println(ref.size());
		
		Iterator iterator = ref.iterator();	
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
