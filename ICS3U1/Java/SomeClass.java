/*
 Name: Daniel Leftley
 Date: 2024/09/08 
 Teacher: Mr. Carreiro
 */

import java.util.Scanner;

 class SomeClass {
    public static void main (String [] args) {
        String yourName =null;
        Scanner uI = new Scanner (System.in);
        System.out.println("Please enter your name:");
        yourName=uI.nextLine();
        System.out.printf("Greeting %s. You should never tell a stranger your name; \nespecially an electronic one", yourName); // Strings take %s and only %s
    }
 }