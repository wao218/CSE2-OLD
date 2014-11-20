///////////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//lab11
//Arrays Program
//November 14, 2014
//CSE2
//
/*The method equals() should take two arrays of integers as input and return true if and only if 
the two arrays are of the same length and have the same values in the same locations. 
The method addArrays() should take two arrays of integers as input and return a new array of 
integers whose entries are the sum of the entries at the corresponding 
indices of the input arrays (i.e. result[2] = array1[2] + array2[2]). 
If the two arrays are of different length, then your method should assume that there 0’s 
are implied at the end of the shorter array.*/


public class ArrayMath{
    
    public static boolean equals(double[] x, double[] y){
        
        if(!(x.lenth = y.lenth){
            System.out.println("The Arrays are not of the same length");
            return false;
        }
        else{
            for(int z = 0; x[z] = y[z]; z++){
             return true;   
            }
        }
    }
    
    public static int[] addArrays(double [] x, double [] y){
        
    }
    
    
    
    
    
    
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
}
