//Nicholas Schan
////Nicholas Schan
//October 10, 2014
//CSE2 Lab 07 LoopTheLoop
//
//This program uses loops to print out a '*'s incrementally up to the user's input
//which should be an int in the range of 1 and 15.

import java.util.Scanner;//import scanner

//create class, required for all java programs
public class  LoopTheLoop{
    
    //establish main method, required for all java programs
    public static void main(String[] args){
        
         Scanner myScanner=new Scanner (System.in);//Create and instance of your scanner and define it
        //create infite loop to encompass code in order to rerun until user inputs something other than Y or y
        while (true){
            int nStars=0;//declare and initialze an varibale for the number of *, note: declare out of 1 to 15 range
            int i=0;//declare and initialzie a variable to govern the while loop to nStars of *
            int j=0;//declare and initialize a variable to govern nested while loop for star pattern
            String starPattern="";//declare and initialize a string to build the star pattern off of
            String NStars="";//declare and intialize a string to be used when input is not an int
            
            //create while loop for nStars is out of range
            while (nStars<1||nStars>15){
                System.out.print("Enter a nubmer in btween 1 and 15: ");//prompt user to input an int between 1 and 15
                //create nested while loop for input is not an int 
                while (!myScanner.hasNextInt()){
                    NStars= myScanner.next();//set string equal to non-int input
                    System.out.print("Enter a nubmer in btween 1 and 15: ");//re-prompt user to input an int between 1 and 15
                    //create if statment for next input is an int
                    if (myScanner.hasNextInt()){
                        break;//perform break
                    }//end if statement
                }//end nested while loop for input is not an int
            
                nStars=myScanner.nextInt();//set n stars equals to user input
            }//end while loop for nStars is out of range
            
            //create while loop for i is less than nStars
            while (i<nStars){
                    String star="*";//create the string of a single star to be repeated throughout the program
                    System.out.print(star);//print a star on the same line for every cycle of the loop
                    i++;//increase i by 1
                    //create an if statment for i is equal to nStars
                    if (i==nStars){
                        System.out.println("");//create a line to be printed in between last and next lines printed
                        //create while loop to print incremental star pattern
                        while (j<nStars){
                            starPattern+=star;//add a star to the string for every cyle of while loop
                            System.out.print(starPattern+"\n");//print incremental star pattern for every cycle of loop
                            j++;//increase j by 1
                        }//end nested while loop for j is less than nStars
                    }//end if statement for i is equal to nStars
                    //create if statement for i is equal to nStars
                    if (i==nStars) {
                        break;//perform break to leave while loop
                    }//end if statment for i is equal nStars
            }//end while loop to create patter of stars
            System.out.print("Press Y or y to go again: ");//promt use to enter Y or y if they want to go again
            String Repeat=myScanner.next();//set input eqaul to in Repeat
            //create if statement for input is not Y or y
            if (!Repeat.equals("y") && !Repeat.equals("Y")){
                break;//if input is not Y or y peform break and leave infinite loop
            }//end if statement for input is not Y or y
                
        }//end infinite while loop
    }//end main method
}//end class