//Nicholas Schan
//CSE2 Homework 10
//November 18th 2014

//This program generates random poker hands and counts the numbe for single pair of each card rank for 10000 generated random hands

import java.util.Random;//import random number generator
import java.util.Scanner;//import scanner
//define class
public class PokerOdds{
  //declare main method
  public static void main(String [] arg){
    showHands();//call showHands method
    simulateOdds();//call simulateOdds method
  }//end main method
  
  //create showHands method
  public static void showHands(){
      String Yes="";//create an empty string to be added to later
      
      //create a do while loop
      do {
          int cardNum=52;//declare int for number of cards in a deck
          Scanner scan=new Scanner (System.in);//Create and instance of your scanner and define it
          int deck[]=new int[52];//declare space for an array to represent the deck of 52 cards
          int cards[]=new int[5];//declare space for an array to represtent the hand you're dealt
          int valueCards[]=new int[5];//declare space for the rank of the cards you're dealt
          
          for (int i=0; i<52; i++){//creare for loop to generate deck from 0 to 51
              deck[i]=i;//assign values to array
          }//end for loop
          for (int j=0; j<5; j++){//initialize your hand to contain all -1 values
              cards[j]=-1;//assign values
          }//end for loop
          
          for (int k=0; k<5; k++){//create for loop to generate random hand of 5 cards
              
              int Card=(int) (Math.random()*cardNum);//generate a random number originally between 0 and 51 but with a range decreased by 1 after each loop
              
              cards[k]=deck[Card];//set the card in your hand to the random card from the deck
              valueCards[k]=(deck[Card]%13);//find the rank of the card and store it by finding the remainder of dividing by 13
              
              for (int l=Card; l<51; l++){//shift the values from the the card you 'drew' back
                  deck[l]=deck[l+1];// assign the value of the next card to the current card
              }//end for loop
              deck[(cardNum-1)]=-1;//repalce card at end with -1
              cardNum--;//decrease variable controling the range of cards you can pick from by 1  
          }//end for loop
              
              //For EACH suit do the following
              System.out.print("Clubs : ");//print suit
              for (int o=0; o<5; o++){//check every card in your hand
                  if (cards[o]/13==0){//if the card is from the first 13 it is club
                      switch (valueCards[o]){//switch special cases for face cards
                          case 0:
                              System.out.print("A ");//make 0 correspond to aces
                              break;//break
                          case 1:
                              System.out.print("K ");//make 1 correspond to Kings
                              break;//break
                          case 11:
                              System.out.print("Q ");//make 11 correspond to Queens
                              break;//break
                          case 12:
                              System.out.print("J ");//make 12 correspond to Jacks
                              break;//break
                          default:
                               System.out.print(valueCards[o]+" ");//make the default the number of the rank
                              break;//break
                      }//end swtich statement
                  }//end if statement
              }
              System.out.println();//print a space
              
              //Repeat code used for clubs
              System.out.print("Diamonds : ");
              for (int p=0; p<5; p++){
                  if (cards[p]/13==1){//if card is in the second set of thirteen it is a diamond
                      switch (valueCards[p]){
                          case 0:
                              System.out.print("A ");
                              break;
                          case 1:
                              System.out.print("K ");
                              break;
                          case 11:
                              System.out.print("Q ");
                              break; 
                          case 12:
                              System.out.print("J ");
                              break;
                          default:
                               System.out.print(valueCards[p]+" ");
                              break;
                      }
                  }
              }//end for loop
              System.out.println();//print a space
              
              //Repeat code above for Spades
              System.out.print("Spades : ");
              for (int q=0; q<5; q++){
                  if (cards[q]/13==2){//if the card is in the third set of 13 it is a Spade
                      switch (valueCards[q]){
                          case 0:
                              System.out.print("A ");
                              break;
                          case 1:
                              System.out.print("K ");
                              break;
                          case 11:
                              System.out.print("Q ");
                              break; 
                          case 12:
                              System.out.print("J ");
                              break;
                          default:
                               System.out.print(valueCards[q]+" ");
                              break;
                      }
                  }
              }//end for loop
              System.out.println();//print a space
              
              //Repeat the code above for Hearts
              System.out.print("Hearts : ");
              for (int r=0; r<5; r++){
                  if (cards[r]/13==3){//if card is in the fourth set of 13 it is a Heart
                      switch (valueCards[r]){
                          case 0:
                              System.out.print("A ");
                              break;
                          case 1:
                              System.out.print("K ");
                              break;
                          case 11:
                              System.out.print("Q ");
                              break; 
                          case 12:
                              System.out.print("J ");
                              break;
                          default:
                               System.out.print(valueCards[r]+" ");
                              break;
                      }
                  }
              }//end for loop
              System.out.println();// print a space
              System.out.print("Enter Y or y to go again and anything else to quit: ");//prompt user to enter Y or y to go again
              Yes=scan.next();//save value of input
      } while (Yes.equals("Y")||Yes.equals("y"));//repeat while Y or y is entered
  }//end method
  
  //creat simulateOdds method
  public static void simulateOdds(){
    int notExactlyOne=0;//create int to tally how many dealings have not exactly one pair
    int pairOf=0;//declare and initialize int that will keep track of what the pair found is
    int p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,pA,pK,pJ,pQ;//declare a variable for each rank
    p1=p2=p3=p4=p5=p6=p7=p8=p9=p10=pA=pK=pJ=pQ=0;//initialize them all to zero
    //create a for loop to run the simulation 10000 times
    for (int h=0; h<10000; h++){
        int deck[]=new int[52];//declare space for the deck array
        int cards[]=new int[5];//declare space for the hand dealt array
        int valueCards[]=new int[5];//declare space for the rank of the cards dealt array
        //create a for loop to generate the deck for each cycle
        for (int i=0; i<52; i++){
             deck[i]=i;//store values in the deck
        }//end for loop
        for (int j=0; j<5; j++){//initialize the array for cards dealt with -1's
            cards[j]=-1;//store -1's in array
        }//end for loop
      
        int cardNum=52;//declare variable for number of cards in a deck
        for (int k=0; k<5; k++){//create loop to generate the dealing of 5 random cards
            
            int Card=(int) (Math.random()*cardNum);//generate a random number for how many cards left to pick from
            
            cards[k]=deck[Card];//store the value 'drawn' into your hand array
            valueCards[k]=(deck[Card]%13);//save the rank of that card in a different array
            //by removing that card from the deck store each value above a card to that card
            for (int l=Card; l<51; l++){
                deck[l]=deck[l+1];//store values, shifting deck down
            }//end for loop
            deck[51]=-1;//store the last value as -1
            cardNum--;//decrease the number of cards that can be dealt by 1
        }//end for loop
        //if there is not exactly one pair, determined by calling exactlyOneDup method
        if (!FindDuplicates.exactlyOneDup(valueCards)){
            notExactlyOne++;//add 1 to this variable
        }//end if statment
        //if there is exactly 1 pair
        if (FindDuplicates.exactlyOneDup(valueCards)){
            //check each card against the others to determine which rank repeats
            for(int m=0;m<5;m++){
                int Target=valueCards[m];//select a value in the array to compare the other values with
                for(int n=0;n<5;n++){
                    int Match=valueCards[n];//compare the Target value with all other values
                    if(n!=m){//if the two values are not in the same position in the array
                      if(Match==Target){//and they are equal
                          pairOf=Target;//set pairOf variable to that Rank
                      }//end if statement
                    }//end outer if statement
                }//end for loop
            }//end outer for loop
          switch (pairOf){//create a swtich statment for the pairOf variable
              case 0://case 0 pertains to Aces
                  pA++;//add one count to the Ace variable
                  break;//break
              case 1://case 1 pertains to kings
                  pK++;//add one to the King variable
                  break;//break
              case 2://The logic above is repeated for every achievable value
                  p2++;
                  break;
              case 3:
                  p3++;
                  break;
              case 4:
                  p4++;
                  break;
              case 5:
                  p5++;
                  break;
              case 6:
                  p6++;
                  break;
              case 7:
                  p7++;
                  break;
              case 8:
                  p8++;
                  break;
              case 9:
                  p9++;
                  break;
              case 10:
                  p10++;
                  break;
              case 11:
                  pJ++;
                  break;
              case 12:
                  pQ++;
                   break;
          }//end switch statement
      }//end if statement for only one pair found
          
    }//end simulation for loop
    System.out.println("Rank   Freq of Pair");//print titles Rank and Freq of Pair and the coorespoding values beneath them
    System.out.println("A :     "+pA);
    System.out.println("K :     "+pK);
    System.out.println("Q :     "+pQ);
    System.out.println("J :     "+pJ);
    System.out.println("10:     "+p10);
    System.out.println("9 :     "+p9);
    System.out.println("8 :     "+p8);
    System.out.println("7 :     "+p7);
    System.out.println("6 :     "+p6);
    System.out.println("5 :     "+p5);
    System.out.println("4 :     "+p4);
    System.out.println("3 :     "+p3);
    System.out.println("2 :     "+p2);
    System.out.println("Not exactly on pair: "+notExactlyOne);//inform user how many times hands were dealt withoug exactly one pair
       
  }//end method
}//end class
