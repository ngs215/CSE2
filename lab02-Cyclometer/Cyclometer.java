//////////////////////////////////////////////////////////////
// Nicholas Schan
// Sept. 3 2014
//CSE2 Lab 2 Cyclometer Program
//
// Cyclometer Progam calculates:
//  1.Trip times
//  2.Number of tire rotations "counts"
//  3.Trips Distances
//  4.Total Distance of trips combined


public class Cyclometer{

    public static void main(String [] args){

        int secsTrip1=480; // Time of Trip 1 in seconds
        int secsTrip2=3220; // Time of Trip 2 in seconds
        int countsTrip1=1561; // Number of wheel revolutions of Trip 1
        int countsTrip2=9037; // Number of wheel revolutions of Trip 2
        double wheelDiameter=27.0, // Diamerter of wheel in inches
        
        //Important constants and conversion factors for calculations
        PI=3.14159, 
        feetPerMile=5280,
        inchesPerFoot=12, 
        secondsPerMinute=60;
        
        double distanceTrip1, distanceTrip2,totalDistance;
        
        // Print each trip's time length and wheel revolutions count
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts.");
        
        // Calculate the distance of trip one, this will be in inches
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Convert Trip 1's distance to miles 
        distanceTrip1/=inchesPerFoot*feetPerMile;
        //Calculate Trip 2's distance and immediately convert to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        // Print the distance of each trip and the total distance
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }
}