package methodOverriding;

public class LoanDriver {

	public static void main(String[] args) {		
		Account hl = new LoanAccount(9876,7878,75000,23000);
		hl.displayAccountDetails();
	}

}
