import java.util.Scanner;

/**
 * Write a description of class WORKSHOPQ3_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WORKSHOPQ3_2
{public static void main(String[] args)
    {  Scanner input =  new Scanner (System.in);
        System.out.println("Enter your Marks");
       
        double marks = input.nextDouble();
       
        System.out.println("Marks is: " +marks);
        String isValid = (marks >= 40) ? "Pass" : "Fail";
        System.out.println(isValid); 
    
    
    
    
    
    
    
    
    
    }
}