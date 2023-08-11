package nonPrimitiveTypeCasting;

public class Employee {

	int empId;
	String empName;
	double empSal;

	public Employee() { }

	public Employee(int empId, String empName, double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public void work() {
		System.out.println("developing an application");
	}
}
