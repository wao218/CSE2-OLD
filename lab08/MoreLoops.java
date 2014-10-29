///////////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//lab08
//Root Program
//October 17, 2014
//CSE2
//
/*rewrite for loops as while loops, while loops as do-while loops, etc. 
Below is a program that uses various kinds of loops for various calculations. 
For the four sets of code, replace the code with code that rewrites the corresponding loops in some other form.*/

import java.util.Scanner;
public class MoreLoops {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        System.out.print("Enter an int- ");
        //while (!scan.hasNextInt()) {
        //    scan.next(); //get rid of the junk entered by user
        //    System.out.print("You did not enter an int; try again- ");
        //}
        
        do{
            if(scan.hasNextInt()){
                break;
            }
            else{
            scan.next();
            System.out.print("You did not enter an int; try again- ");
            }
        }while(!scan.hasNextInt()); 
        
        
        //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A 
        //DO-WHILE LOOP
       n = scan.nextInt();

        //for (int j = 0; j < n && j < 40; j++) {
        //    for (int k = 0; k < j + 1; k++) {
        //        System.out.print('*');
        //    }
        //    System.out.println();
        //}
        
        int j=0;
        int k;
        
        while(j < n && j < 40 ){
          k=0;  
            while(k < j + 1){
                System.out.print('*');
                k++;
            }
            k=0;
            System.out.println();
            j++;
        }
        
        
        
        //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH 
        //WHILE STATEMENTS 

         k = 4;

        //do {
        //    System.out.println("k=" + k);
        //    k++;
        //}
        //while (k < 4);
        
        System.out.println("k=" + k);
        while(k < 4) {
            System.out.println("k=" + k);
            k++;
        }
        
        
        
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
        //WITH A WHILE LOOP

        //int count = 0;
        //while (true) {
        //    switch (n) {
        //        default: System.out.println(n + " is > 5 or <1");
        //        break;
        //        case 1:
        //        case 2:
        //            System.out.print("Case 2 ");
        //            continue;
        //        case 3:
        //            break;
        //        case 4:
        //            System.out.println("Case 4");
        //        case 5:
        //            System.out.println("Case 5");
        //            break;
        //    }
        
        
        //    count++;
        //    if (count > 10)
        //        break;
        //}
        int count = 0;
        for(count=0; count < 11; count--) {
            //for(n = 0; n<6; n++){
                if (n<1 || n>5){
                    System.out.println(n + " is > 5 or <1");
                    break;
                }
                if (n==1 || n==2){
                   System.out.println("Case 2 ");
                   continue; 
                }
                if (n==3){
                    break;
                }
                if (n==4){
                   System.out.println("Case 4");
                   System.out.println("Case 5");
                   break;
                }
                if(n==5){
                    System.out.println("Case 5");
                    break;
                }
                if(count>10){
                break;
                }
            //}
        }
        
        
        
        
        //COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE UING
        // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
        //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G., 
        //   -5, 1, 20, 5, ETC.
        //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY 
        //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    }//End of main method
}//End of class