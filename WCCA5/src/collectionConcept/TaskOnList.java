package collectionConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskOnList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		System.out.println("Enter the User Name");
		String name = sc.nextLine();
		list.add(name);
		
		System.out.println("Enter the Mobile number");
		Long num = sc.nextLong();
		list.add(num);
		
		System.out.println("Enter Gender");
		String gender = sc.next();
		list.add(gender);
		
		System.out.println(list);
		
		ArrayList skill = new ArrayList();
		System.out.println("Enter Skills");
		String Skill = sc.nextLine();
		skill.add(Skill);
		skill.add("dancing");
		
		list.addAll(skill);
		
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
