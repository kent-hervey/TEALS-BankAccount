
public class BankAccount {
	
	static int  totalDollarsInBank=0;
	static int numAccounts=0;
	int accountBalance = 0;
	String accountName;
	String accountNumber;
	
	public BankAccount() {
		numAccounts++;
		this.accountNumber= "AB" + numAccounts;
	}
	
	public String  withdraw(int amountWithdraw) {
		
		if(amountWithdraw>this.accountBalance) {
			this.accountBalance= this.accountBalance - amountWithdraw;
			return "Your withdrawal was accepted.  New blanace is:  " + this.accountBalance;
		}
		else {
			return "You do not have sufficient funds for this withdrawal.  Balance is still:  " + this.accountBalance;
		}

	}
	
	public String deposit(int amountDeposit) {
		
		this.accountBalance = this.accountBalance + amountDeposit;
		
		return "Your deposit complete.  New balance is: " + this.accountBalance;
				
	}

	public static int getTotalDollarsInBank() {
		return totalDollarsInBank;
	}

	public static void setTotalDollarsInBank(int totalDollarsInBank) {
		BankAccount.totalDollarsInBank = totalDollarsInBank;
	}

	public static int getNumAccounts() {
		return numAccounts;
	}

	public static void setNumAccounts(int numAccounts) {
		BankAccount.numAccounts = numAccounts;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "BankAccount [accountBalance=" + accountBalance + ", accountName=" + accountName + ", accountNumber=" + accountNumber + "]";
	}

	
	
	
}
