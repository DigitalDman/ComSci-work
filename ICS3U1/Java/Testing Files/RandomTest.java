/*
Name: Daniel Leftley
Date: 9/25/2024
Teacher: carreiro
Description: Randomness
*/

import java.util.Random; // Install like scanner

class RandomTest {
   public static void main(String [] args) {
   int x = 0;
   int z = 0;
   int y = 0;
   int loop = 0;
   int range = 10; // useing a range variable to determine how many numbers we want
   int i = 0;
   int miniumun = 5; // Lowest number we want
   int maximum = 10;
   Random rng = new Random(); // Declare just like scanner
   
   
   x = rng.nextInt(100); // returns the next intiger
   // The number in brackets is the ammount of numbers it can roll, starting from 0
   System.out.println(x);
   
   z = 5 + rng.nextInt(5); // first number (The one being added) is the lower bound, with 10 being the ammount of numbers it can roll (5-9)
   System.out.println(z);
   
   // ************* (LOWER BOUND + RANGE) - 1 = UPPER BOUND *************** //
   
   y = miniumun + rng.nextInt(range+1); // Useing formula above, add 1 (+1) to your range to make your highest number: LOWER BOUND + RANGE = UPPER BOUND
   System.out.println(y);   
   
   
   // *******************************   (MAX - MIN + 1) + MIN = ALTERNATE FORMULA FOR MAX NUMBER ******************************

      i = rng.nextInt(maximum - miniumun + 1) + miniumun; // Useing a max variable to save all the mental math
      System.out.println(i);
      loop += 1;
   
   /* 
   
   The number in brackets -1 is the ammount of numbers the program will count(includeing 0)
   Max = 10, min = 5
   (Max - Min + 1) - 1) + Min
   = ((Max - Min + 1) - 1) + Min | Drop everything thats outside brackets. It does not matter without context
   = ((10 - 5 + 1) - 1)
   = ((5 + 1) - 1)
   = ((6) - 1) | 6 is the ammount of numbers the program will generate, starting from 0
   = 5 | This is the highest number the program will generate within the random statement. 
   This is why we add the miniumum number to it after the generation
   The + Min outside of brackets is added to after a random number is generated
   
   Can only roll up to 5 thanks to equation above (includeing 0). Highest generated numeber(HGN) = 4
   HGN + Min = highest number
   5 + 5 = highest number
   10 = highest number

   lowest generated number(LGN) = 0
   LGN + Min = lowest number
   0+5 = lowest number
   5 = lowest number

   generated number = 3 (can generate up to 5 since it can only roll 5 numbers includeing 0)
   generated number + Min = number within range
   3 + 5 = number within range
   8 = number within range

   */   
   
   }
}