///////////////////////////////////////////////////////////////////////////////////////////////////////
//Wesley Osborne
//hw10
//PokerOdds Program
//November 17, 2014
//CSE2
//
/*The method showOneHand() should generate random poker hands, 
prompting the user if they would like another hand to be generated (it will repeat as long the user desires). 
The method simulateOdds() should randomly generate 10000 hands and 
count the number of times that a hand with a pair of a specific rank occurs, 
along with the number of hands that do not have a pair.*/

import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {
            showHands();
            simulateOdds();
        } //end of main method

    public static void showHands() {

            Scanner scan = new Scanner(System.in);
            String answer = "";



            do {
                String[] draw = new String[5];
                String[] deck = new String[52];
                deck[0] = "A";
                deck[1] = "K";
                deck[2] = "Q";
                deck[3] = "J";
                deck[4] = "10";
                deck[5] = "9";
                deck[6] = "8";
                deck[7] = "7";
                deck[8] = "6";
                deck[9] = "5";
                deck[10] = "4";
                deck[11] = "3";
                deck[12] = "2";
                deck[13] = "A";
                deck[14] = "K";
                deck[15] = "Q";
                deck[16] = "J";
                deck[17] = "10";
                deck[18] = "9";
                deck[19] = "8";
                deck[20] = "7";
                deck[21] = "6";
                deck[22] = "5";
                deck[23] = "4";
                deck[24] = "3";
                deck[25] = "2";
                deck[26] = "A";
                deck[27] = "K";
                deck[28] = "Q";
                deck[29] = "J";
                deck[30] = "10";
                deck[31] = "9";
                deck[32] = "8";
                deck[33] = "7";
                deck[34] = "6";
                deck[35] = "5";
                deck[36] = "4";
                deck[37] = "3";
                deck[38] = "2";
                deck[39] = "A";
                deck[40] = "K";
                deck[41] = "Q";
                deck[42] = "J";
                deck[43] = "10";
                deck[44] = "9";
                deck[45] = "8";
                deck[46] = "7";
                deck[47] = "6";
                deck[48] = "5";
                deck[49] = "4";
                deck[50] = "3";
                deck[51] = "2";
                String one = "Clubs";
                String two = "Diamonds";
                String three = "Hearts";
                String four = "Spades";
                for (int x = 0; x < 5; x++) {
                    int status = 0;
                    do {
                        int RandomNumber = (int)(Math.random() * 52);
                        if (deck[RandomNumber] != "-1") {
                            draw[x] = deck[RandomNumber];
                            deck[RandomNumber] = "-1";
                            status = 1;

                            if (RandomNumber >= 0 && RandomNumber <= 12) {
                                one = one + " " + draw[x];

                            }

                            if (RandomNumber >= 13 && RandomNumber <= 25) {
                                two = two + " " + draw[x];
                            }
                            if (RandomNumber >= 26 && RandomNumber <= 38) {
                                three = three + " " + draw[x];
                            }
                            if (RandomNumber >= 39 && RandomNumber <= 51) {
                                four = four + " " + draw[x];
                            }
                        }
                    } while (status == 0);

                }
                System.out.println(one);
                System.out.println(two);
                System.out.println(three);
                System.out.println(four);

                System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
                answer = scan.next();
            } while (answer.equals("Y") || answer.equals("y"));

        } //end of ShowOneHand method

    public static void simulateOdds() {
            int runs = 0;
                    String[] draw = new String[5];
                    String[] deck = new String[52];
                    deck[0] = "A";
                    deck[1] = "K";
                    deck[2] = "Q";
                    deck[3] = "J";
                    deck[4] = "10";
                    deck[5] = "9";
                    deck[6] = "8";
                    deck[7] = "7";
                    deck[8] = "6";
                    deck[9] = "5";
                    deck[10] = "4";
                    deck[11] = "3";
                    deck[12] = "2";
                    deck[13] = "A";
                    deck[14] = "K";
                    deck[15] = "Q";
                    deck[16] = "J";
                    deck[17] = "10";
                    deck[18] = "9";
                    deck[19] = "8";
                    deck[20] = "7";
                    deck[21] = "6";
                    deck[22] = "5";
                    deck[23] = "4";
                    deck[24] = "3";
                    deck[25] = "2";
                    deck[26] = "A";
                    deck[27] = "K";
                    deck[28] = "Q";
                    deck[29] = "J";
                    deck[30] = "10";
                    deck[31] = "9";
                    deck[32] = "8";
                    deck[33] = "7";
                    deck[34] = "6";
                    deck[35] = "5";
                    deck[36] = "4";
                    deck[37] = "3";
                    deck[38] = "2";
                    deck[39] = "A";
                    deck[40] = "K";
                    deck[41] = "Q";
                    deck[42] = "J";
                    deck[43] = "10";
                    deck[44] = "9";
                    deck[45] = "8";
                    deck[46] = "7";
                    deck[47] = "6";
                    deck[48] = "5";
                    deck[49] = "4";
                    deck[50] = "3";
                    deck[51] = "2";
                    String one = "Clubs";
                    String two = "Diamonds";
                    String three = "Hearts";
                    String four = "Spades";
                    
                    
                    String[] draw2 = new String[5];
                    String[] deck2 = new String[52];
                    deck2[0] = "A";
                    deck2[1] = "K";
                    deck2[2] = "Q";
                    deck2[3] = "J";
                    deck2[4] = "10";
                    deck2[5] = "9";
                    deck2[6] = "8";
                    deck2[7] = "7";
                    deck2[8] = "6";
                    deck2[9] = "5";
                    deck2[10] = "4";
                    deck2[11] = "3";
                    deck2[12] = "2";
                    deck2[13] = "A";
                    deck2[14] = "K";
                    deck2[15] = "Q";
                    deck2[16] = "J";
                    deck2[17] = "10";
                    deck2[18] = "9";
                    deck2[19] = "8";
                    deck2[20] = "7";
                    deck2[21] = "6";
                    deck2[22] = "5";
                    deck2[23] = "4";
                    deck2[24] = "3";
                    deck2[25] = "2";
                    deck2[26] = "A";
                    deck2[27] = "K";
                    deck2[28] = "Q";
                    deck2[29] = "J";
                    deck2[30] = "10";
                    deck2[31] = "9";
                    deck2[32] = "8";
                    deck2[33] = "7";
                    deck2[34] = "6";
                    deck2[35] = "5";
                    deck2[36] = "4";
                    deck2[37] = "3";
                    deck2[38] = "2";
                    deck2[39] = "A";
                    deck2[40] = "K";
                    deck2[41] = "Q";
                    deck2[42] = "J";
                    deck2[43] = "10";
                    deck2[44] = "9";
                    deck2[45] = "8";
                    deck2[46] = "7";
                    deck2[47] = "6";
                    deck2[48] = "5";
                    deck2[49] = "4";
                    deck2[50] = "3";
                    deck2[51] = "2";
                    String one1 = "Clubs";
                    String two1= "Diamonds";
                    String three1 = "Hearts";
                    String four1 = "Spades";
                    
                    while (runs < 10000) {
                    int status = 0;
                    for (int x = 0; x < 5; x++) {
                        status = 0;
                        do {
                            int RandomNumber = (int)(Math.random() * 52);
                            if (deck[RandomNumber] != "-1") {
                                draw[x] = deck[RandomNumber];
                                deck[RandomNumber] = "-1";
                                status = 1;

                                if (RandomNumber >= 0 && RandomNumber <= 12) {
                                    one = one + " " + draw[x];

                                }

                                if (RandomNumber >= 13 && RandomNumber <= 25) {
                                    two = two + " " + draw[x];
                                }
                                if (RandomNumber >= 26 && RandomNumber <= 38) {
                                    three = three + " " + draw[x];
                                }
                                if (RandomNumber >= 39 && RandomNumber <= 51) {
                                    four = four + " " + draw[x];
                                }
                            }
                        } while (status == 0);

                    }
                    System.out.println(one);
                    System.out.println(two);
                    System.out.println(three);
                    System.out.println(four);
                    
                    draw = draw2;
                    deck[0] = deck2[0];
                    deck[1] = deck2[1];
                    deck[2] = deck2[2];
                    deck[3] = deck2[3];
                    deck[4] = deck2[4];
                    deck[5] = deck2[5];
                    deck[6] = deck2[6];
                    deck[7] = deck2[7];
                    deck[8] = deck2[8];
                    deck[9] = deck2[9];
                    deck[10] = deck2[10];
                    deck[11] = deck2[11];
                    deck[12] = deck2[12];
                    deck[13] = deck2[13];
                    deck[14] = deck2[14];
                    deck[15] = deck2[15];
                    deck[16] = deck2[16];
                    deck[17] = deck2[17];
                    deck[18] = deck2[18];
                    deck[19] = deck2[19];
                    deck[20] = deck2[20];
                    deck[21] = deck2[21];
                    deck[22] = deck2[22];
                    deck[23] = deck2[23];
                    deck[24] = deck2[24];
                    deck[25] = deck2[25];
                    deck[26] = deck2[26];
                    deck[27] = deck2[27];
                    deck[28] = deck2[28];
                    deck[29] = deck2[29];
                    deck[30] = deck2[30];
                    deck[31] = deck2[31];
                    deck[32] = deck2[32];
                    deck[33] = deck2[33];
                    deck[34] = deck2[34];
                    deck[35] = deck2[35];
                    deck[36] = deck2[36];
                    deck[37] = deck2[37];
                    deck[38] = deck2[38];
                    deck[39] = deck2[39];
                    deck[40] = deck2[40];
                    deck[41] = deck2[41];
                    deck[42] = deck2[42];
                    deck[43] = deck2[43];
                    deck[44] = deck2[44];
                    deck[45] = deck2[45];
                    deck[46] = deck2[46];
                    deck[47] = deck2[47];
                    deck[48] = deck2[48];
                    deck[49] = deck2[49];
                    deck[50] =deck2[50];
                    deck[51] = deck2[51];
                    one = one1;
                    two = two1;
                    three = three1;
                    four = four1;


                    runs++;
            }

            
        } //end of simulateOdds method
} //end of class