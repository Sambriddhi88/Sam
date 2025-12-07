import java.util.Scanner;

/**
 * Write a description of class WorkshopQ_1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop4_1
{ public static void main (String[] args){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your grade: ");
    int grade= input.nextInt();
    String isValid=(grade>= 40) ? "PASS" : "FAIL";
    System.out.println(isValid);
    
    







}
}