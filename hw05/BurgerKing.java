//////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw05
//Burger King Program
//September 25, 2014
//CSE2
//
/*program that prompts the user 
to enter a choice of a burger, a soda, or fries. 
Then the program prompts the users for details of their choices. */

//Import Scanner Class
    import java.util.Scanner;
    
//Define Class
public class BurgerKing {
    
//Add Main Method
    public static void main(String[] args) {
        
        //Declare instance of the scanner in order to accept user input
        Scanner myScanner;
        
        //Call Scanner Constructor
        myScanner = new Scanner( System.in );
        
        //Prompt user to enter Strings “B” , “B”,“S”, “s”, “F”, “f” to pick food item.
        System.out.print("Enter a letter to indicate a choice of Burger (B or b) Soda (S or s) Fries (F or f): ");
        String input = myScanner.next(); //identifies string
        
        //check to make sure length is one character
        switch (input.length()) {
            case 1:
                switch (input) {
                    case "B": //input for order for burger
                    case "b":
                        System.out.print("Enter A or a for 'all the fixins', C or c for cheese, N or n for none of the above");//ask user for cheese or all the toppings
                        String input2 = myScanner.next();
                        
                        //check to make sure length is one character
                        switch(input2.length()) {
                            case 1:
                                switch (input2) {
                                  case "A"://input for order with all the fixins
                                  case "a":
                                      System.out.println("You ordered a burger with all the fixins");//Print out burger with all the fixins
                                      break;//move on to next case
                                  case "C"://input for order with cheese
                                  case "c":
                                      System.out.println("You ordered a burger with cheese");//Print out burger with cheese
                                      break;//move on to next case
                                  case "N"://input for order without toppings
                                  case "n":
                                      System.out.println("You ordered a burger");//Print out burger with nothing 
                                    break;//move on to next case
                                default: System.out.println("You did not enter any of A, a, C, c, N, or n"); //Print out if incorrect input is entered
                                    break;  //move on to next case
                                }//End of Switch Statement
                             break;//move on to next case
                        default: System.out.println("A single character is expected");//Print out if input is longer than one character
                            break; //move on to next case       
                        }//End of Switch Statement
                            break;//move on to next case
                    case "S"://input for order for soda
                    case "s":
                        System.out.print("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)");//Ask user for type of soda
                        String input3 = myScanner.next();
                        
                        //check to make sure length is one character
                        switch(input3.length()) {
                            case 1:
                                switch(input3) {
                                    case "P"://input for pepsi
                                    case "p":
                                        System.out.print("You ordered a Pepsi");//print out of order
                                        break;//move on to next case
                                    case "C"://input for coke
                                    case "c":
                                        System.out.print("You ordered a Coke");//print out of order
                                        break;//move on to next case
                                    case "S"://input for sprite
                                    case "s":
                                        System.out.print("You ordered a Sprite");//print out of order
                                        break;//move on to next case
                                    case "M"://input for moutain dew
                                    case "m":
                                        System.out.print("You ordered a Mountain Dew");//print out of order
                                        break;   //move on to next case
                                default: System.out.println("You did not enter any of P, p, C, c, S, s, M, or m");//Print out if incorrect input is entered
                                    break;  //move on to next case    
                                }//End of switch statement
                                 break;//move on to next case
                        default: System.out.println("A single character is expected");//Print out if input is longer than one character
                            break;  //move on to next case
                        }//End of Switch Statement
                            break;//move on to next case
                    case "F"://input for order of fries 
                    case "f":
                        System.out.print("Do you want a large or small order of fries (l,L,s, or S)");//ask user for size of fries
                        String input4 = myScanner.next();
                        
                        //check to make sure length is one character
                        switch(input4.length()) {
                            case 1:
                                switch(input4) {
                                    case "L"://input for large fries
                                    case "l":
                                        System.out.println("You ordered large fries");
                                        break;
                                    case "S"://input for small fries
                                    case "s":
                                        System.out.println("You ordered small fries");
                                        break;//move on to next case
                                    default: System.out.println("You did not enter any of S, s, L, or l");//Print out if incorrect input is entered
                                    break; //move on to next case
                                }//End of Switch Statement
                                break;//move on to next case
                        default: System.out.println("A single character is expected");//Print out if input is longer than one character
                                break;  //move on to next case 
                        }//End of Switch Statement
                                break;//move on to next case 
        default: //Displays if user uses incorrect input 
                 System.out.println("You did not enter any of B, b, S, s, F, or f");//Print out if incorrect input is entered
                }//End of Switch Statement
            break; //move on to next case 
        default: System.out.println("A single character is expected");//Print out if input is longer than one character
            break;  //move on to next case   
        }//End of Switch Statement
    }//End of main method
}//End of class    