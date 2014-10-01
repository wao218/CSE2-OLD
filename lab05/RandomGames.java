//////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//lab05
//Random Games Program
//September 25, 2014
//CSE2
//
/*program that uses the Scanner class to obtain from the user
one of three choices for a game of chance: (1) Roulette; (2) Craps; or (3) Picking a
card from a deck of playing cards. */

//Import Scanner Class
    import java.util.Scanner;
    
//Define Class
public class RandomGames {
    
//Add Main Method
    public static void main(String[] args) {
        
        //Declare instance of the scanner in order to accept user input
        Scanner myScanner;
        
        //Call Scanner Constructor
        myScanner = new Scanner( System.in );
        
        //Prompt user to enter Strings “R” , “r”,“C”, “c”, “P”, “p” to pick game.
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
        String input = myScanner.next(); //identifies string
        int roulette= (int)(Math.random()*38);//displays random number for roulette game #'s 00-36
        int craps1= (int)(Math.random()*6+1);//random number for first dice roll #'s 1-6 
        int craps2= (int)(Math.random()*6+1);//random number for second dice roll #'s 1-6
        int crapsTotal=(int)(craps1+craps2);//Sum total of dice rolls 
        int cardPick= (int)(Math.random()*13+1);//random number for card selection #'s 1-13
        int suit= (int)(Math.random()*4+1);//random number for suti selection #'s 1-4
        
        //Checks to ensure input is of length 1 
        switch(input.length()) {
            case 1:
                
                //Check game selection
                switch(input) {
                
                //plays roulette game
                case "R":
                case "r": 
                    switch(roulette){
                        case 37: //When the output is 37 display 00
                            System.out.println("Roulette: 00");
                                break;//move on to next case
                        default: //All other outputs display numbers 0-36   
                            System.out.println("Roulette: "+roulette);
                                break; //move on to next case   
                }//end of switch statement
                    break;//move on to next case
                
                //Plays craps game
                case "C": 
                case "c":
                        System.out.println("Craps: "+craps1+" + "+craps2+"= "+crapsTotal); //displays both numbers for rolls and dispalays sum
                                break; //move on to next case
                
                //Plays game for random card selection 
                case "P":
                case "p":    
                    switch(cardPick) {
                        case 1: //If 1 is drawn displays Ace of Clubs, Spades, Diamonds, or Hearts 
                            switch(suit){
                                case 1:
                                    System.out.println("Ace of Clubs");
                                    break; //move on to next case 
                                case 2:
                                    System.out.println("Ace of Spades");
                                    break; //move on to next case 
                                case 3:
                                    System.out.println("Ace of Diamonds");
                                    break; //move on to next case 
                                case 4:
                                    System.out.println("Ace of Hearts");
                                    break; //move on to next case 
                            }//End of switch statement
                                break; //move on to next case 
                        case 11: //If 11 is drawn displays Jack of Clubs, Spades, Diamonds, or Hearts 
                            switch(suit){
                                case 1:
                                    System.out.println("Jack of Clubs");
                                    break; //move on to next case 
                                case 2:
                                    System.out.println("Jack of Spades");
                                    break; //move on to next case 
                                case 3:
                                    System.out.println("Jack of Diamonds");
                                    break; //move on to next case 
                                case 4:
                                    System.out.println("Jack of Hearts");
                                    break; //move on to next case 
                            }//End of switch statement
                                break; //move on to next case 
                        case 12://If 12 is drawn displays Queen of Clubs, Spades, Diamonds, or Hearts 
                            switch(suit){
                                case 1:
                                    System.out.println("Queen of Clubs");
                                    break; //move on to next case 
                                case 2:
                                    System.out.println("Queen of Spades");
                                    break; //move on to next case 
                                case 3:
                                    System.out.println("Queen of Diamonds");
                                    break; //move on to next case 
                                case 4:
                                    System.out.println("Queen of Hearts");
                                    break; //move on to next case 
                            }//End of switch statement
                                break; //move on to next case 
                        case 13: //If 13 is drawn displays King of Clubs, Spades, Diamonds, or Hearts 
                            switch(suit){
                                case 1:
                                    System.out.println("King of Clubs");
                                    break; //move on to next case 
                                case 2:
                                    System.out.println("King of Spades");
                                    break; //move on to next case 
                                case 3:
                                    System.out.println("King of Diamonds");
                                    break; //move on to next case 
                                case 4:
                                    System.out.println("King of Hearts");
                                    break; //move on to next case 
                            }//End of switch statement
                                break; //move on to next case   
                            default: //All other numbers displays cared number and suit
                                switch(suit){
                                  case 1:
                                    System.out.println(cardPick+" of Clubs");
                                    break; //move on to next case 
                                case 2:
                                    System.out.println(cardPick+" of Spades");
                                    break; //move on to next case 
                                case 3:
                                    System.out.println(cardPick+" of Diamonds");
                                    break; //move on to next case 
                                case 4:
                                    System.out.println(cardPick+" of Hearts");
                                    break; //move on to next case 
                            }//end of switch statement
                                    break; //move on to next case 
                }//end of switch statement
                    break; //move on to next case 
                            default: //Displays if user uses incorrect input 
                                    System.out.println(input+" is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
                                break; //move on to next case 
                }//end of switch statement
                    break; //move on to next case 
            default: //Displays if user uses more than one character
                System.out.println("A single character is expected");
                    break; //move on to next case 
        }//End of switch statement 
    }//End of Method
}//End of Class