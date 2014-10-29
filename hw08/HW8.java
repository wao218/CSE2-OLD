///////////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw08
//HW8 Program
//October 26, 2014
//CSE2
//
/*program below I call on three different overloaded versions of getInput(). 
(Overloaded methods are two or more methods that have the same name but that take different numbers or types of parameters). 
You should add the definitions of the methods so that the program would produce the output (for the corresponding input) shown below the program. 
Calls like getInput(scan,”dEf”) should force the user to enter a string from the keyboard that is exactly one character long and that is one of the characters in the string “dEf”, 
and it should return the character entered. 
Calls like getInput(scan,”abc”,7) should try to force the user to enter a string that consists of exactly one character and is one of the characters in the string “abc”, 
and it should return the character entered, but it should give up and return the character ‘ ‘ if the user fails to enter one of the required characters after 7 attempts. 
Calls like getInput(scan,”Prompt: “,”059”) should use the string “Prompt: “, 
should force the user to enter a string with exactly one character that is one of the characters in the string “059”, and should return the character entered.  
The phrase “force the user” means that the program should repeatedly prompt the user until the user enters the correct input.*/






import java.util.Scanner;
public class HW8 {
    
    public static char getInput(Scanner scan, String compareTo) {
            //makes loop infinite
            while (true) {
                String x = scan.next();//declares x for input
                
                //checks to make sure input is of length one
                while (x.length() > 1) {
                    System.out.println("You should enter exactly one character: ");// asks user to enter one character 
                    x = scan.next();//user input 
                } //end of loop 
                
                /*checks the first character of the string first, 
                then increments the counter to checks the following characters in string, 
                if not correct then prompts user to enter new input.*/
                for (int counter = 0; counter < compareTo.length(); counter++) {
                    char a = x.charAt(0);
                    if (a == compareTo.charAt(counter)) {
                        return a;
                    } //end of if statement 

                } //end of loop 
                System.out.println("You did not enter a character from the list " + compareTo + " try again: ");//asks user to enter new input
            } //end of loop 
        } //end of getIntput #1

    public static char getInput(Scanner scan, String attemptsTo, int numberOfTries) {
            String x = scan.next();//declares x as input 
            
            //checks for the number of incorrect tries, then cancels when limit is reached
            for (int counter2 = 1; counter2 < numberOfTries; counter2++) {
                
                /*checks the first character of the string first, 
                then increments the counter to checks the following characters in string, 
                if not correct then prompts user to enter new input.*/
                for (int counter = 0; counter < attemptsTo.length(); counter++) {

                    char a = x.charAt(0);
                    if (a == attemptsTo.charAt(counter)) {
                        return a;
                    } //end of if statement 

                } //end of loop
                System.out.println("You did not enter a character from the list " + attemptsTo + " try again: ");//asks user to enter new input
                x = scan.next();//user input 

            } //end of loop 
            System.out.println("You failed after " + numberOfTries + " times");//tells user they failed
            return ' ';//returns above println statement 

        } //end of getInput #2
    public static char getInput(Scanner scan, String choose, String numbers) {
            
            //makes loop infinite 
            while (true) {
                System.out.println(choose);//prints out "enter a digit"
                System.out.print("Enter one of: " + numbers + " : ");//prints out numbers to enter 
                String x = scan.next();//declares x as input 
                
                //checks to make sure input is of length one 
                while (x.length() > 1) {
                    System.out.println("Enter exactly one character: ");
                    System.out.println(choose);
                    System.out.print("Enter one of: " + numbers + " : ");
                    x = scan.next();
                } //end of loop 
                
                /*checks the first character of the string first, 
                then increments the counter to checks the following characters in string, 
                if not correct then prompts user to enter new input.*/
                for (int counter = 0; counter < numbers.length(); counter++) {
                    char a = x.charAt(0);
                    if (a == numbers.charAt(counter)) {
                        return a;
                    } //end of if statement 

                } //end of loop 
                System.out.println("You did not enter an acceptable character");//prints out if input is not correct 
            } //end of loop 
        } //end of getInput #3
        
    public static void main(String[] arg) {
        char input;//character 
        Scanner scan = new Scanner(System.in);//declares scanner 
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");//prompts user to enter C or c
        input = getInput(scan, "Cc");//user input, calls get input method 
        System.out.println("You entered '" + input + "'");//prints out input 
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");//prompts user to enter y, Y, n, or N 
        input = getInput(scan, "yYnN", 5); //give up after 5 attempts, user input, calls get input method 
        
        //if user does not fail, prints out input 
        if (input != ' ') {
            System.out.println("You entered '" + input + "'");//prints out user input 
        }
        input = getInput(scan, "Choose a digit.", "0123456789");//user input, calls get input method 
        System.out.println("You entered '" + input + "'");//prints out user input
    }//end of main method
}//end of class 
