//Nicholas Schan
//Sept.23 2014
//CSE2 Homework 4 Program 4

//This program gives the time when the user enters the number of seconds that occured during a day

import java.util.Scanner; //import scanner to allow user input

//create class, required for all java programs
public class TimePadding{
    
    //establish main method, required for all java programs
    public static void main(String[] args){
    
        Scanner myScanner= new Scanner (System.in);//Create and instance of your scanner and define it
        
        //declare variables for future use
        int seconds;
        int hour;
        int minute;
        int nSeconds;
        
        System.out.print("Enter the time in seconds: ");//prompt user to enter seconds
        
        //create if statement for input is an integer
        if (myScanner.hasNextInt()){
            
            seconds= myScanner.nextInt();//create instance of scanner
            
            //create if statement for seconds entred are positive
            if (seconds>= 0){
                
                //create if statement for second entered are in range
                if (seconds>= 0 && seconds <= 86400){
                    
                    hour=(seconds/3600);//calculate hours
                    minute= (seconds/60)-(60*hour);//calculate minutes
                    nSeconds= seconds-(3600*hour)-(60*minute);//calculate seconds left over
                    
                    //create if statement for hour=0 note: this will be a.m.
                    if (hour==0){
                        
                        hour=hour+12;//correct this time to be 12
                        String Minutes= String.format("%02d", minute);//format minutes to have a padded zero
                        String Seconds= String.format("%02d", nSeconds);//format second to have a padded zero
                        System.out.println("The time is "+hour+":"+Minutes+":"+Seconds+" a.m.");//print time 
                        
                    }//end if statement for hour = 0
                    
                    //create else if statement for hour is greater than 12 note: this will be p.m.
                    else if (hour > 12) {
                        
                        hour= hour-12;//correct hour to not military time
                        String Hours= String.format("%02d", hour);//format hours to have padded zero
                        String Minutes= String.format("%02d", minute);//format mintutes to have a padded zero
                        String Seconds= String.format("%02d", nSeconds);//format seconds to have a padded zero
                        System.out.println("The time is "+Hours+":"+Minutes+":"+Seconds+" p.m.");//print time
                        
                    }//end else if statement for hour is greater than 12
                    
                    //create else statement for all other times note: these are a.m.
                    else {
                        
                        String Hours= String.format("%02d", hour);//format hours to have a padded zero
                        String Minutes= String.format("%02d", minute);//format minutes to have a padded zero
                        String Seconds= String.format("%02d", nSeconds);//format seconds to have a padded zero
                        System.out.println("The time is "+Hours+":"+Minutes+":"+Seconds+" a.m.");//print time
                        
                    }//end else statement for all other times
                    
                
                }// end if statement for seconds in range
                
                //create else statement for seconds out of range
                else {
                    
                    System.out.println("Seconds entered were out of range (0 : 86400).");//inform user entered value was out of range
                    return;//end program
                    
                }//end else statement for seconds out of range
                
            }//end if statement for second entered are positive
            
            //create else statement for entered value not positive condition
            else {
                
                System.out.println("Seconds entered were not a positive value.");//inform uswer taht value was not positive
                return;//end program
                
            }//end else statement for entered value is negative condition
            
        }//end if statement for entered value is an int
        
        //create an else statememnt for entered value is not an int
        else{
            
            System.out.println("Entered value was not an integer.");//inform user that an integer was not entered
            return;//end program
            
        }//end else statement for entered value is not an int
        
    }//end main method
}//end class