package io.assignment;

public class BankAccountController{
	
	private BankAccount account;
	
	public BankAccountController(BankAccount account) {
		super();
		this.account = account;
	}
	
	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public double withdraw(long accountId , double balance) {
		double afterWithdraw = account.getAccountBalance() - balance;
		account.setAccountBalance(afterWithdraw);
		return afterWithdraw;
	}
	
	public double deposit(long accountId , double balance) {
		double afterDeposit = account.getAccountBalance() + balance;
		account.setAccountBalance(afterDeposit);
		return afterDeposit;
	}
	
	public double getBalance(long accountId) {
		return account.getAccountBalance();
	}
	
//	public boolean fundTransfer(long fromAccount , long toAccount , double balance) {
//		return true;
//	}
	
	public String toString() {
		return "Bank Account = [" + account + "]";
	}
	
}
