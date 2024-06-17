package oops_Abstract_BankingSystem;

//Abstract class 
public abstract class Account {
	
	protected int accountNumber;
	protected String accountHolderName;
	protected double balance;
	protected String accountType;

	// Constructor to initialize common attributes
	public Account(int accountNumber, String accountHolderName, double balance, String accountType) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
	}

	// Abstract methods to be implemented by subclasses
	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public abstract String getAccountInfo();
}
