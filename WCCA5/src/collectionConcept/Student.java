package collectionConcept;

public class Student {

	int studentID ;
	String studentName;
	String studentStandard;
	
	public Student(int studentID, String studentName, String studentStandard) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentStandard = studentStandard;
	}

	public Student() { }
	
	public void read() {
		System.out.println("reading books");
	}
	
	public void study() {
		System.out.println("Learn new things");
	}
	
	public void write() {
		System.out.println("Write codes in a book");
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentStandard="
				+ studentStandard + "]";
	}	
}
