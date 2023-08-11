package objectClassConcept;

public class Employee {

	String empName;
	int empId;
	double empSal;
	long phoneNum;
	String designation;
	
	public Employee(String empName, int empId, double empSal, long phoneNum, String designation) {
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
		this.phoneNum = phoneNum;
		this.designation = designation;
	}

	public String toString() {
		return empName+", "+ empId+", "+empSal+", "+phoneNum+", "+designation;
	}	
	
	public boolean equals(Object o) {   //upcasting
		return (this.empName == ((Employee)o).empName &&
				this.empId == ((Employee)o).empId &&
				this.empSal == ((Employee)o).empSal &&
				this.phoneNum == ((Employee)o).phoneNum &&
				this.designation == ((Employee)o).designation);				
	}
}
