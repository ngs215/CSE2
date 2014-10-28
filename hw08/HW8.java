//Nicholas Schan
//CSE 2 Homework 8 Program
//October 28, 2014

//This program uses overloaded methods to force proper user input


import java.util.Scanner;//import scanner
//declare class, required for all java programs
public class HW8{
  //declare main method
  public static void main(String []arg){
	char input;//declare variable input
	Scanner scan=new Scanner(System.in);//create a new scanner and an instance of scanner
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");//prompt user to enger C or c
	input=getInput(scan,"Cc");//call getInput method
	System.out.println("You entered '"+input+"'");//print what the method returned for user
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");//prompt user to enter Y y N or n
	input=getInput(scan,"yYnN",5); //call getInput method and give up after 5 attempts
	//create if statement for returned character is not a space
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");//print the character for the user
	}//end if statment
	input=getInput(scan,"Choose a digit.","0123456789");//call getInput method
	System.out.println("You entered '"+input+"'");//print returned character for user
  }//end main method
  
  //create getInput method called by a scanner and string
  public static char getInput(Scanner scan, String input){
      
    input=scan.next();//set input equal to next user input
    int a= input.length();//find length of inputed string
  
    //create while statement for input is not C or c  
    while (!input.equals("C")&&!input.equals("c")){
        
        //create if statement for length of string is greater than 1
        if (a>1){
          System.out.print("You should enter exactly one character- ");//inform user only one character should be entered
          input=scan.next();//make variable input next input by user
          a= input.length();//find length of new inputed string
          continue;//continue
        }//end if statment
        System.out.print("Yout did not enter a character from the list \"Cc\", please try again: ");//inform user C or c was not entered
        input=scan.next();//set new input equal to variable input
        a= input.length();//find new length of inputed string
        
        //create if statment for acceptable input
        if (input.equals("C")||input.equals("c")){
            break;//leave while loop
        }//end if statment
          continue;//continue
      }//end while statement
    char Cc=input.charAt(0);//set char Cc to first character of input string
    return Cc;//return char
  }//end getInput method
  
  //create getInput method called by a scanner, string, and int
  public static char getInput(Scanner scan, String input, int x){
    
    input=scan.next();//set user input equal to variable input
    int i=0;//declare and initialize variable i
    String YyNn="YyNn";//declare string YyNn
    boolean found=YyNn.contains(input);//create a boolean for user inputs Y, y, N, or n
    int l=input.length();//find lenght of inputted string
    boolean Single=l==1;//crate a boolean for length equals 1 is true
    //create while statment for user does not input Y, y, N, or n, the input is only 1 char, and has attempted no more than 5 times 
    while (!found||!Single&&i<5){
      //create an if statment for 5 attempts were made and failed
      if (i==4){
          System.out.println("You failed after 5 tries.");//inform user they failed after 5 attempts
          input=" ";//set input equal to a space
          break;//leave while loop
        }//end if statement
      System.out.print("You did not enter a character from the list \'YyNn\'. Please try again- ");//promt user to try again
      input=scan.next();//set new input equal to variable input
      YyNn="YyNn";//redefine string of acceptable input
      found=YyNn.contains(input);//determine if input was Y, y, N, or n
      l=input.length();//find the length of the new input 
      Single=l==1;//redfine length equals 1 is true
      i++;//increase attempt count by 1
    }//end while statement
    //create if statement for good input
    if (found){
          char YN=input.charAt(0);//set char YN to first char in string
          return YN;//return char
    }//end if statment

      return ' ';//return a space as the default
    
  }//end method
  
  //create getInput method called by a scanner and two strings
  public static char getInput(Scanner scan, String input, String number){
    //prompt user to enter a single digit
    System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
    input=scan.next();//set input equal to variable input
    number="0123456789";//create string containing all digits
    boolean found;//declare a boolean
    found=number.contains(input);//make 'found' boolean true if input has a digit 
    int l=input.length();//find length of input string
    boolean Single=l==1;//create boolean for length equals 1 is true
    //create a while statment for input does not have a digit and is longer than length 1
    while (!found||!Single){
      System.out.println("You did not enter an acceptable digit.");//inform user unaccaptable input
      System.out.println("Choose a digit.");//prompt them to choose a digit
      System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-");//list accaptable digits
      input=scan.next();//set new input eqaul to variable input
      number="0123456789";//redefine string of all digits
      found=number.contains(input);//redefine 'found' boolean as true if input contains accaptable digit
      l=input.length();//find length of input string
      Single=l==1;//make 'Single' boolean true if length equals 1
      //create if statment for input is a single digit
      if (found&&Single){
        break;//leave while loop
      }//end if statement
      continue;//continue
    }//end while loop
    char Num=input.charAt(0);//declare char 'Num' and set it equal to the first character in the input string
    return Num;//return char 'Num'
      
  }//end method
}//end class


