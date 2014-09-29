//Nicholas Schan
//September 30 2014
//CSE 2 Homework assignment 5

/*This program gives the users the options to order a burger, soda, or fries
and then has them answer questions to clarify the specifics of their order using 
boolean, swtitch, and if statements*/

import java.util.Scanner;//import scanner

//create class, required for all java programs
public class  BurgerKing{
    
    //establish main method, required for all java programs
    public static void main(String[] args){
    
        Scanner myScanner=new Scanner (System.in);//Create and instance of your scanner and define it
        
        //prompt user to make an order
        System.out.print("Enter a letter to indicat a choice of \n B or b for Burger \n S or s for Soda \n F or f for Fries \n");
        
        String Choice= myScanner.next();//make their input a string variabl
        
        //create if statement for input is greater than one character
        if (Choice.length()>1){
            System.out.println("A single character is expected.");//notify user only one char is expected
        }//end if statment
        
        //create else if statement for input is an expected character         
        else if (Choice.equals("B")||Choice.equals("b")||Choice.equals("F")||Choice.equals("f")||Choice.equals("S")||Choice.equals("s")){
            
            //create a switch statement for Choice variable
            switch (Choice){
                
                case "B": case "b": //for burger
                    System.out.print("Enter A or a for \"all the the fixins\" \nC or c for Cheese \nN or n for none of the above \n");//prompt uswer to slect toppings
                    String Toppings= myScanner.next();//make Toppings variable the next user input
                    //Create a switch statment for Toppings
                    switch (Toppings){
                        
                        case "A": case "a":
                            System.out.println("You ordered a burger with everything on it.");//if a or A inform user they chose all toppings
                            break;
                        case "C": case "c":
                            System.out.println("You ordered a burger with cheese.");//if C or c inform user they chose cheese
                            break;
                        case "N": case "n":
                            System.out.println("You ordered a plain burger.");//if N or n inform user they selected no toppings
                            break;
                            
                    }//end swtitch statment
                    return;//terminate program
                    
                 case "S": case "s": //for soda
                    System.out.print("Do you want Pepsi (P or p),\nCoke (C or c),\nSprite (S or s),\nMountain Dew (M or m)?\n");//prompt user to select soda
                    String Soda= myScanner.next();//make input a string
                    //create a swtich statment for soda options
                    switch (Soda){
                        
                        case "P": case "p":
                            System.out.println("You ordered a Pepsi.");//for P or p inform user they chose pepsi
                            break;
                        case "C": case "c":
                            System.out.println("You ordered a Coke.");//for C or c inform user they chose coke
                            break;
                        case "S": case "s":
                            System.out.println("You ordered a Sprite.");//for S or s informf user they chose sprite
                            break;
                        case "M": case "m": 
                            System.out.println("You ordered a Mountain Dew.");//for M or m inform user they chose mountain dew
                            break;
                        
                    }//end swtich statement
                    return;//terminate program
                
                case "F": case "f": //for fries
                    System.out.print("Enter L or l for a large fry. Enter S or s for a small fry \n");//prompt user to select order size
                    String Fries= myScanner.next();//make input a string
                    //create a swtich statement for fries order size options
                    switch (Fries){
                        
                        case "L": case "l":
                            System.out.println("You ordered a large fry.");//for L or l infrom user they chose large
                            break;
                        case "S": case "s":
                            System.out.println("You ordered a small fry." );//for S or s inform user they chose small
                            break;
                        
                    }//end switch statement
                    return;//terminate program
                
            }//end switch statment for order options
            
        }//end else if statement for string length is one character
 
            
            //create an else statement for an unacceptable character entered
            else {
                
                System.out.println("Entered character was not B,b,S,s,F, or f.");//inform user their input is invalid
                
            }//end else statement for incorrect character
            
        
    }//end main method
}//end class