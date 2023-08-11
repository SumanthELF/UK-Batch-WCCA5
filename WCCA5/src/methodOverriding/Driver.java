package methodOverriding;

public class Driver {

	public static void main(String[] args) {
		
		Account user1 = new Account(100123);
		user1.displayAccountDetails();
		System.out.println("====================");
		
		Account user2 = new SavingsAccount(102030, 25000);
		user2.displayAccountDetails();
	}

}
