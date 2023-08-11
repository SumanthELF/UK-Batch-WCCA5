package basicsOfOOP;

public class Student {

	String studentName ;
	int studentId ;
	int marks;
	int standard;
	String fatherName;
	String motherName;
	String address;
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.studentName = "Kiran";
		s1.studentId = 101;
		System.out.print(s1.studentId + " , ");
		System.out.print(s1.studentName+ " , ");
		System.out.println(s1.fatherName);

		Student s2 = new Student();
		s2.studentId = 102;
		s2.studentName = "Balaji";
		System.out.print(s2.studentId + " , ");
		System.out.println(s2.studentName);
		
		Student s3 = new Student();
		System.out.print(s3.studentId + " , ");
		System.out.println(s3.studentName);
	}

}
