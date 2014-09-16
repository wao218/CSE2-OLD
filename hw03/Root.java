////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//Root Java Program
//September 14, 2014
//CSE2
//
/*program that prompts the user to enter a double and 
then prints out a crude estimate of the cube root of 
the number and the value of this crude guess when cubed.*/

//Import Scanner Class
    import java.util.Scanner;
    
//Define Class 
public class Root {
    
//Add main method 
    public static void main(String[] args) {
        
        //Declare instance of the scanner in order to accpt input
        Scanner myScanner;
        
        //Call scanner constructor
        myScanner = new Scanner( System.in );
        
        //Prompt user to enter guess
        System.out.print("Enter a double and I print out its cube root : ");
        
        //Accept user input for guess
        double x = myScanner.nextDouble();
        
        //Variables for guesses 
        double guess1= x/3;
        double guess2= ((guess1*guess1*guess1+x)/(3*guess1*guess1));
        double guess3= ((2*guess2*guess2*guess2+x)/(3*guess2*guess2));
        double guess4= ((2*guess3*guess3*guess3+x)/(3*guess3*guess3));
        double guess5= ((2*guess4*guess4*guess4+x)/(3*guess4*guess4));
        double guess6= ((2*guess5*guess5*guess5+x)/(3*guess5*guess5));
        
        //Print out value of root
        System.out.println ("The cube root is : "+ guess6);
    } //end of main method 
    
} //end of class
