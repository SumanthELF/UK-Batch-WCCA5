package methodOverriding;

public class LoanAccount extends Account{

	int loanAccountNumber;
	double loanAmount;
	double loanBalance;
	
	public LoanAccount() { }
	
	public LoanAccount(int accountNum, int loanAccountNumber, double loanAmount, double loanBalance) {
		super(accountNum);
		this.loanAccountNumber = loanAccountNumber;
		this.loanAmount = loanAmount;
		this.loanBalance = loanBalance;
	}
	
	public void displayAccountDetails() {
		super.displayAccountDetails();
		System.out.println("Loan account number is : "+loanAccountNumber);
		System.out.println("Loan amount is : "+loanAmount);
		System.out.println("Loan balance is : "+ loanBalance);
	}
	
}
