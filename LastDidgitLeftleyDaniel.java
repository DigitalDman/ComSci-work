/*
Name: Daniel Leftley
Date: 29/11/2024
Teacher: Carreiro
Description: Testing Ternary operators
*/

class LastDidgitLeftleyDaniel {
   public static void main (String [] args){
   // Variables
   int a = 27;
   int b = 15;
   int c = 76;
   Boolean output = false;
   
   // processing
   output = a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10 ? true : false;
   // if any of them have the same rightmost number as any of the other numbers it returns true
   
   // output
   System.out.println(output);

   }
}