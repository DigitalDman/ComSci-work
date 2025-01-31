/*
Name: Daniel Leftley
Date: 26/11/2024
Teacher: Carreiro
Description: Replaceing a word in a string
*/

import java.util.Scanner;

class LeftleyDanielReplaceingAWordLvl2 {
   public static void main (String [] args){
   // Variable Declaration & Initilization
   String inputText = " ";
   String searchWord = " ";
   String replacementWord = " ";
   String finalText = " ";
   String firstHalf = " ";
   String lastHalf = " ";
   int firstLetterIndex = 0;
   int lastLetterIndex = 0;
   Scanner userInput = new Scanner(System.in);
   Boolean initialSentanceDone = false;
   Boolean foundAllWords = false;
   
   // User Input
   System.out.println("Please input a line of text");
   inputText = userInput.nextLine(); // Asking for what they want the string to be
   System.out.printf("You input: %s\n",inputText); 
   
   System.out.println("Which word do you want to replace in your text?");
   searchWord = userInput.nextLine(); // Asking for what word should be replaced
   
   System.out.println("What would you like to replace it with?");
   replacementWord = userInput.nextLine(); // Asking for what it should be replaced with
   
   // Processing

   while (foundAllWords == false){
      // REPLACING THE WORD IN THE INITIAL SENTANCE PROVIDED
      if (initialSentanceDone == false){
            firstLetterIndex = inputText.indexOf(searchWord); // Finding the index of the first letter in the search word
            
            if (!(firstLetterIndex <= -1)){ // Only running if the word is found in the initial sentance
            lastLetterIndex = firstLetterIndex + searchWord.length(); // Finding the index of the last letter in the search word
         
            firstHalf = inputText.substring(0,firstLetterIndex); // Turning every word before the search word into a seperate string
            lastHalf = inputText.substring(lastLetterIndex); // Turning every word after the search word into a seperate string
            
            finalText = firstHalf + replacementWord + lastHalf; // Concatanateing the first half to the replacement word and the last half
            
         }
         else { // Telling you the word isnt found in the sentance
            System.out.printf("%s is not found within the sentance %s\n", searchWord, inputText);
            foundAllWords = true;
         }
         initialSentanceDone = true;
      }
        
        
      // REPLACING THE WORD IN THE MODIFIED SENTANCE 
      else{
         firstLetterIndex = finalText.indexOf(searchWord); // Finding the index of the first letter in the search word
            
            if (!(firstLetterIndex <= -1)){ // Only running if the word is found in the initial sentance
            lastLetterIndex = firstLetterIndex + searchWord.length(); // Finding the index of the last letter in the search word 
            
         
            firstHalf = finalText.substring(0,firstLetterIndex); // Turning every word before the search word into a seperate string
            lastHalf = finalText.substring(lastLetterIndex); // Turnin g every word after the search word into a seperate string
            
            finalText = firstHalf + replacementWord + lastHalf; // Concatanateing the first half to the replacement word and the last half
         }
         else { // Telling you the word isnt found in the sentance
            System.out.printf("%s is not found within the provided sentance anymore%n", searchWord, inputText);
            foundAllWords = true;
         }
      }   
      
   }
   
   // Output
   System.out.printf("Your new message is: %s", finalText); // Displaying the new string   
   }
}