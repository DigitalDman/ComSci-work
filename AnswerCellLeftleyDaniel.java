/*
Name: Daniel Leftley
Date: 29/11/2024
Teacher: Carreiro
Description: Testing Ternary operators
*/

class AnswerCellLeftleyDaniel {
   public static void main (String [] args){
      // Variables
      Boolean isMorning = false;
      Boolean isMom = true;
      Boolean isAsleep = false;
      Boolean answerCell = false;
      
      // processing
      answerCell = isMorning == false && isMom == true && isAsleep == false ? true : false;
      
      // Output
      System.out.println(answerCell);
   
   
   }
}