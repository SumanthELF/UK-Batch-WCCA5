package nonPrimitiveTypeCasting;

public class Driver4 {

	public static void main(String[] args) {

		SavingsAccount a1 = new SavingsAccount(2000); // child
		a1.accountNum = 872346;
		a1.accountName = "David";
		System.out.println("Address of Savings acc : " + a1);
		System.out.println("Account balance : " + a1.accountBalance);
		a1.withdraw(500);
		
		System.out.println(a1.accountNum);
		System.out.println(a1.accountName);
		System.out.println("==========================");
		Account a2 ; // a2 i can access members of Account 
		a2 = a1;  //  parent ref = child ref;  upcasting 
		System.out.println(a2.accountNum);
		System.out.println(a2.accountName);

		SavingsAccount a3 ;
		a3 = (SavingsAccount) a2;
		a3.withdraw(200);
		System.out.println(a3.accountBalance);		
	}

}
