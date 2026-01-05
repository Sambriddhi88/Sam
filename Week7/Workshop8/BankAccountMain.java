package Week7.Workshop8;


/**
 * Write a description of class BankAccountMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccountMain
{ 
public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount myAccount = new BankAccount(12345, "Alice", 1000.0);

        // Check balance
        System.out.println("Starting balance: " + myAccount.getBalance());

        // Deposit money
        myAccount.deposit(500);

        // Withdraw money
        myAccount.withdraw(200);

        // Try an invalid withdrawal
        myAccount.withdraw(2000);

        // Final balance
        System.out.println("Final balance: " + myAccount.getBalance());
    }
}
