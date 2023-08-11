package basicsOfOOP;

public class Student2 {

	// user defined constructor
	public Student2(String name, int id, int mrks, int std,
			              String fname, String mname, String adrs) {
		studentName = name;
		studentId = id;
		marks = mrks;
		standard = std;
		fatherName = fname;
		motherName = mname;
		address = adrs;
	}
	
	public Student2() {
		
	}

	String studentName;
	int studentId;
	int marks;
	int standard;
	String fatherName;
	String motherName;
	String address;

	public static void main(String[] args) {

		Student2 s = new Student2();
		System.out.println(s.studentName);
		
		Student2 ss = new Student2("Sunil", 111, 85, 9, "Kishore", "Leela", "Bangalore");
		System.out.println(ss.studentName);
		
//		Student2 s1 = new Student2("Venkatesh", 202, 75, 8, "Guru", "Lakshmi", "UK");
//		System.out.print(s1.studentId + " , ");
//		System.out.print(s1.studentName + " , ");
//		System.out.print(s1.marks + " , ");
//		System.out.print(s1.standard + " , ");
//		System.out.print(s1.fatherName + " , ");
//		System.out.print(s1.motherName + " , ");
//		System.out.print(s1.address);

//		Student2 s2 = new Student2("Ganesh", 203);
//		System.out.print(s2.studentId + " , ");
//		System.out.println(s2.studentName);
//		
//		Student2 s3 = new Student2("Shiva",204);
//		System.out.print(s3.studentId + " , ");
//		System.out.println(s3.studentName);
	}

}
