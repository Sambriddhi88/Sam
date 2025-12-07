import java.util.Scanner;

/**
 * Write a description of class FixetNIB_java here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixedDepositNIB_java
{  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean a = true;
    while(a)
{
System.out.print("Enter deposit amount: ");
double principal = input.nextDouble();
if(principal<1000)
{
System.out.println(
"Your amount should be above Rs. 1000");
continue;}
System.out.print("Enter duration in months: "); int months= input.nextInt();
double year = months/12.0;
if (months<=0  months >60)
System.out.println(
"Months should be greater than o and smaller than 60"









}
    
    
    
    
    
    
    
}