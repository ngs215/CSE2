//Nicholas Schan
//Sept.23 2014
//CSE2 Homework 4 Program 1

//This program will give the tax rate and total income tax of an integer entered by the user

import java.util.Scanner;

public class IncomeTax{
    
    public static void main(String[] args){
    
        Scanner myScanner= new Scanner (System.in);//Create and instance of your scanner and define it
        System.out.print("Enter an int indicating income in thousands: ");//prompt user to input income in thousands
        
        int income;//define income variable as an integer
        
        //create if statement for input is an integer
        if (myScanner.hasNextInt()){
            
            income = myScanner.nextInt();//define variable for income as user input
            
            //creat if statement for income is a positive value
            if (income>=0){
                
                //create if statement for income is less than $20,000
                if (income<20){
                    
                    income=income*1000;//correct income to be in thousands
                    double incomeTax= income*.05;//calculate income tax
                    System.out.println("For an income of $"+income+" the tax rate is 5% and the total tax is $"+incomeTax );//Print result for user
                    
                }//end if statement for income less than $20,000
                
                //create else if statement for income is greater than or equal to $20,000 but less than $40,000
                else if (income>= 20 && income<40){
                    
                    income=income*1000;//correct income to be in thousands
                    double incomeTax= income*.07;//calculate income tax
                    System.out.println("For an income of $"+income+" the tax rate is 7% and the total tax is $"+incomeTax );//Print result for user
                    
                }//end else if statement for income greater than or equal to $20,000 but less than $40,000
                
                //create else if statement for income is greater than or equal to $40,000 but less than $78,000
                else if (income >= 40 && income < 78){
                    
                    income=income*1000;//correct income to be in thousands
                    double incomeTax= income*.12;//calculate income tax
                    System.out.println("For an income of $"+income+" the tax rate is 12% and the total tax is $"+incomeTax );//Print result for user
                    
                }//end else if statement for for income greater than or equal to $40,000 but less than $78,000
                
                //create else if statement for income is greater than or equal to $78,000
                else if (income >= 78){
                    
                    income=income*1000;//correct income to be in thousands
                    double incomeTax= income*.14;//calulate income tax
                    System.out.println("For an income of $"+income+" the tax rate is 14% and the total tax is $"+incomeTax );//Print result for user
                    
                }//end else if statement for income greater than $78,000
                
            }//end if statement for positive int condition
            
            //Create else statment for non-positive condition
            else {
                
                System.out.println("Entered value was not a positvie int");//inform user they did not enter a positive value
                return;//end program
                
            }//end else statment for non positive condition
            
        }//end if statment for int condition
        
        //Create else statement for non-int condition
        else {
            
            System.out.println("Entered value was not an int");//inform user they did not enter and int
            return;//end program
            
        }// end else statement for non-int condition
    
        
    }//end main method
}//end class