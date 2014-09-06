// Nicholas Schan
//CSE2 Homework 2 Assignment
// September 9 2014

// Arithmetic Program performs and dispalys the following arithmeteic
//  1) Total cost of each type of item bought
//  2) Sales tax for each type of item bought
//  3) Total cost of all items without sales tax
//  4) Total cost paid for all items with sales tax

public class Arithmetic{
    
    public static void main(String [] args){
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost$=2.58;
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;

        //Calculate total price of each type of item purchased
        double totalSockCost$=nSocks*sockCost$;
        double totalGlassesCost$=nGlasses*glassCost$;
        double totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        
        //Calculate sales tax on each type of item purchased
        double taxSocks$=totalSockCost$*taxPercent;
        double taxGlasses$=totalGlassesCost$*taxPercent;
        double taxEnvelopes$=totalEnvelopeCost$*taxPercent;
        
        //Formats tax calculations to contain only 2 decimal points
        //Note: imperfect correction due to failure to round properly
        double taxSocksFormatted1=(int)(taxSocks$*100); //isolates 2 sig figures
        double taxSocksFormatted2=taxSocksFormatted1/100.0; //corrects decimal placement
        double taxGlassesFormatted1=(int)(taxGlasses$*100);
        double taxGlassesFormatted2=taxGlassesFormatted1/100.0;
        double taxEnvelopesFormatted1=(int)(taxEnvelopes$*100);
        double taxEnvelopesFormatted2=taxEnvelopesFormatted1/100.0;
        
        //Calculate total cost without tax and total amount paid including tax
        double totalCost=totalSockCost$+totalGlassesCost$+totalEnvelopeCost$;
        double totalTax=taxSocks$+taxGlasses$+taxEnvelopes$;
        double totalPaid=totalCost+totalTax;
        
        //Format total amount paid to have only 2 decimal places
        double totalPaidFormatted1=(int)(totalPaid*100); //isolates 2 sig figures
        double totalPaidFormatted2=totalPaidFormatted1/100.0; //corrects decimal placment
        
        //Print computed results 
        System.out.println("The total cost of socks was $"+totalSockCost$+" with an additional charge of $"+taxSocksFormatted2+" for sales tax.");
        System.out.println("The total cost of glasses was $"+totalGlassesCost$+" with an additional charge of $"+taxGlassesFormatted2+" for sales tax.");
        System.out.println("The total cost of envelopes was $"+totalEnvelopeCost$+" with an additional charge of $"+taxEnvelopesFormatted2+" for sales tax.");
        System.out.println("The total cost of all the purchased items was $"+totalCost+" without sales tax.");
        System.out.println("The total paid was $"+totalPaidFormatted2+" including sales tax.");
    }

}