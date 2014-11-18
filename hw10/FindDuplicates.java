//Nicholas Schan
//CSE2 Homework 10
//November 18th 2014

//This program determines if an array has duplicates and if an array has only 1 duplicate

import java.util.Scanner;//import scanner
//define class
public class FindDuplicates{
  //declare main method
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);//create an instance of the scanner class
    int num[]=new int[10];//declare space for a new array
    String answer="";//create a string to be added onto throughout the program
    //create a do while loop
    do{
      System.out.print("Enter 10 ints- ");//prompt the user to enter 10 ints
      //create a for loop to store the ints in to the array num
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();//store ints into array
      }//end for loop
      String out="The array ";//create a string 
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      //create an if satement for hasDups is true
      if(hasDups(num)){
        out+="has ";//add "has" to string out
      }//end if statement
      //create else statement
      else{
        out+="does not have ";//add this text to string out
      }//end esle statement
      out+="duplicates.";//add to string out
      System.out.println(out);//print string out
      out="The array ";//reset string out to this text
      out+=listArray(num);    //add display of array to string out
      //create an if statement for exactlyOneDup is true
      if(exactlyOneDup(num)){
        out+="has ";//add to string out
      }//end if statement
      //create else statement
      else{
        out+="does not have ";//add to string out
      }//end else statement
      out+="exactly one duplicate.";//add to string out
      System.out.println(out);//print out
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");//prompt user to enter Y or y to go again
      answer=scan.next();//make input equal to string answer
    }while(answer.equals("Y") || answer.equals("y"));//do while Y or y is entered, otherwise move on
  }//end main method

  //create listArray method
  public static String listArray(int num[]){
    String out="{";//make string out to be added to
    //create a for loop to generate the array in a string
    for(int j=0;j<num.length;j++){
      //create if statement for j>0
      if(j>0){
        out+=", ";//add this to string out
      }//end if statement
      out+=num[j];//add the correspodning array listing to string
    }//end for loop
    out+="} ";//add this to end of string out
    return out;//return out
  }//end method
  
  //create hasDups method
  public static boolean hasDups(int [] x){
      Boolean Dups=false;//declare a boolean to be returned
      int length=x.length;//find length of array
      //create for loop to test for duplicates
      for(int j=0;j<length;j++){
          int Target=x[j];//choose a value in the array to check for
          for(int i=0;i<length;i++){
              int Match=x[i];//make a variable to compare to the value you're looking for
              if(i!=j){//if the values are not in the same position in the array
                if(Match==Target){//if they are equal
                    Dups=true;//change boolean to true
                }//end if statement
            }//end if statement
            else{//create else statment
              continue;//continue
            }//end else statement
          }//end for loop
      }//end for loop
      return Dups;//return boolean
  }//end menthod
  
  //create exactlyOneDup method
  public static boolean exactlyOneDup(int [] x){
      Boolean onlyOne=false;//declare a boolean to be returned
      int numDups=0;//declare and initialize a variable to record number of duplicates
      if (hasDups(x)){//if there is atleast one duplicate continue
          int length=x.length;//find length of array
          //create a for loop to test for duplicates, just as the previous method did
          for(int j=0;j<length;j++){
              int Target=x[j];//single out one value of the array to find a match for
              for(int i=0;i<length;i++){//check each value for a match
                  int Match=x[i];//compare this value to your target value
                  if(i!=j){//if values are not in same position in array
                    if(Match==Target){//if they are equal
                        numDups++;//if 2 values match add 1 to numDups
                    }//end if statment
                }//end if statement
                //create and else statment
                else{
                  continue;//contiue
                }//end else statement
              }//end for loop
          }//end outer for loop
      }//end if statment
      //if numDups equals 2 there is only one pair (note the pair will be found and counted twice in the code above)
      if (numDups==2){
          onlyOne=true;//change boolean to true
      }//end if statment
      return onlyOne;//return boolean
  }//end method
}//end class
