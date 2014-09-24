//////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw04
//Month Program
//September 22, 2014
//CSE2
//
/*program that prompts the user to enter an integer for 
the month (1 for January, 2 for February, etc.) 
and then displays the number of days in the month). */

//Import Scanner Class
    import java.util.Scanner;

//Define Class
public class Month {
    
//Add Main Method
    public static void main(String[] args) {
        
        //Declare Instance of the Scanner in order to accept user input
        Scanner myScanner;
        
        //Call Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Prompt user to enter a number for the month 
        System.out.print("Enter an integer giving the number of the month (1-12): ");
        boolean number = myScanner.hasNextInt();
        
        //Give month and number of days in month 
        if(myScanner.hasNextInt()) {
            int month = myScanner.nextInt();
            
            if (month <=12 && month >=1) {
            
                if (month ==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("The month has 31 days"); //Tells the months with 31 days
                }//End of if Statement 
            
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("The month has 30 days"); //Tells the months with 30 days
                }//End of if statment 
                
                //If month is februrary calculate for leap year
                if (month == 2) {
                    System.out.print("Enter an integer giving the year: ");
                    int year=myScanner.nextInt();
                    
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        System.out.println ("The month has 29 days");
                    }//End of if Statment 
                        else {
                            System.out.println ("The month has 28 days");
                        }//End of else Statement
                            return;//Terminate program
                }//End of if Statement
                
            }//End of if Statement 
                else {
                    System.out.println("You did not enter an integer between 1 and 12"); //If you did not enter an integer between 1 and 12
                }//End of else Statement 
                    return;//Terminate program
                    
        }//End of if Statement 
                else {
                    System.out.println("You did not enter an integer"); //If you did not enter an integer
                }//End of else Statement
                    return;//Terminate program
    }//End of main method
}//End of class