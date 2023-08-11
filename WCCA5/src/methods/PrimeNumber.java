package methods;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		boolean flag = true;
		
		for(int i=2; i<num; i++) 
		{
			if(num%i==0) 
			{
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("The number is a prime");
		}else {
			System.out.println("The number is not prime");
		}
	}

}
