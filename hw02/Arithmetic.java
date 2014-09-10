////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw02
//Arithmetic Java Program
//September 9, 2014
//CSE2
//
/*You go shopping at Walmart’s and want to compute 
the cost of the items you bought, including the PA sales tax of 6%.*/

//Define Class
public class Arithmetic {
    
//add main method
    public static void main(String[] args) {
        
    //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //('$' is a part of the variable name)
    double sockCost$=2.58;
    
    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;
    
    //Number of boxes of envelopes 
    int nEnvelopes=1;
    //Cost per box of envelopes
    double envelopeCost$=3.25;
    //PA sales tax 
    double taxPercent=0.06;
    
    //Computations of the cost of each item, total purchase, total paid and each of its sales tax
    double totalSockCost$=(sockCost$ * nSocks); //Total cost of socks
    double taxOnSocks$=(totalSockCost$ * taxPercent); //Sales tax on socks
    double totalGlassCost$=(glassCost$ * nGlasses); //Total cost of glasses
    double taxOnGlasses$=(totalGlassCost$ * taxPercent); //Sales tax on glasses
    double totalEnvelopeCost$=(envelopeCost$ * nEnvelopes); //Total cost of Envelopes
    double taxOnEnvelopes$=(totalEnvelopeCost$ * taxPercent); //Sales tax on envelopes
    double totalCostOfPurchases$=(totalEnvelopeCost$ + totalGlassCost$ + totalSockCost$); //Total cost of purchases before sales tax
    double taxOnPurchases$=(totalCostOfPurchases$ * taxPercent); //Sales tax on purchases
    double totalPaid$=(totalCostOfPurchases$ + taxOnPurchases$); //Total amount paid with sales tax
    
    //Print out numbers stored in variables that store number of items and cost
   System.out.println ("Socks");
   System.out.println ("quantity: "+nSocks);
   System.out.println ("Cost per sock: $"+sockCost$);
   System.out.println ("Glasses");
   System.out.println ("quantity: "+nGlasses);
   System.out.println ("Cost per glass: $"+glassCost$);
   System.out.println ("Envelopes");
   System.out.println ("quantity: "+nEnvelopes);
   System.out.println ("Cost per box of envelopes: $"+envelopeCost$);
   System.out.println ("Total cost of socks without taxes: $" +totalSockCost$);
   System.out.println ("Sales tax on socks: $"+(int) (taxOnSocks$ *100) / 100.0);
   System.out.println ("Total cost of glasses without taxes: $" +totalGlassCost$);
   System.out.println ("Sales tax on glasses: $" +(int) (taxOnGlasses$ * 100) / 100.0);
   System.out.println ("Total cost of envelopes without taxes: $" +totalEnvelopeCost$);
   System.out.println ("Sales tax on envelopes: $" +(int) (taxOnEnvelopes$ * 100) / 100.0);
   System.out.println ("Total cost of purchase without taxes: $" + (int) (totalCostOfPurchases$ *100) /100.0);
   System.out.println ("Sales tax on total cost of purchase: $" +(int) (taxOnPurchases$ * 100) / 100.0);
   System.out.println ("Total amount paid including sales tax: $" +(int) (totalPaid$ *100) / 100.0);
   
    }//end of main method
}//end of class
