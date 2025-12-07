import java.util.Scanner;

/**
 * Write a description of class Workshop4_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop4_5
{public static void main (String[] args)
    {Scanner input= new Scanner(System.in);
     System.out.println("Enter your number:");
     
     
     int num = input.nextInt();
     if(num%3==0)
         {if(num%5==0) {System.out.println("The number is divisible by both 3 and 5");}
         else
         {System.out.println("The number is divisible by 3 only");}
         
     }
     else if (num%5==0)
      {
          System.out.println("The number is divisible by 5");
        }
      else {System.out.println("The number is neither divisible by 3 nor 5");}
   } 
}