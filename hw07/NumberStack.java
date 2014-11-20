///////////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw07
//NumberStack Program
//October 20, 2014
//CSE2
//
/*a program that forces the user to enter an integer between 1 and 9, inclusive, 
and then prints out displays that depend on the value entered and stacks the numbers.*/

//Import Scanner
import java.util.Scanner;

//Define Class
public class NumberStack {

    //Add main method
    public static void main(String[] args) {

            //Declare instance of scanner to accpet user input
            Scanner input;
            //Call Scanner Constructor
            input = new scanner(System.in);

            System.out.print("Enter an integer between 1 and 9: ");


            int x = input.nextInt(); //input from user

            //check for integers between 1 and 9 inclusive
            if (x >= 1 && x <= 9) {

                //Creates separates groups
                for (int groups = 1; groups < x + 1; groups++) {

                    //Creats pattern for each line
                    for (int lines = 0; lines < groups; lines++) {

                        //Creates spacing for pyramid shape for numbers
                        for (int spaces = 0; spaces < (8 - groups); spaces++) {
                            System.out.print(" "); //prints out spacing
                        } //end of loop

                        //Increments numbers by 1 up to input entered
                        for (int numbers = 0; numbers < ((2 * groups) - 1); numbers++) {

                            System.out.print(groups); //prints out numbers

                        } //end of loop
                        System.out.println(); //prints out spaces between each group
                    } //end of loop

                    //Creates spacing for pyramid shape for dashes
                    for (int lines = 0; lines < (8 - groups); lines++) {
                        System.out.print(" "); //prints out spacing
                    } //end of loop

                    //Increments dashes by 1 up to input entered
                    for (int numbers = 0; numbers < ((2 * groups) - 1); numbers++) {
                        System.out.print("-"); //prints out dashes 
                    } //end of loop
                    System.out.println(""); //prints out space between groups
                } //end of loop 

            } //end of if statement
            else {
                System.out.println("You did not enter an interger between 1 and 9"); //prints out if input is not between 1 and 9 inclusive
            }//end of else statement

            //check for integers between 1 and 9 inclusive
            if (x >= 1 && x <= 9) {
                int groups = 1;
                int lines = 0;
                int spaces = 0;
                int numbers = 0;

                //Creates separates groups
                groups = 0;
                while (groups < x) {
                    groups++;

                    //Creates pattern for each line
                    lines = 0;
                    while (lines < groups) {
                        lines++;

                        //Creates spacing for pyramid shape for numbers
                        spaces = 0;
                        while (spaces < (9 - groups)) {
                            System.out.print(" "); //prints out spacing
                            spaces++;
                        } //end of loop

                        //Increments numbers by 1 up to input entered
                        numbers = 0;
                        while (numbers < ((2 * groups) - 1)) {

                            System.out.print(groups); //prints out numbers
                            numbers++;
                        } //end of loop 
                        System.out.println(); //prints out spaces between each group
                    } //end of loop 

                    //Creates spacing for pyramid shape for dashes
                    lines = 0;
                    while (lines < (9 - groups)) {
                        lines++;
                        System.out.print(" "); //prints out spacing

                    } //end of loop 

                    //Increments dashes by 1 up to input entered
                    numbers = 0;
                    while (numbers < ((2 * groups) - 1)) {
                        numbers++;
                        System.out.print("-"); //prints out dashes

                    } //end of loop 
                    System.out.println(""); //prints out space between groups   
                } //end of loop 
            } //end of if statement 
            else {
                System.out.println("You did not enter an interger between 1 and 9"); //prints out if input is not between 1 and 9 inclusive
            } //end of else statement 


            //check for integers between 1 and 9 inclusive
            if (x >= 1 && x <= 9) {
                int groups = 1;
                int lines = 0;
                int spaces = 0;
                int numbers = 0;

                //Creates separates groups
                groups = 1;
                do {

                    //Creates pattern for each line
                    lines = 0;
                    do {

                        //Creates spacing for pyramid shape for numbers
                        spaces = 0;
                        do {
                            System.out.print(" "); //prints out spacing
                            spaces++;
                        } while (spaces < (9 - groups)); //end of loop

                        //Increments numbers by 1 up to input entered
                        numbers = 0;
                        do {
                            System.out.print(groups); //prints out numbers
                            numbers++;
                        } while (numbers < ((2 * groups) - 1)); //end of loop 

                        System.out.println(); //prints out spaces between each group
                        lines++;

                    } while (lines < groups); //end of loop
                    //Creates spacing for pyramid shape for dashes
                    lines = 0;
                    do {
                        lines++;
                        System.out.print(" "); //prints out spacing

                    } while (lines < (9 - groups)); //end of loop 

                    //Increments dashes by 1 up to input entered
                    numbers = 0;
                    do {
                        numbers++;
                        System.out.print("-"); //prints out dashes
                    } while (numbers < ((2 * groups) - 1)); //end of loop 
                    System.out.println(""); //prints out space between groups
                    groups++;

                } while (groups < x + 1); //end of loop 

            } //end of if statement 
            else {
                System.out.println("You did not enter an interger between 1 and 9"); //prints out if input is not between 1 and 9 inclusive
            } //end of else statement

        } //end of main method
} //end of class