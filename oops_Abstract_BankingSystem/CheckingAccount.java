package oops_Abstract_BankingSystem;

public class CheckingAccount extends Account {
	
	private double overdraftLimit; // Overdraft limit for the checking account

	// Constructor
	public CheckingAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
		super(accountNumber, accountHolderName, balance, "Checking");
		this.overdraftLimit = overdraftLimit;
	}

	// Method to deposit money into the checking account
	@Override
	public void deposit(double amount) {
		balance = balance + amount;
	}

	// Method to withdraw money from the checking account
	@Override
	public void withdraw(double amount) {
		if (amount <= balance + overdraftLimit) {
			balance -= amount;
		} else {
			System.out.println("Withdrawal exceeds overdraft limit.");
		}
	}

	// Method to get account information
	@Override
	public String getAccountInfo() {
		return "Checking Account: " + accountNumber + ", Holder: " + accountHolderName + ", Balance: " + balance;
	}

	// Method to check if the account is overdrawn
	public boolean checkOverdraft() {
		return balance < 0;
	}
}
