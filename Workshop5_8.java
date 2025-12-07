import java.util.Scanner;

/**
 * Write a description of class Workshop5_8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop5_8
{   public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("\nMultiplication Table for " + num);
        

        // For loop to generate multiplication table
        for (int i = 1; i <= 10; i++)
        {
            int result = num * i;

            // Formatted output
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}