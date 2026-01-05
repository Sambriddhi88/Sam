package week9workshop;


public class SavingAccount extends BankAccount
{
    private int interestRate;

    public SavingAccount(int accNumber, String accHolderName, double balance, int interestRate)
    {
        super(accNumber, accHolderName, balance);
        this.interestRate = interestRate;
    }

    double calculateInterest()
    {
        double interest  = super.getBalance() * interestRate/100;
        return interest;
    }
}
