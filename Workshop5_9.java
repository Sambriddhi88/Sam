import java.util.Scanner;

/**
 * Write a description of class Workshop5_9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop5_9
{  public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        int reversed = 0;
        
        // While loop to reverse the number
        while (number > 0)
        {
            int digit = number % 10;   // Get last digit
            reversed = reversed * 10 + digit; // Add digit to reversed number
            number = number / 10;      // Remove last digit
        }
        
        System.out.println("Reversed number: " + reversed);
    }
}