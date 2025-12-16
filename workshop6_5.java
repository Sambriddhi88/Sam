import java.util.Scanner;

/**
 * Write a description of class workshop6_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop6_5
{ public static void main(String[] args)
{ String [] dis={"Morang", "Kathmandu","Kaski","Sindhuli"};
for(int i=0; i< dis.length; i++){
    System.out.println(i+1 + "." +dis[i]);
    
    
}
Scanner input= new Scanner (System.in);
System.out.println("Enter your index length:");
int len= input.nextInt();

String[] arr1= new String[len];
for(int i=0; i< arr1.length; i++){
    System.out.println("Enter your districts:");
    arr1[i]= input.next();
}
System.out.println("New values:");
for(int l=0; l< arr1.length; l++){
System.out.println(arr1[l]);

}

}
}