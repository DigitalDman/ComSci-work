/*
Name: Daniel Leftley
Date: 29/11/2024
Teacher: Carreiro
Description: Testing Ternary operators
*/

class TeenSumDanielLeftley {
   public static void main (String [] args){
      // Variables
      int a = 1;
      int b = 25;
      int teenSum = 0;
      
      // Processing
      teenSum = a <= 19 && a >= 13 || b <= 19 && b >= 13 ? 19 : a + b; // if a or b are somewhere in the teens, it returns 19, if not it returns a + b
      
      // Output
      System.out.println(teenSum);
   }
}