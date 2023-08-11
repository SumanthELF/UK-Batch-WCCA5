package oops;

public class Bank {

	public static void main(String[] args) {

		Account john = new Account("John",5000);
				
		john.account_Details();
		System.out.println("======================");
		john.deposit(2500);
		System.out.println("======================");
		john.setAcc_Holder_Name("John Samuel");
		john.account_Details();
		System.out.println("======================");
		john.withdraw(3000);
		System.out.println("======================");
		john.withdraw(12000);
		System.out.println("======================");
		john.withdraw(100000);
	}

}
