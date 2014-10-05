/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    //System.out.println("Check 1: k= "+k+" n= "+n);
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
      //System.out.println("Check 2: k= "+k+" n= "+n);
    }
    if(n*n>k){
      n=42;
      out+=n+k;
      //System.out.println("Check 3: k= "+k+" n= "+n);
    }
    else {
      n=45;
      out+=n+k;
    }
    //System.out.println("Check 4: k= "+k+" n= "+n);
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        System.out.println("Check 7: k= "+k+" n= "+n);
        break;
      case 97:
        n-=14;
        k-=2;
        System.out.println("Check 8: k= "+k+" n= "+n);
        break;
      case 98:
        n/=5;
        k/=9;
        System.out.println("Check 9: k= "+k+" n= "+n);
      default:
        n-=3;
        k-=5;
        System.out.println("Check 10: k= "+k+" n= "+n);
    }
    //System.out.println("Check 5: k= "+k+" n= "+n);
     out+=1/n + 1/k;   
    //System.out.println("Check 6: k= "+k+" n= "+n);
    System.out.println(out);
  }
}

/*
 * Error report:
 * By putting in System.out.printlns I was able to determine that k goes to zero
 * after my Fifth check and therefore I knew to narrow my search to the switch(n+k)
 * statement. Commenting my first set of print lines and adding more the swtich statment
 * I was able to determine that k goes to zero on my tenth check.
 * k goes to zero on line 53 from the operation k-=5
 */

