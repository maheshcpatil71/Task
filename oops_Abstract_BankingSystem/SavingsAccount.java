package oops_Abstract_BankingSystem;

public class SavingsAccount extends Account {

	private double interestRate; // Interest rate for the savings account

	// Constructor
	public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance, "Savings");
		this.interestRate = interestRate;
	}

	// Method to deposit money into the savings account
	@Override
	public void deposit(double amount) {
		balance = balance + amount;
	}

	// Method to withdraw money from the savings account
	@Override
	public void withdraw(double amount) {
		if (amount <= balance) {
//			balance -= amount;
			balance = balance - amount;
		} else {
			System.out.println("Insufficient funds for withdrawal.");
		}
	}

	// Method to get account information
	@Override
	public String getAccountInfo() {
		return "Savings Account: " + accountNumber + ", Holder: " + accountHolderName + ", Balance: " + balance;
	}

	// Method to calculate interest earned on the balance
	public double calculateInterest() {
		return balance * interestRate / 100;
	}
}
