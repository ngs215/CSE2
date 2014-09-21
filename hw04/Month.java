//Nicholas Schan
//Sept.23 2014
//CSE2 Homework 4 Program 2

//This program give the number of days in a month 

import java.util.Scanner; //import scanner to allow user input

//create class, required for all java programs
public class Month{
    
    //establish main method, required for all java programs
    public static void main(String[] args){
    
        Scanner myScanner= new Scanner (System.in);//Create and instance of your scanner and define it
        
        System.out.print("Enter an int denoting a month (1-12): ");//promput user to enter an in between 1 and 12
        
        //define variables for month and year
        int month;
        int year;
        
        //create if statement for entered month is an int
        if (myScanner.hasNextInt()){
            
            month= myScanner.nextInt();//define month variable as the users input
            
            //create if statement for month entered is in the range of 1 through 12
            if (month>=1 && month <=12){
                
                //create if statement for int is month with 30 days
                if (month == 4 || month == 6 || month == 9 || month == 11){
                    
                    System.out.println("This month has 30 days.");//display number of days in month
                    
                }//end if statment for month with 30 days
                
                //create if else statement for int is month with 31 days
                else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                    
                    System.out.println("This month has 31 days.");//display number of days in month
                    
                }//end else if statement for month with 31 days
                
                //create else if satement for int is 2 (February)
                else if (month ==2 ){
                    
                    //promt user to enter year
                    System.out.print("Enter the year: ");
                    
                    //create if statement for year entered is an int
                    if (myScanner.hasNextInt()){
                        
                         year = myScanner.nextInt(); //define year as next entered value
                         
                         //create if statment for year is a postitive value
                         if (year >= 0) {
                             
                             //create if statment for year is entirely divisible by 4 (indicating a leap year)
                             if (year%4==0){
                                 
                                 System.out.println("This month has 29 days.");//display month has 29 days
                                 
                             }//end if statement for leap years
                             
                             //create else statement for non-leap years
                             else {
                                 
                                 System.out.println("This month has 28 days.");//display month has 28 days
                                 
                             }//end else statement for non-leap years
                             
                         }//end if statement for year is a positive value
                         
                         //create else statment for year in not a positive value
                         else {
                             
                             System.out.println("Year entered was not a positive value.");//inform user that input was negative
                             return;//end program
                             
                         }//end else statement for year is a non-positive value 
                        
                    }//end if statement for year entered is an int
                    
                    //create else statment for year entered is not an int
                    else {
                        
                        System.out.println("Year entered was not an int.");//inform user that year entered was not an int
                        return;
                        
                    }//end else statement for year is not an int
                    
                }//end if statement for month is 2 (February)
                
            }//end if statment for month is in range between 1 and 12
            
            //create else statment for month is out of range, not 1 through 12 value
            else {
                
                System.out.println("Entered value was out of range.");//inform user that month is not in range
                return;//end program
            }//end else statement for month entered is not in range        
        
        }//end if satement for month is an int
        
        //create else statement for month is not an int condition
        else {
            
            System.out.println("Entered value was not an int.");//inform user that month is not an int
            return;//end program
            
        }//end else statment for month is not an int
    
    }//end main method
            
}//end class




        
        
        
        