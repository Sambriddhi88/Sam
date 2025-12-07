import java.util.Scanner;

/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixedDepositNIB
{
public static void main(String[] Args)
{
Scanner sc = new Scanner(System.in);
char choice = 'y';
while(choice == 'y' || choice == 'Y')
{
System.out.println("Enter the deposit amount(Rs.): ");
int P = sc.nextInt();
if(P >= 1000)
{
System.out.println("Enter the annual interest rate: ");
int AR = sc.nextInt();
double MR = AR / 1200d;
System.out.println("The monthly interest will be: " + MR);
System.out.println("Set the duration of your fixed deposit(in years): ");
int T = sc.nextInt();
if(T>0 && T<=5)
{
int M = T * 12;
System.out.println("The total number of month in this duration is " + M);
double I = P * (Math.pow(1 + MR, M)-1);
int CI = (int)I;
System.out.println("The monthly compound interest is: " + CI);
double A = P * Math.pow(1 + MR, M);
int CA = (int)A;
System.out.println("The compound amount is: " + CA);
double feeRate = 0.005d;
double fee_amount = CI * feeRate;
int feeAmount = (int)fee_amount;
System.out.println("The processing fee amount is: " + feeAmount);
int finalAmount = CA - feeAmount;
System.out.println("The final amount received by the customer will be: " + finalAmount);
}
else
{
System.out.println("Above maximum duration.");
}
}
else
{
System.out.println("Below minimum deposit amount.");
}
System.out.println("Enter y or Y if you want to continue.");
choice = sc.next().charAt(0);
}
}
}





    
    




  