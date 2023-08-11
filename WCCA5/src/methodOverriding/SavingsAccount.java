package methodOverriding;

/**
 * 
 * @author Martin
 *
 */
public class SavingsAccount extends Account {

	double balance;
	
	public SavingsAccount() { }
	
	public SavingsAccount(int accNum, double balance) {
		super(accNum);
		this.balance = balance;
	}
	
	public void displayAccountDetails() {   // overriding method
		super.displayAccountDetails();
		System.out.println("Account Balance present in " + accountNumber +" is " + balance);
	}
}
