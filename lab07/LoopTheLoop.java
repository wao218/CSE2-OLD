///////////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//lab07
//NumberStack Program
//October 20, 2014
//CSE2
//
/*a program that forces the user to enter an integer between 1 and 15, inclusive, 
and then prints out displays the number of stars, that depend on the value entered and stacks the numbers.*/

//Import Scanner
import java.util.Scanner;

//Define Class
public class LoopTheLoop {

    //Add main method
    public static void main(String[] args) {
            int nStars = 0;
            int stars = 0;
            //Declare instance of scanner to accpet user input
            Scanner input;
            //Call Scanner Constructor
            input = new Scanner(System.in);

            /*int nStars = 0;
            while (nStars < 10) {
                System.out.print(" * ");
                nStars++;
            } //end of loop

            int nStars = 0;
            int k = 0;

            while (nStars < 10) {

                while (k < nStars + 1) {
                    System.out.print('*');
                    k++;
                } //end of loop
                k = 0;
                System.out.println();
                nStars++;
            } //end of loop*/


            System.out.print("Enter an integer between 1 and 15: ");


            while (true) {
                boolean verify = input.hasNextInt();
                //check for integer
                if (verify) {

                    nStars = input.nextInt();
                    //check to see if input is between interval
                    if (nStars >= 1 && nStars <= 15) {

                        //prints out number of stars entered by user
                        while (nStars > stars) {
                            System.out.print("*"); // prints out stars
                            stars++; //increments variable
                        } //end of loop
                        System.out.println(); //prints out new line
                        int lineCount = 0; //line count
                        stars = 0; //stars count

                        //prints out lines for number inputed by user
                        while (nStars > lineCount) {
                            lineCount++; //increments variable

                            //prints out stars
                            while (stars < lineCount) {
                                System.out.print("*"); //print out stars
                                stars++; //increment variable
                            } //end of loop
                            stars = 0;
                            System.out.println(); //prints out new line
                        } //end of loop
                        
                    } //end of if statment
                    else {
                        System.out.println("You did not enter an integer between 1 and 15"); //prints out if an integer is entered outside the interval
                    } //end of else statement
                } //end of if statement
                else {
                    System.out.println("You did not enter an integer"); //prints out if integer is not entered 
                } //end of else statement
                System.out.println("Enter Y or y to go again: "); //ask user to continue program
                String yes = input.next(); //variable

                //if user enteres y or Y continue program, if not terminates program
                if ((yes.equals("Y")) || (yes.equals("y"))) {
                    continue;
                } //end of if statement
                else {
                    break;
                } //end of else statement

            } //end of loop 

        } //end of method

} //end of class