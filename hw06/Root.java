///////////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw04
//Root Program
//October 14, 2014
//CSE2
//
/*program that forces the user to enter a double that is greater than 0, 
uses the above algorithm to compute the square root of the number, and then prints it out.*/

//Import Scanner
import java.util.Scanner;

//Define class
public class Root {

    //Add main method
    public static void main(String[] args) {

            //Declare instance of scanner to accpet user input
            Scanner input;

            //Call Scanner Constructor
            input = new Scanner(System.in);

            //prompt user to enter a double greater than 0
            System.out.print("Enter a double greater than 0: ");
            boolean doubleInput = input.hasNextDouble();
            double x = input.nextDouble();

            //Variables
            double tolerance = 0.0000001;
            double low = 0;
            double high = (1 + x);
            double middle = (high + low) / 2;


            //compute the square root of x 
            if (doubleInput) {
                if (x > 0) {
                    //Print out starting interval
                    System.out.println("[" + low + "," + high + "]");
                    
                    //Finds the square root
                    while ((high - low) > tolerance) {
                        middle = (high + low) / 2; //calculates the middle 
                        
                        //If the middle squared is greater than x change to new high value
                        if ((middle * middle) > x) {
                            high = middle;
                            System.out.println("[" + low + "," + high + "]");

                        } //end of if statement
                        
                        //If the middle is less than x change to new low
                        else {
                            low = middle;
                            System.out.println("[" + low + "," + high + "]");
                        } //end of else statement
                    } //end of loop
                    
                    //Print out the square root
                    middle = (high + low) / 2;
                    System.out.println("Square Root = " + middle);

                } //end of if statement
                else {
                    System.out.println("You did not enter a double greater than 0"); //print out if you did not enter a double greater than 0 
                } //end of else statement
            } //end of if statement
            else {
                System.out.println("You did not enter a double"); //print out if you did not enter a double
            } //end of else statement
        } //end of method

} //end of class