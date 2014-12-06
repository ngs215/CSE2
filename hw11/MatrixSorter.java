//Nicholas Schan
//CSE 002 HW 11 Program 2
//December 5th 2014

//This program

import java.util.*;//import random number generator
public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];//make space for a 3d array
    mat3d=buildMat3d();//call a method to generate an array
    show(mat3d);//call a method to print the array
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));//call method to find the smallest value in the array
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);//call a method to sort the last slab of the matrix
    show(mat3d);//recall method to print the matrix
   }
   //create method to build the matrix
   public static int[][][] buildMat3d(){

       int mat3d [][][]=new int [3][7][9];//initialize the matrix
       for(int i=0; i<3; i++){
           for (int j=0; j<(2*i)+3; j++){
               for (int k=0; k<(i+j+1); k++){
                   int input=(int) (Math.random()*100);//generate a random number
                   mat3d[i][j][k]=input;//assign that number to the current matrix slot
               }//end for loop
           }//end outer for loop
       }//end outermost for loop
       return mat3d;//return the matrix
   }//end method
   //create a method to show the matrix
   public static void show(int [][][] mat3d){
       //use nested for loops to print each line of each slab
       for(int i=0; i<3; i++){
           System.out.println("---------------Slab "+(i+1));//inform user what slab is being printed
           for (int j=0; j<(2*i)+3; j++){
               for (int k=0; k<(i+j+1); k++){
                   System.out.print(mat3d[i][j][k]+" ");//print the value and add a space
               }//end inner for loop
               System.out.println();//skip a space
           }//end second loop
           System.out.println();//add another line
       }//end outer for loop
       
   }//end method
   
   //create a method to find the min value 
   public static int findMin(int [][][] mat3d){
       
       System.out.println("---------------");//print a line for neatness
       int Min=mat3d[0][0][0];//assign the first value to the the min
       //use nested for loops to compare values to the min
       for(int i=0; i<3; i++){
           for (int j=0; j<(2*i)+3; j++){
               for (int k=0; k<(i+j+1); k++){
                   //if you find a value smaller than the current marked min, replace the value with the new min
                   if (mat3d[i][j][k]<Min){
                       Min=mat3d[i][j][k];//update min
                   }//end if statement
               }//end inner for loop
           }//end middle for loop
       }//end outer for loop
       return Min;//return min
   }//end method
   
   //create a method to sort the last slab
   public static int[][] sort(int[][] mat2d){
      //create a for loop the sort each row
      for (int k=0; k<7; k++){
          //create a for loop the sort the number in ascending order in each row
          for (int l=0; l<(k+3); l++){
              int currentMin= mat2d [k][l];//set the current min as the first number and move down the row sequentially
              int currentMinIndex=l;//keep track of current min index
              //create a for loop to compare your current min with the numbers following it
              for (int m=l+1; m<(k+3); m++){
                  //create an if statment if your current min is larger than a number following it
                  if (currentMin > mat2d[k][m]){
                      currentMin= mat2d[k][m];//set current min to this next smallest number
                      currentMinIndex=m;//save the location as the index
                  }//end if statement
              }//end for loop
              //create and if statement for the index of the min has changed
              if (currentMinIndex !=l){
                  mat2d[k][currentMinIndex]=mat2d[k][l];//switch old min with new min in the array
                  mat2d[k][l]=currentMin;//set the space being evaluated to the current min value
              }//end if statment
          }//end for loop
      }//end outer for loop

      return mat2d;//return 2d matrix
   }//end method

   
}//end class