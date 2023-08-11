package oops;

public class Account {

	public Account(String name, double amount) {
		acc_Holder_Name = name;
		acc_balance = amount;
	}
	
	private int acc_Num;
	private String acc_Holder_Name;
	private double acc_balance;
	
	//getters and setters 	
	public void account_Details() {
		System.out.println(acc_Num);
		System.out.println(acc_Holder_Name);
		System.out.println(acc_balance);
	}

	public void getAcc_Num() {
		System.out.println(acc_Num);
	}
	
	public void getAcc_Holder_Name() {
		System.out.println(acc_Holder_Name);
	}
	
	public void getAcc_Balance() {
		System.out.println(acc_balance);
	}
	
	public void setAcc_Holder_Name(String name) {
		acc_Holder_Name = name;
	}
	
	public void deposit(int amount) {
		acc_balance = acc_balance + amount;
		System.out.println("Amount "+amount+" deposited successfully");
		System.out.println("New balance is "+ acc_balance);
	}
	
	public void withdraw(int amount) {
		if(amount<=acc_balance) {
			acc_balance = acc_balance - amount;
			System.out.println("Amount "+amount+" withdrawn successfully");
			System.out.println("Updated balance is "+ acc_balance);
		}else {
			System.out.println("Insufficient funds...!!!");
		}
	}
}
