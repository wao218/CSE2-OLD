//////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//lab04
//Big Mac Again Java Program
//September 18, 2014
//CSE2
//
/*program that uses the Scanner class to obtain from users 
how many Big Macs they want 
and whether they want an order of fries. 
It then prints out the total cost of the meal. 
Big Macs still cost $2.22 each,  and an order of fries costs $2.15.*/

//Import Scanner Class
    import java.util.Scanner;
    
//Define Class
public class BigMacAgain {
    
//Add main method 
    public static void main(String[] args) {
        
        //Declare Instance of the Scanner in order to accept user input
        Scanner myScanner;
        
        //Call Scanner Constructor
        myScanner = new Scanner( System.in );
       
         //Cost of Big Mac and fries
        double bigMac$ = 2.22; 
        double fries$ = 2.15; 
       
        //Prompt user for the number of Big Macs
      
        System.out.print ("Enter the number of Big Macs (an integer > 0): ");
        boolean bigMacs = myScanner.hasNextInt(); 
        if (bigMacs)
        {
            //Accept user input for number of Big Macs/cost
            int nBigMacs = myScanner.nextInt();
            if (nBigMacs >=0 )  {
                System.out.println ("You ordered " +nBigMacs+ " Big Macs for a cost of "+nBigMacs+"x2.22 = " +((int)(nBigMacs*bigMac$*100))/100.0 );
                System.out.print ("Do you want an order of fries Y/y/N/n ?"); 
                String input = myScanner.next();
            
            //Ask for order of fries, if yes add to total amount, if no do not add to total amount
                if (input.equals ("Y") || input.equals ("y") || input.equals ("N") || input.equals ("n") ) {
                   
                    if (input.equals("Y") || input.equals("y")) {
                    System.out.println ("You ordered fries at a cost of $2.15");
                    System.out.println("The total cost of the meal is " +((int)(nBigMacs*bigMac$ *100) + fries$ *100)/100.0);
                    } //end of if statement    
                    if (input.equals ("N") || input.equals ("n") ) {
                    System.out.println("The total cost of the meal is " + (((int)(nBigMacs*bigMac$*100)/100.0)));
                    } //end of if statement
                } //end of if statement 
                else {  
                    System.out.println("You did not enter one of 'Y' , 'y' , 'N' , 'n' "); //Prompt user they did not enter correct characters
                    return; //terminate program
                } //end of else statement
            } //end of if statement 
            else {
            System.out.println("You did not enter an integer greater than 0"); //Prompt user they did not input an integer >0
                    return; //terminate program
            } //end of else statement 
        }// end of if statement
        else {
            System.out.println("You did not enter an integer"); //Prompt user they did not enter an integer 
                    return; //terminate program
        } //end of else statement 

    } //end of main method 
    
} //end of class 