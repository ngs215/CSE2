//Nicholas Schan
//September 26, 2014
//CSE@ Lab 5 Random Games Program
//
//This program allows the user to choose from Roulette, craps, and picking a
//card from a deck of 52 cards by using switch statements

import java.util.Scanner;//import scanner

//create class, required for all java programs
public class  RandomGames{
    
    //establish main method, required for all java programs
    public static void main(String[] args){
    
        Scanner myScanner=new Scanner (System.in);//Create and instance of your scanner and define it
        
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");//promt user to pick game
        
        String Game=myScanner.next();//define user input as string variable Game
        
        //create if statement for input is greater than one character
        if (Game.length()>1){
            System.out.println("A single character is expected.");//notify user only one char is expected
        }//end if statment
        
        //create else if statement for         
        else if (Game.equals("R")||Game.equals("r")||Game.equals("C")||Game.equals("c")||Game.equals("P")||Game.equals("p")){
            
            //create switch statement to determine which game is being selected
            switch (Game){
                case "R": case "r"://for cases R and r play Roulette
                    int Roulette = (int)(Math.random()*38)+1;//create random int from 1 to 38
                    //creat switch statment to modify certain cases to get proper game values
                    switch (Roulette){
                        case 37://for case 37 make the number 0
                           System.out.println("Roulette: 0");
                           break;
                          
                        case 38://for case 38 make the number 00
                           System.out.println("Roulette: 00");
                           break;
                           
                        default: System.out.println("Roulette: "+Roulette);//let default case be the random number
                            break;
                        }//end Roulette switch statement
                     break;
                
                case "C": case "c"://for cases C and c play craps
                    int Roll1= (int)(Math.random()*6)+1;//generate random dice roll
                    int Roll2= (int)(Math.random()*6)+1;//generate another random dice roll
                    int Sum= Roll1+Roll2;//sum the 2 rolls
                    System.out.println("Craps: "+Roll1+"+"+Roll2+"="+Sum);//print resut of game
                    break;
                    
                case "P": case "p"://for cases P and p pick a random card
                    int suit=(int)(Math.random()*4)+1;//generate a random number from 1 to 4
                    int card=(int)(Math.random()*13)+1;//generate a random number from 1 to 13
                    String Suit= "null";//decare and initialize a string for the suit
                    String Card= "null";//declare and initialize a string for the card
                   
                    //create a switch statement for face cards and aces
                    switch (card){
                        case 1: Card= "Ace";//for case one the card will be an ace
                            break;
                        case 11: Card= "Jack";//for case 11 the card will be a Jack
                            break;
                        case 12: Card= "Queen";//for case 12 the card will be a Queen
                            break;
                        case 13: Card= "King";//for case 13 the card will be a King
                            break;
                        default: Card=""+card;//make the default case the generated number
                            break;
                    }//end switch statement
                    
                    //create a switch statement to determine the suit
                    switch (suit){
                        case 1: Suit= "Diamonds";//for case 1, Diamonds
                            break;
                        case 2: Suit= "Clubs";//for case 2, Clubs
                            break;
                        case 3: Suit= "Hearts";//for case 3, Hearts
                            break;
                        case 4: Suit= "Spades";//for case 4, Spades
                            break;
                    }//end switch statment
                    System.out.println(Card+" of "+Suit);//print card picked
                        
            }//end swtich statemnt for Game
        }//end else if statment 
           
        //create else statement for unexpected entered character
        else{
            
            System.out.println(Game+" is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");//notify user input is not acceptable
            
        }//end else statment
        
        
    }//end main method
}//end class