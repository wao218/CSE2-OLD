////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//Root Java Program
//September 14, 2014
//CSE2
//
/*a program that prompts the user to enter a double and 
then prints out the first four digits to the right of the decimal point.*/

//Import Scanner Class
    import java.util.Scanner;
    
//Define class
public class FourDigits {

//Add main method
    public static void main(String[] args) {
        
         //Declare instance of the scanner in order to accpt input
        Scanner myScanner;
        
        //Call scanner constructor
        myScanner = new Scanner( System.in );
        
        //Prompt user to enter a number
        System.out.print("Enter a double and I display the four digits to the right of the decimal point : ");
        
        //Accept user input for number
        double nNumber = myScanner.nextDouble();
        
        //Variable for number
        int number = ((int) (nNumber*10000)%10000);
        
        //Print out last four digits to the right of the decimal
        System.out.println ("The four digits are "+ number);
        
    } //end of main method
} //end of class