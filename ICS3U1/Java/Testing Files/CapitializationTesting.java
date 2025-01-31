/*
Name: Daniel Leftley
Date: 9/13/2024
Teacher: Carreiro
Description: Testing toLowerCase & toUpperCase
*/

class CapitializationTesting {
   public static void main (String [] args) {
      String rookie = "Agumon";
      String mega = "WarGreymon";
                                       
      mega = mega.toUpperCase(); // Switches mega variable to all upercase
      rookie = rookie.toLowerCase(); // Switches rookie variable to all uppercase
                                                                                 
      System.out.printf("%s warp digivolve to... \n%s",rookie,mega);
      
   
   
   }
}