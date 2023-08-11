package basicsOfOOP;

import java.util.Scanner;

public class Execution {

	public static void main(String[] args) {
		
		System.out.println("Main method begins");	
		new Scanner(System.in).nextInt();
		System.out.println("=====Accessing Non static members=====");
		Memebers refVariable1 = new Memebers();
		System.out.println(refVariable1);
		System.out.println("before re initializing");
		System.out.println(refVariable1.x);
		refVariable1.printing();
		refVariable1.x=300;
		System.out.println("aftre re initializing");
		System.out.println(refVariable1.x);
		
		System.out.println("creating new object");
		Memebers refVariable2 = new Memebers();
		refVariable2.x=500;
		System.out.println(refVariable2.x);
		
		Memebers refVariable3 = new Memebers();
		System.out.println(refVariable3.x);
		
		System.out.println("main method ends");

	}

}
