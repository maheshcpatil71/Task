package oops_Abstract_BankingSystem;

//Main class to test the banking system
public class Mains {
 public static void main(String[] args) {
     Bank bank = new Bank(10); // Create a Bank object with a capacity of 10 accounts

     // Create a SavingsAccount and a CheckingAccount
     SavingsAccount sa1 = new SavingsAccount(101, "Mahesh", 50000.0, 2.5);
     CheckingAccount ca1 = new CheckingAccount(102, "Shailesh", 10000.0, 500.0);

     // Add accounts to the bank
     bank.addAccount(sa1);
     bank.addAccount(ca1);

     // Perform some transactions
     sa1.deposit(1500); // Deposit into savings account
     ca1.withdraw(200); // Withdraw from checking account

     // Display account information after transactions
     System.out.println("Account information after transactions:");
     bank.displayAccounts();

     // Calculate and display interest earned on savings account
     System.out.println("Interest earned on Mahesh's savings account: " + sa1.calculateInterest());

     // Attempt to withdraw more than the overdraft limit in checking account
     ca1.withdraw(1500); // This should show overdraft message
 }
}
