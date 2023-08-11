package methodOverriding;

public class Account {

	int accountNumber;
	
	public Account() { }
	
	public Account(int accNum) {
		accountNumber = accNum;
	}
	
	public void displayAccountDetails() { //overridden method
		System.out.println("Account Number is : " + accountNumber);
	}
}
