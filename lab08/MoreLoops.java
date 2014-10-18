//Nicholas Schan
//CSE 2 Lab 8 MoreLoops.java
//October 17, 2014

//This assignment requires switching loop types to produce the same outputs



import java.util.Scanner;//import scanner
//declare class
public class MoreLoops {
    //declare main method
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);//create instance of scanner
        int n = 0;//declare and initialize variable n as 0

        System.out.print("Enter an int- ");//prompt user to enter an int
        //create if statement for int is not entered
        if (!scan.hasNextInt()){
            do {
                scan.next(); //get rid of the junk entered by user
                System.out.print("You did not enter an int; try again- ");//inform user they did not input an int
            } while (!scan.hasNextInt());//end do while loop if this condition is met
        }//end if statement for input in not an int

        n = scan.nextInt();//initialize n as next int

        int j=0;//declare and initialize variable j
        while (j < n && j < 40) {
            int k=0;//declare and initialize varialble k
            while (k < j + 1) {
                System.out.print('*');//print j number of stars
                k++;//increase k by 1
            }//end while loop that replaced inner for loop
            System.out.println();//skip a line
            j++;//increase j by 1
        }//end while loop that replaced outer for loop

        int k = 4;//declare and initialize int k as 4
        
        //create while loop for k is less than or equal to 4
        while(k<=4) {
            System.out.println("k=" + k); //print k
            k++;//increase k by 1
        }//end while loop that replaced do while loop

        //create a for loop the run 11 times, increment variable count by 1 for each cycle
        for (int count=0; count<=10; count++) {
            if (n==1||n==2) {
                System.out.print("Case 2 ");//print case 2 (on the same line) for every cycle
            }//end if statment that replaced case 1 and case 2 from the switch statment
            else if (n==3){
                break;//leave outerloop
            }//end else if statement that replaced case 3 from the switch statement
            else if (n==4){
                System.out.println("Case 4");//print "Case 4" fro every cycle
                System.out.println("Case 5");//print "Case 5" for every cycle
            }//end else if statement that replaced case 4 and case 5 from the swtitch statement
            else if(n==5){
                System.out.println("Case 5");//print "Case 5"
                break;//leave outerloop
            }//end else if statement that replaced case 5: in the switch statement
            else{
                System.out.println(n + " is > 5 or <1");//print this line every cycle for n>5 or <1
            }//end else statement that replaced the default from the switch statement
                
        }//end for loop
            
        //COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE UING
        // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
        //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G., 
        //   -5, 1, 20, 5, ETC.
        //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY 
        //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    }//end main method
}//end class