package Week7.Workshop8;


/**
 * Write a description of class ElectricityBillMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBillMain
{
public static void main(String[] args)
{
ElectricityBill e1=new ElectricityBill("Ruby",150);
double bill=e1.calculateBill();
System.out.println("Your bill is "+bill);
}
}