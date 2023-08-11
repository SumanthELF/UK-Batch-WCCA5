package collectionConcept;

import java.util.ArrayList;
import java.util.ListIterator;

public class L1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("Sumanth");
		list.add("7 Years Experience");
		list.add(987966532);
		list.add(true);
		list.add(25000.500);
		list.add('B');
		
//		System.out.println(list); //toString is overridden
		list.add(3, "Bangalore");
		list.add("India");
		list.add(0, "Automation Eng");
		
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		System.out.println(list.contains("Sumanth"));
		System.out.println(list.indexOf('B'));  //-1
		
		ArrayList<String> secondList = new ArrayList<String>();
		secondList.add("Dosa");
		secondList.add("Idli");
		secondList.add("Poori");
		secondList.add("Biryani");
		
		list.addAll(5, secondList);
		System.out.println(list);
		
		list.removeAll(secondList);
		System.out.println(list);
		
//		for(int i=0 ; i<list.size(); i++) {   //more time
//			System.out.println(list.get(i));
//		}
		
		//advance for loop / for each loop
		for(Object data : secondList) {
			System.out.println(((String)data).toUpperCase());
		}
		
	}

}

