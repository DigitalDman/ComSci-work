/*
Name: Daniel Leftley
Date: 11/12/2024
Teacher: Carreiro
Description: Randomizeing Array numbers
*/

import java.util.Random;
import java.util.Arrays;

class ArrayTask{
   public static void main (String [] args){
      // Variable Declaration
      int[] randomArray = new int[5];
      Random rng = new Random();
      double average = 0.0;
      
      // processing
      for (int i = 0; i <= randomArray.length - 1; i += 1){
         randomArray[i] = rng.nextInt(100) + 1; // Task 1
         System.out.println(randomArray[i]); // Task 2
      
      }
      
      
     // Task 4
     for (int i = randomArray.length - 1; i >= 0; i -= 1){
         average += randomArray[i];
     }
     average /= randomArray.length;
     System.out.printf("Average: %.2f \n", average);
     
     // Task 5
      
     
     System.out.println(Arrays.toString(randomArray));
   
      // Task 3
      Arrays.sort(randomArray);
      System.out.printf("Highest: %d, Lowest%d", randomArray[randomArray.length-1], randomArray[0]);
     
   
   }
}