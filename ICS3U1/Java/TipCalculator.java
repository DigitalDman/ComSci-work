/*
Name: Daniel Leftley
Date: 9/26/2024
Teacher: Carreiro
Description: Makweing a tip calculator
*/

import java.util.Scanner;

class TipCalculator {
   public static void main (String [] args) {
   //////////// Declareing variables ////////////////////////
   double costOfMeal = 0.0;
   double totalCost = 0.0;
   int tip = 0;
   double tipPercent = 0.0;
   double tipCost = 0.0;
   double pricePerPerson = 11.99;
   int totalPeople = 1;
   Scanner userInput = new Scanner(System.in);
   //////////////////////////////////////////////////////////
   // Asking for the ammout of people being split with 
   System.out.print("The price of a meal per person is 11.99. How many people are you eating with? ");
   totalPeople = userInput.nextInt();
   totalCost = (pricerPerPerson*totalPeople)*1.13;
   System.out.printf("Your total price is: $%f without tip\n",totalPrice);
   
   System.out.print("How much would you like to tip the waiter?");
   tip = userInput.nextInt();
   tipPercent = tip/100;
   tipCost = 
   
   
   

   }
}