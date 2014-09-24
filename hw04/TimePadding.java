//////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw04
//Month Program
//September 22, 2014
//CSE2
//
/*program that has the user enter an positive integer giving the number of seconds 
that have passed during the day and then displays the time in conventional form. */

//Import Scanner Class
    import java.util.Scanner;

//Define Class
public class TimePadding {
    //Add Main Method
    public static void main(String[] args) {
        //Declare Instance of the Scanner in order to accept user input
        Scanner myScanner;
        
        //Call Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Prompt user to input the number of seconds 
        System.out.print("Enter the time in seconds: ");
        boolean time = myScanner.hasNextInt();
        
        if(time) {
            int seconds = myScanner.nextInt();
            if (seconds >=0) {
                
                if ((seconds >= 0) && (seconds < 60)) {
                    
                    int clockSeconds1 = seconds/10;
                    int clockSeconds2 = seconds%10;
                    System.out.println("The time is 00:00:" + clockSeconds1 + clockSeconds2); //Converts seconds into seconds from anything greater than or equal to 0 and less than 60 
                    
                }//End of if statement
                
                if ((seconds >= 60) && (seconds < 3600)) {
                    
                    int clockMinutes = seconds/60;
                    int clockSeconds = seconds%60;
                    System.out.println("The time is 00:" + clockMinutes +":"+ clockSeconds); //Converts from seconds to minutes and seconds from anything greater than or equal to 60 and less than 3600
                    
                }//End of if statement
    
                if ((seconds >= 3600)) {
                    
                    int clockHours = seconds/3600;
                    int clockMinutes = seconds%3600/60;
                    int clockSeconds = seconds%60;
                    System.out.println("The time is" + clockHours + ":" + clockMinutes + ":" + clockSeconds);// converts from seconds to minutes and seconds and hours from anything greater than or equal to 3600
                    
                }//End of if statement
            }
            else {
                System.out.println("You did not enter a positive integer"); //If you did not enter a positive integer
                     //terminate program
            }//End of else Statement
        }//End of if Statement
        else {
            System.out.println ("You did not enter an integer"); //If you did not enter an integer
                 //terminate program
        } //end of else statement 
        
    }//End of main method
   
}//End of class
    