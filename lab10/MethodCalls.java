//Nicholas Schan
//CSE2 Lab 10 Methods calling Methods
//October 31st 2014

//This program practices methods calling other methods

//create class
public class MethodCalls{
    //create main method
    public static void main(String []  arg){
        int a=784,b=22,c;//declare ints and initialize a and b
        c=addDigit(a,3);//call addDigit to combine a and 3 
        System.out.println("Add 3 to "+a+" to get "+c);//print the result of c
        c=addDigit(addDigit(c,4),5);//call addDigit to combine c with for and that result with 5
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);//print result
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));//call addDigit to combine -98 and 3
        c=join(a,b);//call join to join a and b
        System.out.println("Join "+a+" to "+b+" to get "+c);//print result of joining a and b
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));//call join to join 87, 42, and 83 and print
        System.out.println("Join -9 and -90 to get "+join(-9,-90));//call join to join -9 and -90 and print
    }//end main method
    
    //create addDigit method
    public static int addDigit(int a, int b){
        //if digit is greater than 10 return number
        if (b>10){
            return a;//return number
        }//end if statement
        boolean Neg=false;//set boolean Neg to false
        //create and if statment for a is negative
        if (a<0){
            a=a*(-1);//make a positive
            Neg=true;//make boolean Neg true
        }//end if statement
        double x=a/10;//divide a by 10
        int i=1;
        int j=(i*10)/i;//let j denote a rounded down to the nearest ten to a power of ten
        //use the while loop to find how many zeros to add before the digit before you can combine it with the number
        while (x>1){
            x=x/10;//divide x by 10
            i++;//increase i by 1
            j=j*10;//increase j by a multiple of 10
        }//end while loop
        
        int add=(b*j)+a;//multiply b with j and add to a
        //if Neg is true
        if(Neg){
         add=add*(-1);//make output negative 
        }//end if statment
        return add;//return the answer
    }//end method
    
    //create method join
    public static int join(int a, int b){
        //if both a and b are negative
        if (a<1&&b<1){
            a=a*(-1);//make a positive
            b=b*(-1);//make b positive
        }//end if statement
        int m=10;//use m for arithmic manipulation
        int n=1;//use n for arithmic manipulation
        double x=a/10;//divide a by 10
        int c=(a%m)/n;//find the first digit in a
        int num=addDigit(b,c);//add it to the front of b
        b=num;//make b the result of addDigit
        //continue process above until all digits in a are added to b
        while (x>1){
            x=x/10;
            m=m*10;
            n=n*10;
            c=(a%m)/n;
            num=addDigit(b,c);
            b=num;
        }//end while loop
        return b;//return answer
    }//end join method
        
}//end class

