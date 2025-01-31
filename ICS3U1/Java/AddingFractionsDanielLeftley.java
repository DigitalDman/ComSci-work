/*
Name: Daniel Leftley
Date: 9/20/2024
Teacher: Carreiro
Description: Adding fractions input by the scanner function together
*/

import java.util.Scanner;

class AddingFractionsDanielLeftley {
   public static void main (String [] args) {
   /////////////// Declareing Variables/////////////
   int numerator1 = 0;
   int denominator1 = 0;
   
   int numerator2 = 0;
   int denominator2 = 0;

   
   Scanner fractions = new Scanner(System.in);
   //////////////////////////////////////////////////
   
   System.out.print("What is the numerator of the first fraction: ");
   numerator1 = fractions.nextInt();
   
   System.out.print("\nWhat is the denominator for the first fraction: ");
   denominator1 = fractions.nextInt();
   
   System.out.print("\nWhat is the numerator of the second fraction: ");
   numerator2 = fractions.nextInt();
   
   System.out.print("\nWhat is the denominator for the second fraction: ");
   denominator2 = fractions.nextInt();
   
   
   System.out.printf("\nThe sum of %d/%d + %d/%d = %d/%d", numerator1, denominator1, numerator2, denominator2, (numerator1*denominator2)+(numerator2*denominator1),(denominator1*denominator2));
   
   }
}