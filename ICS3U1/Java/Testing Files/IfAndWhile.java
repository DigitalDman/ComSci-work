/*
Name: Daniel Leftley
Date: 9/12/2024
Teacher: Carreiro
Description: Messing with If statements and While loops (pls no For loops)
*/

import java.util.Random;
import java.util.concurrent.TimeUnit;

class IfAndWhile {
   public static void main (String [] args) throws InterruptedException {
      int x = 1;
      
      String name = "Daniel";
      
      String name2 = "Andy";
      
      if (name == "Daniel") { // acts like method, requires (), open with {
         System.out.printf("Hello %s. \nAccess Granted: passcode %d \n", name, x);         
      } // Close if statement
      
      else { // Also treated like a method, open with {
         System.out.printf("Your name is %s. My name is %s, \n", name, name2); //Double variables used here.
      } // closes else statement
      
      
      while (x <= 10){ // Works like method again, opens with {
         TimeUnit.SECONDS.sleep(1);
         x += 1;
         System.out.printf("X = %d \n",x);

      } // close the while loop
      
   }
}
