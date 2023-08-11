package nonPrimitiveTypeCasting;

public class Driver1 {

	public static void main(String[] args) {

		//case 1		
		Employee emp1 = new Employee(1, "Chandru", 20000);
		Employee emp2 = new Employee(1, "Chandru", 20000);
		System.out.println("Employee 1 : "+emp1);
		System.out.println("Employee 2 : "+emp2);
		System.out.println(emp1.empId);    //1
		System.out.println(emp1.empName);  //Chandru
		System.out.println(emp1.empSal);   //20000
		System.out.println("-------------------");
		System.out.println(emp2.empId);    //1
		System.out.println(emp2.empName);  //Chandru
		System.out.println(emp2.empSal);   //20000
		System.out.println(emp1==emp2);
		System.out.println("=========================================");
		
		//case 2 
		Employee e1 = new Employee(1, "Chandru", 20000);
		Employee e2 ;
		e2 = e1;
		System.out.println("employee 1 : "+e1);
		System.out.println("employee 2 : "+e2);
		e2.empId=100;
		e2.empName="Ramesh";
		e2.empSal=50000;
		System.out.println(e1.empId);     //1
		System.out.println(e1.empName);   //Chandru
		System.out.println(e1.empSal);    //20000
		System.out.println("-------------------");
		System.out.println(e2.empId);     //1
		System.out.println(e2.empName);   //Chandru
		System.out.println(e2.empSal);    //20000
		System.out.println(e1==e2);
	}
}
