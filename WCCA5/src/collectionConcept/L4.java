package collectionConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class L4 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Java");
		list.add("Python");
		list.add("Angular");
		list.add("Ruby");
		list.add("JavaScript");
		list.add("C");
		
		System.out.println(list.size());
		
		ListIterator ref = list.listIterator(list.size());
		while(ref.hasPrevious()) {
			System.out.println(ref.previous());
		}
	}

}
