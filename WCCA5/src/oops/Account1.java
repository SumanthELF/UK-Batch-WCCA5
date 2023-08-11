package oops;

public class Account1 {
	int account_no;
	String account_name;

	public Account1(int acc_no, String acc_name) {
		account_no = acc_no;
		account_name = acc_name;
	}

	public void account_Details() {
		System.out.println("The account details are as below");
		System.out.println(account_no);
		System.out.println(account_name);
	}
}
