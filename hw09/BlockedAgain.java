///////////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw09
//BlockedAgain Program
//November 3, 2014
//CSE2
//
/* 
First, add the method getInt(), which, when called in the main method, will request input from the user 
and solve [problem A] by calling methods checkInt() and checkRange().  
getInt() continues to request input from the user until acceptable input is provided.  
Next, add the method checkint(), which, when called by getInt(), will accept inputs of your choice 
and test whether the user’s input is an integer (hint: use a scanner method), solving [problem A1].  
Finally, implement the method checkRange(), which, when called by getInt(), will accept inputs of your choice 
and test whether the user’s input is within range 1-9 inclusive, solving [problem A2]. 
We suggest checkInt() return boolean and checkRange return type int.
Now that acceptable input has been gathered, it is time to solve [problem B] and its subproblems.  
First, implement the method allBlocks(int x), which, as seen in the main method, will accept the integer generated 
by getInt() and solve [problem B] by calling a method called block().  
Next, implement the method block(), which, when called in allBlocks(), will accept input variables of your choice 
and solve [problem B1] by calling a method called line().  Finally, implement the method line(), which will 
accept input variables of your choice from block() and solve [problem B1a].
*/

import java.util.Scanner;
public class BlockedAgain {
    
    public static int getInt(){
        int x;//variable 
        int y;//variable 
            System.out.print("Enter an integer between 1 and 9, inclusive: ");//asks user to enter an int between 1 and 9 inclusive 
            x = checkInt(); //input from user
            y = checkRange(x);//calls checkRange method to ensure user input is within 1 and 9 inclusive 
            return y;//return user input
    }//end of getInt method 
    
    public static int checkInt(){
        //Declare instance of scanner to accpet user input
            Scanner input;
            //Call Scanner Constructor
            input = new Scanner(System.in);
        //check to make sure user input is an integer     
        while (!input.hasNextInt()){
            System.out.println("You did not enter an int in [1,9]; try again: "); //prints out if input is not between 1 and 9 inclusive
            input.next();
        }//end of if statement
        return input.nextInt();
    }//end of checkInt method
    
    public static int checkRange(int j){
        
        int number=j; //variable 
        
        //checks to make sure user input is whithin the range of 1 and 9 inclusive
        while (!(number >= 1 && number <= 9)){
            System.out.println("You did not enter an int in [1,9]; try again: "); //prints out if input is not between 1 and 9 inclusive
            number=checkInt();
        }//end of if statement
        return number;
        
    }//end of checkRange method
    
    public static void allBlocks(int x){
        block(x);
    }//end of allBlocks method
    
    public static void block(int input){
        
        //creates block style 
        for (int groups = 1; groups < input + 1; groups++) {
            line(groups);
        }
            

    }//end of block method
    
    public static void line(int newInput){
                     //Creats pattern for each line
                    for (int lines = 0; lines < newInput; lines++) {

                        //Creates spacing for pyramid shape for numbers
                        for (int spaces = 0; spaces < (9 - newInput); spaces++) {
                            System.out.print(" "); //prints out spacing
                        } //end of loop

                        //Increments numbers by 1 up to input entered
                        for (int numbers = 0; numbers < ((2 * newInput) - 1); numbers++) {

                            System.out.print(newInput); //prints out numbers

                        } //end of loop
                        System.out.println(); //prints out spaces between each group
                    } //end of loop

                    //Creates spacing for pyramid shape for dashes
                    for (int lines = 0; lines < (9 - newInput); lines++) {
                        System.out.print(" "); //prints out spacing
                    } //end of loop

                    //Increments dashes by 1 up to input entered
                    for (int numbers = 0; numbers < ((2 * newInput) - 1); numbers++) {
                        System.out.print("-"); //prints out dashes 
                    } //end of loop
                    System.out.println(""); //prints out space between groups
                } //end of method
        
    
    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }//end of main method
}//end of class