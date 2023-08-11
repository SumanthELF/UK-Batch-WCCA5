package objectClassConcept;

public class Driver1 {

	public static void main(String[] args) {
		Fruit fruit1 = new Fruit("Mango", "Sweet", 120, 1);
		Fruit fruit2 = new Fruit("Mango", "Sweet", 120, 1);		
		System.out.println(fruit1==fruit2);
	}
}

//Operator overriding  --> change the design of a operator