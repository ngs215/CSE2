//Nicholas Schan
//CSE2 Homwork 9
//BlockedAgain Program
//November 4 2014

//This program uses classes to call other classes in order to break down a problem into smaller problems

import java.util.Scanner;//import scanner
//create class, required for all java programs
public class BlockedAgain {
    //create main method, required for all java programs
    public static void main(String[] s) {
        int m;//declare variable m as an int
        //force user to enter int in range 1-9, inclusive.
        m = getInt();//get value of m from getInt method
        allBlocks(m);//call allBlocks method to print the block pattern
    }//end main method
    //create getInt method
    public static int getInt(){
        System.out.print("Enter an int between 1 and 9, inclusive: ");//prompt user to enter an int between 1 and 9
        int m=checkInt();//call checkInt method to verify input is an int
        m=checkRange(m);//call check range method to verify input is in range
        return m;//return m to main method
    }//end getInt method
    //create checkInt method
    public static int checkInt(){
        	Scanner scan=new Scanner(System.in);//declare and create instance of scanner
        	//create while loop for next input is not an int
        	while (!scan.hasNextInt()){
        	    String junk=scan.next();//store input as junk
        	    System.out.print("You did not enter an int; try again: ");//reprompt user for input
        	}//end while loop
        	int m=scan.nextInt();//store int value as m
        	return m;//return m to getInt method or checkRange method
    }//end checkInt method
    //create checkRange method
    public static int checkRange(int m){
        Scanner scan=new Scanner(System.in);//declare and create an instance of scanner
        //create a while loop for int m retrieved from getInt it out of range
        while (m<1||m>9){
            System.out.print("You did not enter an int in [1,9]; try again: ");//reprompt user for an int in range
            m=checkInt();//call checkInt to verify new input is an int
        }//end while loop
        return m;//return m to getInt method
    }//end check range method
    //create allBlocks method
    public static void allBlocks(int m){
        int n=block(m);//call block method to print block pattern
    }//end allBlocks mehtod
    //create block method 
    public static int block(int m){
            int l=0;// decalre and initialize variable l to be used to later to generate the pattern of printed numbers
            for(int i=0; i<m; i++){
                l+=1;//increase l by 1
                //create a for loop for the number of integers printed on a line
                for( int j=0; j<i+1;j++){
                    //crate a for loop to generate proper spacing before the row of ints to create the pyramid pattern
                    int o=line(m,i);//call line method to create proper spacing
                    //create for loop for how many integers are printed in a row
                    for (int k=0; k<i+l&&k<18; k++){
                        //print the integers incrementally up to the user input
                        System.out.print(i+1);
                    }//end for loop for number of ints in a row
                    System.out.println();//create space before next row
                }//end for loop for number of int printed on line
                //create for loop for proper spacing before dash pattern, note same as other spacing loop
                int o=line(m,i);//call line method to create proper spacing
                //create for loop for dash pattern    
                for (int n=0; n<i+l; n++){
                    System.out.print("-");//print a dash
                }//end for loop for dash pattern
                System.out.println();//skip to next line before code continues
        
            }//end for loop for number of tier
           return m;//return m to allBlocks method
    }//end block method
    //create line method
    public static int line(int m, int i){
        //create for loop for spacing
        for (int o=m-1; o>i; o--){
            System.out.print(" ");//add a space 
        }//end spacing for loop
        return m;//retun
    }//end line method
    
}//end class