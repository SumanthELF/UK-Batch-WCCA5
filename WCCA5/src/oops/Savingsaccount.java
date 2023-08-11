package oops;

public class Savingsaccount extends Account1 {
	int balance;

	public Savingsaccount(int acc_No, String acc_Name, int bal) {
		super(acc_No, acc_Name);
		balance = bal;
	}

	public void deposit() {
		System.out.println("The amount is deposited successfully");
	}

	public void withdraw() {
		System.out.println("The amount is withdrawen successfully");
	}
}
