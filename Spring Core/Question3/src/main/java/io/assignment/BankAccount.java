package io.assignment;

public class BankAccount {
	
	protected long accountId;
	protected String accountHolderName;
	protected String accountType;
	protected double accountBalance;
	
	
	public long getAccountId() {
		return accountId;
	}
	
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public String toString() {
		return "BankAccountNumber = " + accountId + 
				" , AccountHolderName = " + accountHolderName + 
				" , AccountType = " + accountType + " , Balance =  " + accountBalance + "";
	}
}
