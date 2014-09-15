//Nicholas Schan
//CSE 2 Homework 3
//September 16 2014
//
//Program Functions:
//Use user input of second and counts to calulate:
// 1) The distance in miles
// 2) The time in minutes
// 3) The average MPH

import java.util.Scanner; //Import scanner class

// Define class, required for all java programs
public class Bicycle{
    
    //Define main method, required for all java programs
    public static void main(String[] args){
        
        Scanner Scanner1; //Define scanner
        Scanner1=new Scanner(System.in); //Create an instance of the scanner
        System.out.print("Enter the number of seconds:"); //Prompt user to input time
        int nSeconds= Scanner1.nextInt();//Define time as next int input by user
        System.out.print("Enter the number of counts:");//Prompt user to input counts
        int nCounts= Scanner1.nextInt();//Define counts as next int input by user
        
        //Define wheel diameter for future calculatons
        double wheelDiameter=27.0;
        //Define other constants for future calculations
        double PI=3.14159; 
        double feetPerMile=5280;
        double inchesPerFoot=12; 
        double secondsPerMinute=60;
        double minutesPerHour=60;
        
        double nMinutes=nSeconds/secondsPerMinute; //Convert time from sec to min
        double distance= nCounts*PI*wheelDiameter/inchesPerFoot/feetPerMile;//Calculate distance in miles
        double avgSpeed= distance/(nMinutes/minutesPerHour); //Calculate avg speed in MPH
        
        //Format minutes to contain 2 decimal places
        double nMinutesFormatted1= nMinutes*10;
        double nMinutesFormatted2= (int)nMinutesFormatted1;
        nMinutesFormatted2/=10;
       
        //Format disctance to contain 2 decimal places
        double distanceFormatted1=(distance*100);
        double distanceFormatted2=(int)distanceFormatted1;
        distanceFormatted2/=100;
        
        //Format average speed to contain 2 decimal places
        double avgSpeedFormatted1= avgSpeed*100;
        double avgSpeedFormatted2= (int)avgSpeedFormatted1;
        avgSpeedFormatted2/=100;
        
       //Print formatted results for user
        System.out.println("The distance was "+distanceFormatted2+" miles and took "+nMinutesFormatted2+" minutes.");
        System.out.println("The average speed was "+avgSpeedFormatted2+" MPH.");
    }
}