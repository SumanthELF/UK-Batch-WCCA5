package arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		String[] studentNames = {"lohithapriya","chennabasayya","sumaiya","harika","jyoti"};
		studentNames[0] = "Sumanth";
		System.out.println(studentNames[0] + studentNames[1]);
		System.out.println(studentNames[1]);
		System.out.println(studentNames[2]);
		System.out.println(studentNames[3]);
		System.out.println(studentNames[4]);
		
		int arr1 [] = new int[10];
		System.out.println(arr1[0]);
		arr1[0] = 20;
		arr1[1] = 25;
		arr1[2] = 30;
		arr1[3] = 35;
		arr1[4] = 40;
		System.out.println(arr1[0] + arr1[1]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
	}
}
