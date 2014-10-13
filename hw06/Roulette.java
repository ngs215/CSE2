//Nicholas Schan
////Nicholas Schan
//October 14, 2014
//CSE2 homework 6 Roulette
//
//This program used a carlo simulation to determine how often a certain method of 
//gambling with the game roulette earns a profit.

//create class, required for all java programs
public class  Roulette{
    
    //establish main method, required for all java programs
    public static void main(String[] args){
        
        int Roulette = (int)(Math.random()*38)+1;//create random int from 1 to 38
        int Winnings=0;//declare and initialize a variable for Winnings
        int totalWinnings=0;//declare and initialize a variable for total winnings
        int totalLoss=0;//declare and initialize a variable for total times no money was earned
        int gain=0;//declare and initialize a variable for times a profit was made
        int i=0;//declare and initialize a variable to control the loop
        
        //create a while loop to run the carlo simulation 1000 times
        while (i<1000){
            
            int j=0;//declare and initialize a variable to control the Roulette spinning loop
            Winnings=0;//set winnings equal to zero after each cycle
            //create loop fo roulette wheel spinning 100 times
            while(j<100){
                
                int Spin=(int)(Math.random()*38)+1;//create a random int from 1 to 38
                //create and if statement for your random betting number matches the random number spun
                if (Spin==Roulette){
                    Winnings+=36;//add 36 dollars to your winnings
                }//end if statement
               
                j++;//increase j by 1
                
            }//end while loop
            
             totalWinnings+=Winnings;//add your winnings from the round of 100 spins to your total winnings
            
            //create an if statement for no money won
            if (Winnings==0){
                totalLoss++;//count this round as a total loss
            }//end if statement
            
            //create if statement for a profit was made from your gambling
            if (Winnings>108){
                gain++;//cound this round as a gain
            }//end if statement
            
            i++;//increase i by 1
            
        }//end carlo simulation while loop
        System.out.println("Out of 1000 rounds you lose everything "+totalLoss+" times.");//print times you lost everything
        System.out.println("The total winnings for 1000  rounds was $"+totalWinnings);//print your total winnings from the simulations
        System.out.println("A profit was gained "+gain+" times out of 1000 rounds.");//print times you made a profit
    
        
    }//end main method
}//end class
