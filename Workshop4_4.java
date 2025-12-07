import java.util.Scanner;

/**
 * Write a description of class Workshop4_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop4_4
{ 
    public static void main (String[] args)
    {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your number:");
    int num = input.nextInt();
     if (num%3==0 && num%5==0)
     {System.out.println("It is divisible by both 3 and 5");
         
         
     }else {System.out.println("It is neither divisible by 3 nor 5 ");
        }

     








}
}