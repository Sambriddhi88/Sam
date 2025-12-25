package Week7.BankAccountWeek7;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{ public static void main (String[]args)
{

BankAccount Customer1 = new BankAccount(0001, "Sambriddhi",180000);

Customer1.displayDetails();
Customer1.depositamt(1000);
Customer1.withdrawl(-200);
Customer1.currentbalance();

System.out.println();

BankAccount Customer2 = new BankAccount(0011, "Ramesh" ,8000);

Customer2.displayDetails();
Customer2.depositamt(40000);
Customer2.withdrawl(40000);
Customer2.currentbalance();

}
}