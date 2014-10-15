//////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw04
//Roulette Program
//October 14, 2014
//CSE2
//
/*Program that runs a roulette game 1000 times, records the number of wins,
records the number of loses, and calculates the total winnings.*/

//Define Class
public class Roulette {

    //Add main method
    public static void main(String[] args) {

            //Variables 
            int spin = 0;
            int spin2 = 0;
            int PickedNumber = (int)(Math.random() * 38);
            int earnings = 0;
            int win = 0;
            int lose = 0;
            System.out.println(PickedNumber); //print out random selected number 

            //Runs the program 10000 times
            while (spin < 1000) {

                //resets spins back to zero
                if (spin2 == 100) {
                    spin2 = 0;
                } //end of if statement

                //Runs the program 100 times
                while (spin2 < 100) {
                    int roulette = (int)(Math.random() * 38); //random number for roulette
                    spin2++; //increase the count of spins by one

                    //check for case 37 to print 00, if not print out other numbers
                    switch (roulette) {
                        case 37: //When the output is 37 display 00
                            System.out.print(" " + "00" + " ");
                            break; //move on to next case
                        default: //All other outputs display numbers 0-36   
                            System.out.print(" " + roulette + " ");
                            break; //move on to next case   
                    } //end of switch

                    //Number of wins counted
                    if (PickedNumber == roulette) {
                        win++;
                    } //end of switch statement
                } //end of loop
                spin++; //increase spins by increment of one
            } //end of loop
            System.out.println(" ");
            System.out.println("Number of losses: " + (100000 - win) + " out of 100000"); //print out number of losses
            System.out.println("Number of wins: " + win + " out of 100000"); // print out number of wins
            System.out.println("Your total earnings: $" + ((win * 36) - 100000)); // print out total earnings
        } //End of main method
} //End of class