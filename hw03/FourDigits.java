//Nicholas Schan
//CSE 2 Homework 3 FourDigits Program
//September 16th 2014

//This program will display the first four digits
//after a decimal when a double in inputted by the user

import java.util.Scanner; //import scanner

//Define class required for all java programs
public class FourDigits{
    
    //Define main method required for all java programs
    public static void main(String[] args){
        
        Scanner Scanner3;//Define scanner
        Scanner3= new Scanner(System.in);//Create instance of scanner
        //Prompt user to inpubt a double
        System.out.print("Enter a double and I display the four digits to the right of the decimal.-");
        //Define the double entered by the user
        double enteredNumber=Scanner3.nextDouble();
        double integerNumber=(int) enteredNumber;//Make the double and int
        enteredNumber=(enteredNumber*10000);//move decimal of entered double over 4 places
        //Move the decimal of the int over 4 places and subtract in from 10000 times the entered number
        //to get the four digits isolated
        double fourDigits=enteredNumber-(integerNumber*10000);
        int fourD=(int)fourDigits; //Cast answer to an integer
        System.out.println("The four digits after the decimal are "+fourD);// print answer
        
    }
}