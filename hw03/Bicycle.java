//////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw03
//Bicyle Java Program
//September 12, 2014
//CSE2
//
/*a program that prompts the user to enter two digits, 
the first giving the number of counts on a cyclometer and 
the second giving the number of seconds during which the counts occurred, 
and then prints out the distance traveled and 
the average miles per hour.*/

//Import Scanner Class
    import java.util.Scanner;

//Define Class
public class Bicycle {
    
//Add main method
    public static void main(String[] args) {
        
        //Declare instance of the scanner in order to accpt input
        Scanner myScanner;
        
        //Call scanner constructor
        myScanner = new Scanner( System.in );
        
        //Prompt the user for the number of counts
        System.out.print ("Enter the number of counts: ");
        
        //Accept user input for counts
        int nCounts = myScanner.nextInt();
       
        //Prompt the user for the number of seconds
        System.out.print ("Enter the number of seconds : ");  
       
        //Accept user input for seconds
        int nSeconds = myScanner.nextInt(); 
       
        //Variables for distance and MPH
        double wheelDiameter=27.0, //the diameter of the wheel
        PI=3.14159, //value for PI
        feetPerMile=5280, //number of feet in a mile
        inchesPerFoot=12, //number of inches in a foot
        secondsPerMinute=60, //number of seconds in a minute
        minutesPerHour=60; //number of minutes in an hour
        double totalDistance; //Total distance
        totalDistance=((int)(nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile *100)/100.0); //Calculations of the total distance in miles
        double mph=(totalDistance/(nSeconds/secondsPerMinute/minutesPerHour)); //Average miles per hour 
        
        //Print out the stored variables
        System.out.println ("The total distance was "+totalDistance+ " and took "+(nSeconds/secondsPerMinute) + " minutes" );
        System.out.println ("The average miles per hour was "+ (int) (mph*100)/100.0 );
        
    }//end of main method
}//end of class