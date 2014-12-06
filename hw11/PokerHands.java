//Nicholas Schan
//CSE 2 Homework 11 Assignment
//December 5th 2014

//This program has the user input a poker hand, displays that hand, and informs them of the rank

import java.util.Scanner;//import scanner
public class PokerHands{
    public static void main(String[] args){
        
        Scanner scan=new Scanner (System.in);//Create and instance of your scanner and define it
        System.out.print("Enter 'Y' or 'y' to enter a(nother) hand: ");
        String yes=scan.next();
        while(yes.equals("Y")||yes.equals("y")){
            
            int [] Hand={0, 0, 0, 0, 0};//create a matricies of your hand
            for (int i=0; i<5; i++){
                //prompt user to enter suit
                System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
                String suit=scan.next();
                //reprompt for invalid input
                while (!suit.equals("c")&&!suit.equals("d")&&!suit.equals("h")&&!suit.equals("s")){
                    System.out.println("You did not enter a valid response");
                    System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
                    suit=scan.next();
                }
                //prompt user to enter rank
                System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                String rank=scan.next();
                String values[]={"a", "k", "q", "j", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
                boolean found=false;
                for(int b=0; b<13; b++){
                    if (values[b]==rank){
                        found=true;
                    }
                }
                //reprompt for invalid input
                while (found){
                    System.out.println("You did not enter a valid response");
                    System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                    rank=scan.next();
                }
                //generate a number to represent the card, use multiples of 13 for suit
                int j=0;
                switch (suit){
                    case "c":
                        j=0;
                        break;
                    case "d":
                        j=13;
                        break;
                    case "h":
                        j=26;
                        break;
                    case "s":
                        j=39;
                        break;
                }
                //add rank to suit to get the number that represents the card
                switch (rank){
                    case "a":
                        j+=0;
                        break;
                    case "k":
                        j+=1;
                        break;
                    case "2":
                        j+=12;
                        break;
                    case "3":
                        j+=11;
                        break;
                    case "4":
                        j+=10;
                        break;
                    case "5":
                        j+=9;
                        break;
                    case "6":
                        j+=8;
                        break;
                    case "7":
                        j+=7;
                        break;
                    case "8":
                        j+=6;
                        break;
                    case "9":
                        j+=5;
                        break;
                    case "10":
                        j+=4;
                        break;
                    case "j":
                        j+=3;
                        break;
                    case "q":
                        j+=2;
                        break;
                }
                //generate the hand array
                Hand [i]=j;
                if(hasDups(Hand)){
                    System.out.println("You already entered that card.");
                    i--;
                }
            }
            
            System.out.println();
            showOneHand(Hand);//call showOneHand method
            int prob=Probability(Hand);//call probability method
            //inform user what their hand is
            switch (prob){
                case 1:
                    System.out.println("This is a Royal Flush");
                    break;
                case 2:
                    System.out.println("This is a Straight Flush");
                    break;
                case 3:
                    System.out.println("This is a Four of a Kind");
                    break;
                case 4:
                    System.out.println("This is a Full House");
                case 5:
                    System.out.println("This is a Flush");
                    break;
                case 6:
                    System.out.println("This is a Straight");
                    break;
                case 7:
                    System.out.println("This is a Two Pair");
                    break;
                case 0:
                    System.out.println("This is a High Card");
                    break;
            }
            
            System.out.println("Enter 'Y' or 'y' to enter a(nother) hand: ");//prompt user to go again
            yes=scan.next();
        }
        
    }//end main method
    
    //create a method to show the hand
    public static void showOneHand(int hand[]) {
        String suit[] = {
            "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        String out = "";
        for (int s = 0; s < 4; s++) {
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < 5; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out);
    }
    
    //create hasDups method
  public static boolean hasDups(int [] x){
      Boolean Dups=false;//declare a boolean to be returned
      int length=x.length;//find length of array
      //create for loop to test for duplicates
      for(int j=0;j<length;j++){
          int Target=x[j];//choose a value in the array to check for
          if (Target!=0){
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
          }
      }//end for loop
      return Dups;//return boolean
  }//end menthod
  //create a method to determine what the hand is
  public static int Probability(int [] Hand){
      int luck=0;
      int [] ranks= {0,0,0,0,0,0,0,0,0,0,0,0,0};
      int [] matches= {0,0,0,0,0};
      int [] flush= {0,0,0,0};
      for(int i=0; i<Hand.length;i++){
          int ranking=Hand[i]%13;
          ranks[ranking]=+1;
      }
      for (int j=1; j<5; j++){
          for(int k=0; k<13; k++){
              if (ranks[k]==j){
                  matches[j]=+1;
              }
          }
      }
      for (int m=0; m<4; m++){
          for (int n=0; n<5; n++){
              if (Hand[n]/13==m){
                  flush[m]=+1;
              }
          }
      }
      
      //Check for royal Flush
      for (int o=0; o<5; o++){
          int check=0;
          if (ranks[o]==1){
              check++;
          }
          if (check==5) {
              for (int p=0; p<4; p++){
                  if (flush[p]==5){
                      luck =1;
                      return luck;
                  }
              }
          }
      }
      //Check for straight flush
      for (int l=0; l<4; l++){
          if (flush [l]!=5){
              continue;
          }
          else{
              for (int q=0; q<13; q++){
                  if (ranks[q]>=1){
                      int five=1;
                      for (int r=q+1; r<=(q+4); r++){
                          if (ranks[r]>=1){
                              five++;
                          }
                      }
                      if (five==5){
                          luck=2;
                          return luck;
                      }
                  }
              }
          }
      }
      //Check for matches
      for (int t=0; t<4; t++){
          if (matches[t]==4){
              luck=3;
              return luck;
          }
          if(matches[t]==2){
              luck=7;
              for (int u=0; u<4; u++){
                  if(matches[u]==3){
                      luck=4;
                      return luck;
                  }//end if statement
              }
          }
      }
      //check for flush
      for (int v=0; v<4; v++){
          if (flush[v]==5){
              luck=5;
              return luck;
          }
      }
      //check for straight
      for (int w = 0; w < 13; w++) {
          if (ranks[w] == 1) {
              int five0 = 1;
              for (int x= w+1; x<= (w+4); x++) {
                  if (ranks[x] == 1) {
                      five0++;
                  }//end if statement
              }
              if (five0 == 5) {
                  luck = 6;
                  return luck;
              }//end if statement
          }
          else{
              break;
          }
      }//end for loop
      return luck;
  }//end method

}//end class