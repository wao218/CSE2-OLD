///////////////////////////////////////////////////////
//Wesley Osborne
//lab02
//Cylcometer Java Program
//September 9, 2014
//CSE2
//
/*My bicycle cyclometer records two kinds of data, the time elapsed in seconds, and the
number of rotations of the front wheel during that time. For two trips, given time and rotation
count, my program should: a) print the number of minutes for each trip. b) print the number of counts
for each trip. c) print the distance of each trip in miles. d) print the distances of the two trips 
combined */

// Define a class

public class Cyclometer {

//add main method
    public static void main(String[] args) {

//our input data
    int secsTrip1=480; //time of first trip
    int secsTrip2=3220; //time of second trip
    int countsTrip1=1561; //number of rotation count of front wheel during first trip
    int countsTrip2=9037; //number of rotation count of front wheel during second trip
    
//our intermediate variables and output data
    double wheelDiameter=27.0, //the diameter of the wheel
    PI=3.14159, //value for PI
    feetPerMile=5280, //number of feet in a mile
    inchesPerFoot=12, //number of inches in a foot
    secondsPerMinute=60; //number of seconds in a minute
    double distanceTrip1, distanceTrip2,totalDistance; //total distance of trip 
    
//Print out numbers stored in variables that store number of seconds and counts
    System.out.println ("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "
    +countsTrip1+" counts.");
    System.out.println ("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minuts and had "
    +countsTrip2+" counts.");
    
//Run the calculations; store the values 
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    //above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    
//Print out the output data
    System.out.println ("Trip 1 was "+distanceTrip1+" miles");
    System.out.println ("Trip 2 was "+distanceTrip2+" miles");
    System.out.println ("The total distance was "+totalDistance+" miles");
    } //end of main method
} //end of class
