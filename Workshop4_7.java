import java.util.Scanner;

/**
 * Write a description of class Workshop4_7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop4_7
{public static void main (String[] args){
    Scanner input = new Scanner(System.in);

System.out.print("Enter your mark price: ");
float mp = input.nextFloat();

System.out.print("Enter your category (A/B/C/D): ");
char cat = input.next().charAt(0);

double sp;

switch (cat) {

case 'A':
sp = mp - (mp * 0.6);
System.out.println("The selling price is: " + sp);
break;

case 'B':
sp = mp - (mp * 0.4);
System.out.println("The selling price is: " + sp);
break;

case 'C':
sp = mp - (mp * 0.2);
System.out.println("The selling price is: " + sp);
break;

case 'D':
sp = mp - (mp * 0.1);
System.out.println("The selling price is: " + sp);
break;

default:
System.out.println("Invalid category! Selling price is: " + mp);
}

input.close();
}





}
