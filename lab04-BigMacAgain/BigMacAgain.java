//Nicholas Schan
//CSE2 Lab 4 BigMacAgain Program
//September 20 2014

// This program uses user input to:
// 1) Calculate the cost of an order of bigmacs
// 2) Determine if the customer wants fries
// 3) Calculate the total cost of the order
// 4) Communicate to the user if their input was acceptable

import java.util.Scanner; //import scanner

//Define class, required for all java programs
public class BigMacAgain{
    
    //Define main method, required for all java programs
    public static void main(String[] args){
        
        Scanner myScanner= new Scanner (System.in); //Define and create instance of scanner
        System.out.print("Enter desired number of BigMacs:");//Promt user to enter int for BigMacs
        
        double costOfOrder; //Define variable to be used in 'if' statements denoting total cost
     
        //Create an 'if' statement to follow if user input was an integer
        if (myScanner.hasNextInt()){
            int nBigMacs=myScanner.nextInt();//Make next user input the number of BigMacs
            
            //Create 'if' statement to follow if the integer input is a positive value
            if (nBigMacs >= 0){
                
                double costPerBigMac=2.22;//Variable for price per BigMac
                costOfOrder=nBigMacs*costPerBigMac;//Variable for calculated cost of BigMacs
                costOfOrder=(int)(costOfOrder*100);//Format costOfOrder to contain 3+ digits
                costOfOrder=costOfOrder/100;//Format costOfOrder to contain 2 decimal places
                //Print number of BigMacs ordered and resulting price of BigMacs
                System.out.println("You ordered "+nBigMacs+" BigMacs at a cost of "+nBigMacs+"*$"+costPerBigMac+"=$"+costOfOrder);
                
            }//end 'if' statement
            
            //Create 'else' statment to follow if an negative value is input
            else{
                
                System.out.println("You did not input a positive ineger.");//Inform user they did not input a positive value
                return; // end program
                
            } //end 'else' statment
            
        }//end first 'if' statment

        //Create and 'else' statement to follow if the value input is not an integer
         else{
             
             System.out.println("You did not input an intger value.");//Inform user they did not enter an integer
             return; //end program
             
        }//end 'else' statement
        
        //Promt user to indicate if they want fries (Y or y for yes, N or n for no)
        System.out.print("Would you like fries with your order? (Y or y for yes, N or n for no): "); 
        String answer=myScanner.next(); //Use scanner to store answer as a string variable
        
        //Create 'if' statment to follow if "Y" is entered
        if(answer.equals("Y")){
              
            double costOfFries=2.15;//Cost for fries
            double totalCost=costOfOrder+costOfFries;//Total cost for meal
            totalCost=(int)(totalCost*100);//Format total cost to have 3+ digits
            totalCost=totalCost/100;//Format total cost to contain 2 decimals
            System.out.println("You ordered fries at a cost of $"+costOfFries);//Inform user they selected to order fries and print cost
            System.out.println("Your total order comes to $"+totalCost);//Inform user of total cost of order (BigMacs+Fries)
            
        }//end 'if' statement
        
        //Create 'if' statement to follow if "y" is entered
        else if(answer.equals("y")){
            
            double costOfFries=2.15;//Cost for fries
            double totalCost=costOfOrder+costOfFries;//Total cost for meal
            totalCost=(int)(totalCost*100);//Format total cost to have 3+ digits
            totalCost=totalCost/100;//Format total cost to contain 2 decimal places
            System.out.println("You ordered fries at a cost of $"+costOfFries);//Inform user they selected to order fries and print cost
            System.out.println("Your total order comes to $"+totalCost);//Inform user of total cost of order (BigMacs+Fries)
            
        }//end 'if' statment
        
        //Create 'if' statement to follow if "N" is entered
       else if(answer.equals("N")){
            
                System.out.println("Your total order comes to $"+costOfOrder); //Print total cost of BigMacs
            
        }//end 'if' statement
        
        //Create 'if' statement to follow if "n" is entered
        else if(answer.equals("n")){
            
            System.out.println("Your total order comes to $"+costOfOrder);//Print total cost of BigMacs
            
        }//end 'if' statement
        
        //Create 'else' statement to follow of something other than Y,y,N, or n are entered
        else{
            
            System.out.println("You did not input 'Y', 'y', 'N', or 'n'");//Inform user they did not enter Y,y,N, or n
            return;//end program
            
        }//end 'else' statment
        
    }//end main method
}//end class