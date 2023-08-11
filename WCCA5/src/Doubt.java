import java.util.Scanner;

public class Doubt {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the week in lowercase");
		String day = sc.next();
		System.out.println(day);

		if (day=="monday") {
			System.out.println("FootBall");
		} else if (day == "tuesday") {
			System.out.println("Badminton");
		} else if (day == "wednesday") {
			System.out.println("VolleyBall");
		} else if (day == "thursady") {
			System.out.println("Cricket");
		} else if (day == "friday") {
			System.out.println("Tennis");
		} else {
			System.out.println("Invalid");
		}
	}

}
