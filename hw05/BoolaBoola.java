//Nicholas Schan
//September 30 2014
//CSE 2 Homework assignment 5

/*This program randomly strings together true and false booleans with and (&&)
and or  (||) then prompt the user to answer if the value is true*/

import java.util.Scanner;//import scanner

//create class, required for all java programs
public class  BoolaBoola{
    
    //establish main method, required for all java programs
    public static void main(String[] args){
    
        Scanner myScanner=new Scanner (System.in);//Create and instance of your scanner and define it
        
        //delare and initialize Strings for later use
        String TF11,TF22,TF33,AO11,AO22;
        TF11=TF22=TF33=AO11=AO22="";
        
        //declare and initialize booleans for later use
        boolean tf1, tf2, tf3, TF, A;
        tf1=tf2=tf3=TF=A=true;
     
        //generate random number 1 or 2 for 5 variables
        int TF1=(int)(Math.random()*2)+1;
        int TF2=(int)(Math.random()*2)+1;
        int TF3=(int)(Math.random()*2)+1;
        
        int AO1=(int)(Math.random()*2)+1;
        int AO2=(int)(Math.random()*2)+1;
        
        //create switch statement to make the first variable true for 1 and false for 2
        switch (TF1){
            case 1: TF11="true";
                tf1=true; 
                break;
            case 2: TF11="false";
                tf1=false;
                break;
        }//end switch statement
        
        //create switch statement to make the second variable true for 1 and false for 2
        switch (TF2){
            case 1: TF22="true";
                tf2=true;
                break;
            case 2: TF22="false";
                tf2=false;
                break;
        }//end switch statement
        
        //create switch statement to make the third variable true for 1 and false for 2
        switch (TF3){
            case 1: TF33="true";
                tf3=true;
                break;
            case 2: TF33="false";
                tf3=false;
                break;
        }//end switch statement
        
        //create a switch statement to make the fourth variable && for 1 and || for 2
        switch (AO1){
            case 1: AO11="&&";
                break;
            case 2: AO11="||";
                break;
        }//end switch statement
        
        //create a switch statement to make the fifth variable && for 1 and || for 2
        switch (AO2){
            case 1: AO22="&&";
                break;
            case 2: AO22="||";
            
        }//end switch statement
        
        //create a switch statement for the fourth variable to be && or ||
        switch (AO11){
           case "&&"://for &&
               //create a switch statement for the fifth variable to be && 0r ||
               switch (AO22){
                   case "&&": TF=tf1&&tf2&&tf3;//generate boolean
                       break;
                   case "||": TF=tf1&&tf2||tf3;//generate boolean
                       break;
               }//end switch statement for AO2
       
           case "||"://for ||
               //create switch statement for the fifth variable to be && or ||
               switch (AO22){
                   case "&&": TF=tf1||tf2&&tf3;//generate boolean
                       break;
                   case "||": TF=tf1||tf2||tf3;//generate boolean
                       break;
                }//end switch statement for AO2
       }//end switch statement for AO1
        
        //generate string of the random outcomes
        String Question=TF11+AO11+TF22+AO22+TF33;
        //prompt user to answer if the value will be true or false
        System.out.print("Does "+Question+" have a positive value?\nTrue (T or t), False (F or f)\n");
        
        String Answer= myScanner.next();//make user input into a string
        
        //create a switch statement to determine if user answered true of false
        switch (Answer){
            case "T": case "t": A=true;
                break;
            case "F": case "f": A=false;
                break;
            default: System.out.println("Wrong; try again");//notify user if invalid input
                return;//terminate program if invald input
        }//end switch statment for answer
        
        //create an if statement for the uswer answers correct
        if (TF==A){
            System.out.println("Correct!");//inform user they are correct
        }//end if statement
        //create else statement for user is wrong
        else {
            System.out.println("Wrong; try again");//inform user they are wrong
        }//end else statement
    
    }//end main method
}//end class
        