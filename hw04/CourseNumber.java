//////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw04
//Month Program
//September 22, 2014
//CSE2
//
/*program that reads in a 6 digit number, that adheres to 
a course offered at Lehigh given by a 6 digit number. 
The first four digits give the year, and the last two digits 
give the semester: 10 spring, 20 summer 1, 30 summer 2, and 40 fall, 
and then prints out the semester and year. */

//Import Scanner Class
    import java.util.Scanner;

//Define Class
public class CourseNumber {
    //Add Main Method
    public static void main(String[] args) {
        //Declare Instance of the Scanner in order to accept user input
        Scanner myScanner;
        
        //Call Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Prompt user to enter number for course 
        System.out.print("Enter a six digit number giving the course semester: ");
        boolean courseNumber = myScanner.hasNextInt();
        
        if(courseNumber) {
            int number = myScanner.nextInt();
            if (number >=186510 && number <= 201440) {
                
                if (number % 100 == 10) {
                    System.out.println ("The course was offered in the spring semester of " + number %1000000/100);
                }//End of if Statment 
                
                if (number % 100 == 20) {
                    System.out.println("The course was offered in the summer 1 semester of " + number %1000000/100);
                }//End of if Statement 
                
                if (number % 100 == 30) {
                    System.out.println("The course was offered in the summer 2 semester of " + number %1000000/100);
                }//End of if Statement 
                
                if (number % 100 == 40) {
                    System.out.println("The course was offered in the fall semester of " + number %1000000/100);
                }//End of if Statement
                
                if((number % 100 <10) || ((number % 100 >10) && (number % 100 < 20)) || ((number % 100 >20) && (number % 100 < 30)) || ((number % 100 >30) && (number % 100 < 40)) || (number % 100 > 40)) {
                    System.out.println( number %100 + "is not a legitimate semester" );
                }//End of if Statement
        
            }//End of if Statement 
            else {
                System.out.println ("The number was outside the range [186510,201440]");
            }//End of else Statement
                
        }//End of if Statement
            else {
                System.out.println("You did not enter an integer");
            }//End of else statement 
            
    }//End of Main Method
    
}//End of Class
        
        
        
        