// Nicholas Schan
// CSE 2 Lab 2 Assignment
// September 12th 2014

// BigMac Program Functions
// 1) Obtain cost of BigMan, number of BigMacs, and Sales Tax rate from user
// 2) Calculate the total cost of BigMacs Purchased

//import scanner to allow user input
import java.util.Scanner;

//Define class required for all Java Programs
public class BigMac{
    
    //Define main method required for all java programs
    public static void main(String[] args){
        
        //Define scanner in order to use user input
        Scanner myScanner;
        //Create instance to tell java you're taking input from STDNI
        myScanner= new Scanner(System.in);
        //prompt user to input amount of BigMacs
        System.out.print("Enter the number of BigMacs (an integer > 0):");
        //Define the number of BigMacs as the next integer entered by the user
        int nBigMacs= myScanner.nextInt();
        //prompt user to input the cost per BigMac
        System.out.print("Enter the cost per BigMac as a double (in form XX.XX):");
        //Define the price per BigMac as the next double entered by the user
        double bigMac$= myScanner.nextDouble();
        //prompt user to input the sales tax as a percentage
        System.out.print("Enter percent tax as a whole number (XX):");
        //Define sales tax as the next double entered by the user
        double taxRate= myScanner.nextDouble();
        //convert taxrate from percentage to decimal
        taxRate/= 100;
        //Define variables for total cost calculation 
        double cost$;
        int dollars, dimes, pennies;
        //Calculate the total cost
        cost$=nBigMacs*bigMac$*(1+taxRate);
        //Break down components of cost in order to print a cost in xx.xx form
        dollars=(int)cost$;
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        //Print statement with inputed and calculated values for user
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +" per BigMac, with a sales tax of "+(int)(taxRate*100)+"%, is $"+dollars+'.'+dimes+pennies);
        
    }
}