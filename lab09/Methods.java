///////////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//lab09
//Methods Program
//October 24, 2014
//CSE2
//
/*a program that asks for three inputs, tells which of is largest out of the inputs,
and whether they are in accending order or not.*/

import java.util.Scanner;
public class Methods{
    public static int getInt(Scanner scan){
        
        System.out.println("Enter an int: ");
        while(!scan.hasNextInt()){
               
           
                System.out.println("You did not enter an int, try again: ");
        scan.next();
        }//end of loop
        int number= scan.nextInt();
       return number;
        
    }//end of getInt method
    public static boolean ascending(int a, int b, int c){
        if(a<b&&b<c){
            return true;
        }//end of if statement
        else{
            return false;
        }//end of else statement
    }//end of ascending method
    
    public static int larger(int a, int b){
        if(a>b){
            return a;
        }//end of if statement
        else{
            return b;
        }//end of else statement
    }//end of larger method
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }
}