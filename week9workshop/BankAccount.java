package week9workshop;



public class BankAccount
{
    protected int accNumber;
    protected String accHolderName;
    protected double balance;

    public BankAccount(int accNumber, String accHolderName, double balance)
    {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    void deposit(double amount)
    {
        balance = balance + amount;
    }

    double getBalance()
    {
        return(balance);
    }

    void displayInfo()
    {
        System.out.println("Account Number: " + this.accNumber);
        System.out.println("Account Holder Name: " + this.accHolderName);
        System.out.println("Balance: " + this.balance);
    }
}
