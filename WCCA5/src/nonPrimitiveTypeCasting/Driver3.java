package nonPrimitiveTypeCasting;

public class Driver3 {

	public static void main(String[] args) {
		
		Account a1 ;
		SavingsAccount a2 ; 		
//		a1 = new Account();  // parent
//		a2 = (SavingsAccount) a1;  // child
		a2 = new SavingsAccount();
		a1 = a2;	
	}
}
// we can convert one non primitive variable into another non primitive variable 
// only when we have a is-a relationship

// parent to child --> implicitly is not possible   DOWNCASTING
//                     explicit is possible

//child to parent --> implicitly is possible    UPCASTING
//                     explicit is possible


