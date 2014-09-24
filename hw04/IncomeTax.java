//////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw04
//Income Tax Program
//September 22, 2014
//CSE2
//
/*program that prompts the user to enter an int 
that gives the thousands of dollars of income
and then writes out the amount of tax on the income, given the 
following (progressive) schedule:  <20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%.*/

//Import Scanner Class
    import java.util.Scanner;

//Define Class
public class IncomeTax {
    
//Add Main Method
    public static void main(String[] args) {
        
        //Declare Instance of the Scanner in order to accept user input
        Scanner myScanner;
        
        //Call Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Tax rates
        double taxRate1=0.05;
        double taxRate2=0.07;
        double taxRate3=0.12;
        double taxRate4=0.14;
        
        //Prompt user for amount of income
        System.out.print ("Enter an int giving the number of thousands: ");
        boolean income=myScanner.hasNextInt();
        if(income) {
            int nIncome = myScanner.nextInt();
            if(nIncome >= 0) {
                //Accept user input for income/ determine income tax
               
                if(nIncome<20) {
                    System.out.println("The tax rate on " +"$"+((int)(nIncome*1000)*100/100.0) +
                    " is 5.0%, and the tax is "+"$"+((int)((nIncome*1000)*taxRate1)*100/100.00)); //If income is less than $20,000 it has tax rate of 5%
                
                } //End of if Statement  
                
                if(nIncome>=20 && nIncome<40) {
                     System.out.println("The tax rate on " +"$"+((int)(nIncome*1000)*100/100.0) +
                    " is 7.0%, and the tax is "+"$"+((int)((nIncome*1000)*taxRate2)*100/100.00)); //If income is $20,000 or more but less than $40,000 it has a tax rate of 7%
                
                } //End of if Statement
                
                if(nIncome>=40 && nIncome<78) {
                    System.out.println("The tax rate on " +"$"+((int)(nIncome*1000)*100/100.0) +
                    " is 12.0%, and the tax is "+"$"+((int)((nIncome*1000)*taxRate3)*100/100.00)); //If income is $40,000 or more but less than $78,000 it has a tax rate of 12%
                }//End of if Statement 
                
                if(nIncome>=78) {
                    System.out.println("The tax rate on " +"$"+((int)(nIncome*1000)*100/100.0) +
                    " is 14.0%, and the tax is "+"$"+((int)((nIncome*1000)*taxRate4)*100/100.00)); //If income is $78,000 or more it has a tax rate of 14%
                }//End of if Statement
            }//End of if Statement
            else {
                System.out.println("You did not enter a positive integer"); //If you did not enter a postive integer
                     //terminate program
            }//End of else Statement
        }//End of if Statement
        else {
            System.out.println ("You did not enter an integer"); //If you did not enter an integer
                 //terminate program
        } //end of else statement 
    }//End of main method
}//End of class