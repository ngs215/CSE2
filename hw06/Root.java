//Nicholas Schan
////Nicholas Schan
//October 14, 2014
//CSE2 homework 6 Root
//
//This program uses a loop to calculate the square root of an inputed number

import java.util.Scanner;//import scanner

//create class, required for all java programs
public class  Root{
    
    //establish main method, required for all java programs
    public static void main(String[] args){
 
        Scanner myScanner= new Scanner (System.in);//declare scanner
        System.out.print("Enter a double greater than 0: ");//prompt user input of a double
        
        double x= myScanner.nextDouble();//set input equal to variable x
        double low=0.0;//declare and initialize variable low
        double high=x+1;//declare and initialize variable high
        double middle=0;//declare and initialize variable middle
        
        //create a while loop to calculate an estimate of the number root by bringing the difference of high and low to a certain tolerance
        while ((high-low)>((.0000001*(1+x)))){
            
           middle= (high+low)/2;//make middle the value inbetween high and low
           double middleSquared= middle*middle;//square middle
           
           //create if statment for middle squared is greater than input
           if(middleSquared>x){
               high=middle;//set high equal to middle
           }//end if statment
           //create an else statment for middle squared in less than input
           else{
               low=middle;//set low equal to middle
           }//end else statement
            
        }//end while loop
        
        System.out.println("The estimated square root of "+x+" is "+high);//print estimated root
    }//end main method
}//end class