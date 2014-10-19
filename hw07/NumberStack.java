//Nicholas Schan
//CSE 02 Homework 7 Number Stack Program
//October 21, 2014

//This program uses for, while, and do while loops to stack number in the same pattern

import java.util.Scanner;//import scanner
//declare class
public class NumberStack {
    //declare main method
    public static void main(String[] arg) {
        Scanner myScanner = new Scanner(System.in);//create instance of scanner
        System.out.print("Enter an integer between 1 and 9: ");//prompt user to input an int between 1 and 9
       int n=myScanner.nextInt();//set variable n equal to next int
        
        
        int l=0;// decalre and initialize variable l to be used to later to generate the pattern of printed numbers
        //create infinite for loop for n is between 1 and 9, inclusive
        for (int h=n; h>0&&h<10;){
            System.out.println("Using for loops: ");//inform user this method used for loops
            //create for loop to generate the correct number of tiers in the printed pattern
            for(int i=0; i<n; i++){
                l+=1;//increase l by 1
                //create a for loop for the number of integers printed on a line
                for( int j=0; j<i+1;j++){
                    //crate a for loop to generate proper spacing before the row of ints to create the pyramid pattern
                    for (int o=n-1; o>i; o--){
                        System.out.print(" ");//add a space 
                    }//end spacing for loop
                    //create for loop for how many integers are printed in a row
                    for (int k=0; k<i+l&&k<18; k++){
                        //print the integers incrementally up to the user input
                        System.out.print(i+1);
                    }//end for loop for number of ints in a row
                    System.out.println();//create space before next row
                }//end for loop for number of int printed on line
                //create for loop for proper spacing before dash pattern, note same as other spacing loop
                for (int o=n-1; o>i; o--){
                        System.out.print(" ");//add a space
                }//end spacing for loop
                //create for loop for dash pattern    
                for (int m=0; m<i+l; m++){
                    System.out.print("-");//print a dash
                }//end for loop for dash pattern
                System.out.println();//skip to next line before code continues
        
            }//end for loop for number of tiers
            break;//leave infinite loop
        }//end infirite for loop
        
        System.out.println();//add a space for the next method of pattern generation
        
        //create an infinite while loop for input is inbetween 1 and 9, inclusive
        while (n>0&&n<10){
            System.out.println("Using while loops: ");//inform user that while loops are used for this pattern generation
            l=0;//reset the value of l to zero
            int i=0;//declare and initialize control variable for number of teirs while loop
            //crate a while loop to generate incremental number of teirs in the pattern
            while (i<n){
                l+=1;//increase l by 1
                int j=0;//declare and initialize control value for number of rows
                //create a while loop for the number of rows of each int
                while (j<i+1){
                    int o=n-1;//declare and initialze variable to control spacing pattern
                    //create while loop to generate proper spacing before rows of ints
                    while (o>i){
                        System.out.print(" ");//add a space
                        o--;//decrease variable o by 1
                    }//end spacing while loop
                    int k=0;//declare and initialize variable for number of ints in a row
                    while (k<i+l){
                        System.out.print(i+1);//print the int incrementally, controled by variable i
                        k++;//increase k by 1
                    }//end while loop for number of ints in row
                    System.out.println();//go to next line for before printing the next row
                    j++;//increase j by 1
                }//end while loop for number of rows
                int o=n-1;//redeclare and initialize variable to generate spacing pattern
                //create while loop for proper spacing before dash pattern
                while (o>i){
                        System.out.print(" ");//add a space
                        o--;//decrease variable o by 1
                    }//end spacing while loop
                int m=0;//declare and initialze variable to control dash pattern
                while (m<i+l){
                    System.out.print("-");//print a dash
                    m++;//increase variable m by 1
                }//end while loop for dash pattern
                System.out.println();//skip a line before repeating code for next incremental int up until input value
                i++;//increase i by 1
            }//end while loop for number of teirs
            break;//leave infinite while loop
        }//end infinite while loop
        System.out.println();//add space before using next method to generate the pattern
        //create an infinte do while loop for input in between 1 and 9, inclusive
        do{
            //create if statment for value is in range to control do while loop
            if (n>0&&n<10){
                System.out.println("Using do while loops: ");//inform user that do while loops are used to generate the pattern
                l=0;//reset variable l to 0
                int i=0;//declare and initialize variable i to control number of teirs
                do {
                    l+=1;//increase l by 1
                    int j=0;//declare and initialize variable to control number of rows
                    //create do while loop for number of rows
                    do {
                        int o=n-1;//declare and initialize vairble to control spacing pattern before rows
                        //create do while loop for spacing pattern before rows
                        do {
                            //create an if statement to control do while loop statements
                            if (o==i){
                                break;//leave loop if o equals i
                            }//end if statement
                            System.out.print(" ");//add a space
                            o--;//decreas o by 1
                        }while (o>i);//set while conditions and end loop
                        int k=0;//declare and intialize variable to control number of ints in a row
                        //create wihle loop to control number of ints in a row
                        do {
                            System.out.print(i+1);//print int incrementally up until user input
                            k++;//increase variable k by 1
                        } while (k<i+l);//set loop conditions and end do while loop for number of ints in a row
                        System.out.println();//skip to next row
                        j++;//increas j by 1
                    } while (j<i+1);//set loop conditions and end do while loop for number of rows
                    int o=n-1;//declare and initialize variable to control spacing before dash pattern
                    //create a do while loop to control the spacing before the dash pattern
                    do {
                        //create an if statement to control do while loop statements
                        if (o==i){
                            break;//leave loop if o equals i
                        }//end if statement
                        System.out.print(" ");//add a space
                        o--;//decrease o by 1
                    } while (o>i);//set loop conditions and end do while loop for spacing, note same as other spacing loop
                    int m=0;//declare and initialze variable to control dash pattern
                    do {
                        System.out.print("-");//add a dash
                        m++;//increase m by 1
                    } while (m<i+l);//set loop condtions and end dash pattern do while loop
                    System.out.println();//skip to next line to continue rows of ints
                    i++;//increase i by 1
                }while (i<n);//set loop conditions and end do while loop for number of teirs
                break;//leave infinite loop for input is between 1 and 
            }//end if statment for input in range
        }while (n>0&&n<10);//set infinte do while loop condtions and end loop


    }//end main method
}//end class
