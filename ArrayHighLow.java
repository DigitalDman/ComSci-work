/*
Name: Daniel Leftley
Date: 9/12/2024
Teacher: Carreiro
Description: Showing the highest number & lowest number in the array
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class ArrayHighLow {
   public static void main (String [] args){
      // Variable declaration
      Random rng = new Random();
      Scanner userInput = new Scanner(System.in);
      int arrayLength = 0;
      
      // User Input
      System.out.println("How long do you want the array to be?");
      arrayLength = userInput.nextInt();
      int[] highLow = new int[arrayLength];
      
      // Processing
      // Randomizeing the array
      for (int i = arrayLength - 1; i >= 0; i -= 1){
         highLow[i] = rng.nextInt(100 - 1 - 1) + 1;
         System.out.printf("%d ",highLow[i]);
      }
            
      // Ordering the array from lowest to highest
      Arrays.sort(highLow);
      
      // Output
      System.out.printf("\nHighest: %d    Lowest: %d", highLow[arrayLength-1], highLow[0]);
      
   }
}