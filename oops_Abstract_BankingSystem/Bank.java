package oops_Abstract_BankingSystem;

//Bank class to manage multiple accounts
public class Bank {
	
	private Account[] accounts; // Array to store accounts
	private int accountCount; // Number of accounts in the bank

	// Constructor
	public Bank(int maxAccounts) {
		accounts = new Account[maxAccounts];
		accountCount = 0;
	}

	// Method to add an account to the bank
	public void addAccount(Account account) {
		if (accountCount < accounts.length) {
			accounts[accountCount] = account;
			accountCount++;
		} else {
			System.out.println("Bank is full, cannot add more accounts.");
		}
	}

	// Method to remove an account from the bank
	public void removeAccount(int accountNumber) {
		for (int i = 0; i < accountCount; i++) {
			if (accounts[i].accountNumber == accountNumber) {
				accounts[i] = accounts[accountCount - 1]; // Replace with the last account
				accounts[accountCount - 1] = null; // Remove last account
				accountCount--;
				break;
			}
		}
	}

	// Method to display all accounts in the bank
	public void displayAccounts() {
		for (int i = 0; i < accountCount; i++) {
			System.out.println(accounts[i].getAccountInfo());
		}
	}
}
