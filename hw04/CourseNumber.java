//Nicholas Schan
//Sept.23 2014
//CSE2 Homework 4 Program 3

//This program gives the year and semester of a coresponding course number

import java.util.Scanner; //import scanner to allow user input

//create class, required for all java programs
public class CourseNumber{
    
    //establish main method, required for all java programs
    public static void main(String[] args){
    
        Scanner myScanner= new Scanner (System.in);//Create and instance of your scanner and define it
        
        System.out.print("Enter a 6 digit number giving the course semester: ");//promt user to input 6 digit course number
        
        int courseNumber= myScanner.nextInt();//make course number next entered value
        
        int year;//declare year variable for later use
        
        int semester;//declare semester variable for later use
        
        //create an if statment for entered number in the proper range
        if (courseNumber>= 186510 && courseNumber<=201440) {
            
            year= courseNumber/100;//define the year as the first 4 digits
            
            semester=courseNumber%year;//define the semester as the last 2 digits
            
                //create an if statement if semester eqauls 10 (Spring)
                if (semester==10){
                    
                    //inform user of the course's year and semester
                    System.out.println("The course was offered in Spring Semester of "+year+"." );
                    
                }//end if statement for spring
                
                //create else if statement for semester equals 20 (Summer 1)
                else if (semester==20){
                    
                    //inform user of the course's year and semester
                    System.out.println("The course was offered in Summer 1 Semester of "+year+"." );
                    
                }//end if else if statement for Summer 1
                
                //create else if statement for semester equal 30 (Summer 2)
                else if (semester==30){
                    
                    //inform user of the course's year and semester
                    System.out.println("The course was offered in Summer 2 Semester of "+year+"." );
                    
                }//end else if statement for Summer 2
                
                //create else if statement for semester equals 40 (Fall)
                else if (semester==40){
                    
                    //inform user of the course's year and semester
                    System.out.println("The course was offered in Fall Semester of "+year+"." );
                    
                }//end else if statment for Fall
                
                //create else statment for semester is not 10, 20, 30, or 40
                else {
                    
                    //inform user that semester is not legitimate
                    System.out.println(semester+" is not a legitimate semester.");
                    
                }//end else statement
            
            
        }//end if statement for course number in range
        
        //create else statment for value out of range
        else {
            
            //inform user that course number was out of range
            System.out.println("The number was outside the range (188510:201440)");
            
        }//end else statement for course number out of range
        
    }//end main method
    
}//end class