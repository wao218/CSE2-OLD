//////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw05
//Boola Boola Program
//September 25, 2014
//CSE2
//
/*Program that has three boolean variables to each of which the value of true or false is randomly assigned. 
Then, at random, combine the three variables with random choices of && and || and stores the result.  */

//Import Scanner Class
    import java.util.Scanner;
    
//Define Class
public class BoolaBoola {
    //Add Main Method
    public static void main(String[] args) {
       
        //Declare instance of the scanner in order to accept user input
        Scanner myScanner;
        
        //Call Scanner Constructor
        myScanner = new Scanner( System.in );
       
        //Variables
        boolean value1 = false; 
        boolean value2 = false;
        boolean value3 = false;
        boolean answer = false;
        int arbitrary1 = (int)(Math.random()*2);
        int arbitrary2 = (int)(Math.random()*2);
        int arbitrary3 = (int)(Math.random()*2);
        int arbitrary4 = (int)(Math.random()*2);
        int arbitrary5 = (int)(Math.random()*2);
        int arbitrary6 = (int)(Math.random()*2);
        
        //Initialized strings
        String b = "Print";
        String c;
        String solution;
        
        //Picks random number if 0 false if 1 true
        switch(arbitrary1) {
            case 0: value1 = false;
            break;//move on to next case
            case 1: value1 = true;
        }//End of Switch Statement
        
         //Picks random number if 0 false if 1 true
        switch(arbitrary2) {
            case 0: value2 = false;
            break;//move on to next case
            case 1: value2 = true;
            break;//move on to next case
        }//End of Switch Statement
        
         //Picks random number if 0 false if 1 true
        switch(arbitrary3) {
            case 0: value3 = false;
            break;//move on to next case
            case 1: value3 = false;
            break;//move on to next case
        }//End of Switch Statement
        
         //Set &&'s and ||'s and make questions from those statements
        switch (arbitrary4) {
            case 0:
            solution = new String("||");
            switch(arbitrary5) {
                case 0:
                     c = ("||");
                     b = ("Does "+ value1 + " " + solution + " " + value2 + " " + c + value3 + " have the value true(t/T) or false(f/F)?: " );
                     answer = value1 || value2 || value3;
                break;//move on to next case
                case 1:
                    c = ("||");
                    b = ("Does "+ value1 + " " + solution + " " + value2 + " " + c + value3 + " have the value true(t/T) or false(f/F)?: " );
                    answer = value1 || value2 && value3;
                break;//move on to next case
            }//End of Switch Statement 
            break;//move on to next case
            
            case 1: 
                 solution = ("&&");
                 b = ("Does "+ value1 + " " + solution + " " + value2 + " " + solution + value3 + " have the value true(t/T) or false(f/F)?: " );
                 answer = value1 && value2 && value3;
                 break;//move on to next case
        }//End of Switch Statement
        
        //Checks for Correct or Wrong result
        System.out.print(b);
        boolean result;
        
        if (myScanner.next().equals("true")) {
            result = true;
        }//End of if Statement
        else {
            result = false;
        }//End of else statement
        if (result = answer) {
            System.out.println ("Correct");
        }//End of if Statement
        else {
            System.out.println("Wrong: try again");
        }//End of else Statement
    }//End of Main Method
}//End of Class
