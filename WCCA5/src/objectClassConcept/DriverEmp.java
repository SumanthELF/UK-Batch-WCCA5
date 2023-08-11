package objectClassConcept;

public class DriverEmp {

	public static void main(String[] args) {
		Employee e1 = new Employee("Bharath", 1231, 48000, 987654321, "Software Engineer");
		System.out.println(e1);

		Employee e2 = new Employee("Kishore", 1211, 84000, 789432329, "Senior softrware engg");
		System.out.println(e2);

		Employee e3 = new Employee("Kishore", 1211, 84000, 789432329, "Senior softrware engg");
		System.out.println(e3);
		
		Employee e4 = e3;
		
		System.out.println(e2==e3); //== it will check the address		
		System.out.println(e1.equals(e2));  //false
		System.out.println(e2.equals(e3));  //true
	}

}
