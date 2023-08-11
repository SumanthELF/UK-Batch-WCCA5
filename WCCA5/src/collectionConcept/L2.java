package collectionConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class L2 {

	public static void main(String[] args) {
		
		ArrayList listRef = new ArrayList();
		listRef.add("Sumanth");
		listRef.add("Selenium");
		listRef.add("Java");
		listRef.add("HTML");
		listRef.add("CSS");
		listRef.add("JavaScript");
		listRef.add("BDD / Cucumber");
		listRef.add("API");
		listRef.add("RestAssured");
		listRef.add("SQL, MySQL");	
		
		System.out.println(listRef.get(0));
		
		Iterator iterator = listRef.iterator();
		
		do {
			System.out.println(iterator.next());
		}while(iterator.hasNext());
	}
}
