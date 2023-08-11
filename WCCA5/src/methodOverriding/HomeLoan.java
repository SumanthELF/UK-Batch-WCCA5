package methodOverriding;

public class HomeLoan extends LoanAccount{

	int rateOfInterest;
	
	public HomeLoan() { }
	
	public HomeLoan(int accountNum, int loanAccountNumber, double loanAmount, double loanBalance, int roi) {
		super(accountNum,loanAccountNumber,loanAmount, loanBalance);
		rateOfInterest = roi;
	}
	
	public void displayAccountDetails() {
		super.displayAccountDetails();
		System.out.println("The rate of interest is : " + rateOfInterest);
	}
}
