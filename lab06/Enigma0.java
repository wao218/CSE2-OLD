////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//Lab06
//October 10, 2014
//CSE2
//Fix the bugs in the program


/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String[] args ){
        Scanner scan=new Scanner(System.in);
      int n;
       System.out.print("Enter an int- ");
    if(scan.hasNextInt()){
        n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 On line 18, There was a syntax error in creating the main method.
 On line 30, the variable n was not initialized.
 *   Explain the error(s) that occurred here, and then fix them
 */

