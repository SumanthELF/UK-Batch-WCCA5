
public class Bank {

	public static void main(String[] args) {
		
		int accountBalance = 5000;
		int accountPin = 4321;
		int withDrawAmount = 4000;
		int enteredPin = 6453;
		
		if(accountPin==enteredPin) 
		{
			if(withDrawAmount<accountBalance)
			{
				System.out.println("Withdraw amount of "+withDrawAmount+" is successfull");
				accountBalance -= withDrawAmount;
			}
			else
			{
				System.out.println("Insufficient funds");
			}
			System.out.println("The account balance is " + accountBalance);
		}
		else
		{
			System.out.println("Invalid Pin");
		}
	}

}
