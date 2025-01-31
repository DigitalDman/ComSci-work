/*
 Name: Daniel Leftley
 Date: 2024/09/08 
 Teacher: Mr. Carreiro
 */

 import java.util.Scanner;

 class SomeClass2 {
    public static void main (String [] args) { //Added ; for the rest of the method
        int yourNum = 0; //Makes an intiger variable
        Scanner uI = new Scanner (System.in);
        System.out.println("Please enter a number:");
        yourNum=uI.nextInt(); // Uses yourNum and not yourName
        System.out.printf("Your entered the number %d", yourNum); //%d works like %s (atleast on VS code), int only takes %s or %d
    } //Closed main method
 } //Clossed class