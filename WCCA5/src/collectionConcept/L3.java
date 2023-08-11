package collectionConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class L3 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		list.add(sc.nextLine());
		
		System.out.println("Enter your mobile number");
		list.add(sc.nextLong());
		
		System.out.println("Enter your DOB year");
		list.add(sc.nextInt());
		
		System.out.println("Enter your address");
		sc.nextLine();
		list.add(sc.nextLine());
		
		System.out.println(list);
		
		ListIterator ref = list.listIterator();
	}

}
