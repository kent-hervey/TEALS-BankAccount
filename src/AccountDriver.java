
public class AccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account1 = new BankAccount();
		account1.accountName = "Kim Jones";
		account1.deposit(1000);
		
		BankAccount account2 = new BankAccount();
		account2.accountName = "Terry Lee";
		account2.deposit(500);
		
		System.out.println(account1);
		System.out.println(account2);
		

	}

}
