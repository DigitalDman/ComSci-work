/*
Name: Daniel Leftley
Date: 12/3/2024
Teacher: Carreiro
Description: Finding a day of the month
*/

import java.util.Scanner;

class LeftleyDanielDaysOfTheMonth {
   public static void main (String [] args){
   // Variable Declaration
      String month = " ";
      int year = 0;
      Boolean isMonth = false;
      Scanner userInput = new Scanner(System.in);
   
      // User Input
      System.out.println("What year is it?");
      while (!userInput.hasNextInt()){ // Assuring that a year is input into the scanner
         System.out.println("Invalid Input. Please try again");
         userInput.nextLine();
      }
      year = userInput.nextInt();
      userInput.nextLine();
      
      
      // Processing & More user Input
      while(isMonth == false){ // Useing this to assure input for the month
         System.out.println("What month is is?");
         month = userInput.nextLine();
         
         switch(month){
            case "January": // case for January
               isMonth = true;
               System.out.println("There are 31 days in January");
               break;
               
            case "Febuary": // Case for febuary
               isMonth = true;
               if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){ // Determining if its a leap year
                  System.out.println("Its a leap year!");
                  System.out.println("There are 29 days in Febuary");
               } else {
                  System.out.println("There are 28 days in Febuary");
               }
               break;
            
            case "March": // case for March
               isMonth = true;
               System.out.println("There are 31 days in March");
               break;
            
            case "April": // case for April
               isMonth = true;
               System.out.println("There are 30 days in April");
               break;
            
            case "May": // case for May
               isMonth = true;
               System.out.println("There are 31 days in May");
               break;
            
            case "June": // case for June
               isMonth = true;
               System.out.println("There are 30 days in June");
               break;
            
            case "July": // case for July
               isMonth = true;
               System.out.println("There are 31 days in July");
               break;
            
            case "August": // case for Agust
               isMonth = true;
               System.out.println("There are 31 days in August");
               break;
            
            case "September": // case for September
               isMonth = true;
               System.out.println("There are 30 days in September");
               break;
            
            case "October": // case for October
               isMonth = true;
               System.out.println("There are 31 days in October");
               break;
            
            case "November": // case for November
               isMonth = true;
               System.out.println("There are 30 days in November");
               break;
            
            case "December": // case for December
               isMonth = true;
               System.out.println("There are 31 days in December");
               break;
            
            default:
               System.out.println("Invalid Input, please try again");
               break;
         } // Exit switch
      
      } // Exit the isMonth loop      
   
   } // Exit main method
} // Exit class