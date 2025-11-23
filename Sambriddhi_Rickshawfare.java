import java.util.Scanner;

/**
 * Write a description of class Sambriddhi_Rickshawfare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sambriddhi_Rickshawfare
{public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter total kilometers to travel:");
double distanceKm = sc.nextDouble();

System.out.println("Enter ride duration in minutes:");
double rideMinutes = sc.nextDouble();

System.out.println("Is the passenger from the local area? (yes/no)");
String localResponse = sc.next();
boolean localPassenger = localResponse.equalsIgnoreCase("yes");

System.out.println("Is this a late-night ride? (yes/no)");
String nightResponse = sc.next();
boolean nightRide = nightResponse.equalsIgnoreCase("yes");

double initialCharge = 45;
double kmRate = 18;
double minuteRate = 2.5;
double nightChargePercent = 0.25;
double localRebate = 0.10;

double totalFare = initialCharge + (distanceKm*kmRate)+ (rideMinutes*minuteRate);

totalFare = localPassenger ? totalFare - (totalFare * localRebate) : totalFare;

totalFare = nightRide ? totalFare + (totalFare * nightChargePercent) : totalFare;

System.out.println("================================");
System.out.println("Your calculated fare is: NPR " + totalFare);
System.out.println("================================");
}

}