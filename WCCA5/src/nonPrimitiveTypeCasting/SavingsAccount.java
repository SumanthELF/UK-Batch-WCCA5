package nonPrimitiveTypeCasting;

public class SavingsAccount extends Account {

	int accountBalance;

	public SavingsAccount() { 
		// super();
	}

	public SavingsAccount(int accountBalance) {
		// super();
		this.accountBalance = accountBalance;
	}
	
	public void withdraw(int amount) {
		if(amount<=accountBalance) {
			accountBalance = accountBalance - amount;
			System.out.println("Withdraw Successfull");
			System.out.println("Updated balance is : "+ accountBalance);
		}else {
			System.out.println("Insufficient funds");
		}
	}
}
