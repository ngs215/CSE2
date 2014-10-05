/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
   x=(100-x)/100;//reformatted to fix error 
   
   System.out.println(x);
   //print out the proportion remaining for select percentages
   if(x==0.93)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if(x==0.59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if(x==0.86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if(x==0.67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(x==0.4)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
    else {
        System.out.println("The proportion remainging is "+x);
    }
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *   The only acceptable inputs were 7, 41, 14, 33, and 60. However due to imperfect rounding 
 *   only the value of 60 worked. Therefore I formatted the x/100 to only contain 2 decimals
 *   and created an else statement to satisfy the other possible inputs
 * 
 */
