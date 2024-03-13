/**
* Lab 0 - Intro to BlueJ/Coin Calculator
* COSC 111 
*
* This program will read in integer values representing the number of
quarters,
* dimes, nickels, and pennies you have "in your pocket". Based on these
inputs,
* you will calculate the value for each coin type. The output will display
* the individual amounts and the total sum in pennies (e.g. 4 quarters, 0
dimes,
* 2 nickels, and 1 penny will result in 110).
*
* @author 
* @version 
*/

import java.util.Scanner;
public class YourName_Lab0 {
public static void main (String[] args){
    // Declare and initialize variables and Scanner object to read input
    Scanner kb = new Scanner(System.in);
    int quarters, dimes, nickels, pennies;
    int totalChange = 0;

    // Display Introduction
    System.out.println("===================== COIN CALCULATOR=====================");
    System.out.println();
    System.out.println("Program By: Your Name");
    System.out.println("This program will add up the change in your pocket.");
    System.out.println();

    // Prompt for and read user input for quarters, dimes, nickels, and pennies
    //(add code here)

    //Calculate how many cents worth of quarters, dimes, and nickels there are
    //(add code here)

    // Compute total change
    //(add code here)

    // Print output
    System.out.println();
    System.out.println("===========================================================");
    System.out.print("The total value of change is: " + totalChange);
    }
}