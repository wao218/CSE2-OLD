///////////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//lab11
//Arrays Program
//November 11, 2014
//CSE2
//
/*a program that performs the following tasks:
Create an array that can hold 10 ints
Ask the user enter 10 ints and store them in the array
Search the array for the highest entry and print it out
Search the array for the lowest entry and print it out
Sum the ints in the array and print out the sum
Copy the contents of the array into a second array in reverse order 
Print the contents of the two arrays in two columns, side by side.*/

//import scanner
import java.util.Scanner;

//define class
public class Arrays {
    
    //add main method 
    public static void main (String[] args){
        
        //declare array
        int[] numbers;
        numbers = new int[10];
        
        //declare scanner
        Scanner input;
        
        //construct scanner
        input = new Scanner(System.in);
        
        System.out.println("Enter 10 integers: ");
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int g = input.nextInt();
        int h = input.nextInt();
        int i = input.nextInt();
        int j = input.nextInt();
        
        numbers[0] = a;
        numbers[1] = b;
        numbers[2] = c;
        numbers[3] = d;
        numbers[4] = e;
        numbers[5] = f;
        numbers[6] = g;
        numbers[7] = h;
        numbers[8] = i;
        numbers[9] = j;
        
        int highNumber = numbers[0];
        int lowNumber = numbers[0];
        int sumOfNumbers = 0;
        
        for(int x= 0; x < 10 ; x++){
            if(numbers[x] < lowNumber){
                lowNumber = numbers[x];
            }
            if(numbers[x] > highNumber){
                highNumber = numbers[x];
            }
            sumOfNumbers += numbers[x];
        }
        
        System.out.println("Lowest entry is: " + lowNumber);
        System.out.println("Highest entry is: " + highNumber);
        System.out.println("The sum is: " + sumOfNumbers);
        
       
        int entries = numbers.length - 1;
        
        for(int y = 0; y < 10; y++){
            
            System.out.print(numbers[y]+" " );
            
            if(entries >= 0){
            
                System.out.print(numbers[entries]);
                entries--;
            }
            
            System.out.println();
        }
        
    }//end of main method
}//end of class
