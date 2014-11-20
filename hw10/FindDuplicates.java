///////////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw10
//FindDuplicates Program
//November 17, 2014
//CSE2
//
/*The method hasDups() should return true if and only if the input array has at least one repeated entry. 
The method exactlyOneDup() returns true if and only if there is exactly one repeated entry 
(for example, exactlyOneDup() is true for {2, 7, 2}, false for {2, 2, 2, 3, 4} and false for { 2, 2, 3, 3})*/

import java.util.Scanner;//import scanner

//define class
public class FindDuplicates{
    
    //main method
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }//end of main method

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }//end of listArray method
  
  public static boolean hasDups(int[]duplicate){
      for(int y = 0; y < duplicate.length; y++){
          for(int x = y + 1; x < duplicate.length; x++){
              if(duplicate[y]== duplicate[x]){
                  return true;
              }//end of if statement
          }//end of loop
      }//end of loop
        return false;
  }//end of hasDups method

  
  public static boolean exactlyOneDup(int[]duplicate2){
      int y = 0;
      int x = 0;
      int z =0;
      for(y = 0; y < duplicate2.length; y++){
          for(x = y + 1; x < duplicate2.length; x++){
              //for(int z = 0; z < 1; ){
              if(duplicate2[y]== duplicate2[x]){
                  z++;
                 
              }//end of if statement
              
               if(z > 1){
                      return false;
                  }//end of if statement
            }//end of loop 
            x = y + 1;
      }//end of loop
      if (z == 0){
          return false;
      }//end of if statement
      return true;
  }//end of exactlyOneDup method
  
  

}//end of class 

