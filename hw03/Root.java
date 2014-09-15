//Nicholas Schan
//CSE 2 Homework 3 Root Program
//September 16th 2014

//This program calculates a rough estimate of the cube root
//of a double inputted by the user by improving a guess by
//subsituting previoius guesses back into an equation

import java.util.Scanner; //Import scanner class

//Esteblish class required for all java programs
public class Root{
    
    //Establish main method required for all java programs
    public static void main(String[] args){
        
        Scanner Scanner2;//Define scanner
        Scanner2= new Scanner(System.in);//make an instance of the scanner
       //Prompt user to input a number to calculate 
        System.out.print("Enter a double and I print its root-");
        //Assign the inputed number to a variable 
        double number= Scanner2.nextDouble();
        double guess=number/3; //Create an guess
        //Modify this guess 5 times to improve it by using previous guesses
        guess= (2*guess*guess*guess+number)/(3*guess*guess);
        guess=(2*guess*guess*guess+number)/(3*guess*guess);
        guess=(2*guess*guess*guess+number)/(3*guess*guess);
        guess=(2*guess*guess*guess+number)/(3*guess*guess);
        guess=(2*guess*guess*guess+number)/(3*guess*guess);
     
        //Calculate the guess cubed to compare to the input
        double numberCalculated=guess*guess*guess;
        
        //Print guess of cubed root of inputted number
        System.out.println("The cubed root is roughly "+guess+".");
        //Print calculation proving the guess is a close estimate
        System.out.println(+guess+"*"+guess+"*"+guess+"="+numberCalculated);
    }
}