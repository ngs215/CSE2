//Nicholas Schan
//CSE 2 Lab 09 Methods
//October 23, 2014

//This lab calls different methods to determine min and max values and if numbers are in ascending order


import java.util.Scanner;//import scanner
//declare class, required for all java programs
public class Methods {
    //declare main method
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);//declare scanner
        int a,b,c;//declare ints a b and c
        System.out.println("Enter three ints");//prompt user to enter an int
        
            a = getInt(scan);//use getInt method to get value 
            b = getInt(scan);//use getInt method to get value 
            c = getInt(scan);//use getInt method to get value 


        System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));//use larger method to determine which of the first 2 ints is larger
        System.out.println("The larger of " + a + ", " + b + ", and " + c +
            " is " + larger(a, larger(b, c)));//use larger method twice to determine which of the three ints is largest
        System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b +
            ", and " + c + " are in ascending order");//use ascending method to determine if ints were entered in acsending order
    }//end main method
    
    //declare getInt method
    public static int getInt(Scanner scan){
        System.out.print("Enter an int: ");//prompt user for an int
        int s=0;//delare and intialize the int to be returned
        //create a while loop for input is not an int
        while (!scan.hasNextInt()){
            String junk=scan.next();//get rid of junk
            System.out.println("You did not enter an int. Please try again.");//inform user they did not input an int
            System.out.print("Enter an int: ");// reprompt
            continue;//continue running loop
        }//end while loop
        //create if statement for input is an int
        if (scan.hasNextInt()){
            s=scan.nextInt();//set variable s eqaul to the inputed int
        }//end if statement
        return s;//return s to main method 
    }//end getInt method

    //create larger method
    public static int larger(int a,int b){
        //create if statement for the first value is lager than the second value
        if(a>b){
            return a;//return the first value to main method
        }//end if statement
        //create else statement
        else{
            return b;//if the first value is not larger, the second must but. Return the second value
        }//end else statment
    }//end larger method
    
    //create ascending method
    public static boolean ascending(int a, int b, int c){
        //create if statment for numbers are increasing in magnitude
        if(a<b&&b<c){
            return true;//return "true" to main method
        }//end if statment
        //create else statment for numbers are in ascending
        else{
            return false;//return "false" to main method
        }//end else statement
    }//end ascending method
}//end class