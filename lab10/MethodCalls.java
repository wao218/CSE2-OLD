///////////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//lab10
//MethodCalls Program
//October 31, 2014
//CSE2
//
/*Below is a Java class whose main program calls two different methods, addDigit() and join(). 
Under the class is a comment that shows the expected output when the program is run. 
The call addDigit(number,digit) expects that ‘digit’ is an int between 0 and 9, inclusive, 
and it returns an int whose value is  ‘number’ with digit preceding it.  
If digit is not between 0 and 9, then addDigit() should simply return number. 
The method join() returns an int whose value consists of the values of the two input parameters “pasted together.” 
The code for join() should be written so that it calls addDigit() to do (part of) its work.*/


public class MethodCalls{
    
    //to add the numbers together (3x1000)+784 etc.
    
    public static int addDigit(int number, int digit){
       while(number> digit*10){
           digit=digit+number;
       }
        return;
    }
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        /*c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));*/
    }//end of main method
}//end of class