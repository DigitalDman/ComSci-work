/*
Name: Daniel Leftley
Date: 29/11/2024
Teacher: Carreiro
Description: Testing Ternary operators
*/

class RedTicketLeftleyDaniel {
   public static void main (String [] args){
      // Variables
      int a = 1;
      int b = 2;
      int c = 2;
      int redTicket = 0;
      
      
      // Processing
      redTicket = a == b && b == c ? 5 : redTicket;
      redTicket = a != b && a != c ? 1 : redTicket;
      redTicket = a == 2 && b == 2 && c == 2 ? 10 : redTicket;
   
   
      // Output
      System.out.println(redTicket);
   }
}