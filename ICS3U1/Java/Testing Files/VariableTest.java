/*
Author: Daniel Leftley
Date: 9/6/2024
Teacher: Mr. Carreiro
Description: Testing variables (Write physical note on this later)
*/

class VariableTest {
   public static void main (String[ ] args) {
   
      double floatOneLine = 1.1251; // Declare a float (decimal) variable in a single line
      System.out.println(floatOneLine);
      
      double float2Line;
      float2Line = 1.1251;
      System.out.println(float2Line); // Print ln moves the cursor to the next line instead of printing this beside eachother
      
      int intVariable = 100;
      System.out.println(intVariable); // Intiger variables
      
      boolean booleanVariable = true;
      System.out.println (booleanVariable);   // Boolean variables, true and false have to be lowercase
      
      final int cantOverwriteLater = 1;
      System.out.println (cantOverwriteLater); // the final keyword prevents me from overwriteing this variable later one. It is perminant
      
      String name = "Daniel"; //Makeing a string variable. IDK why its not purple
      System.out.println (name);
      
      // useing printf(""); now
      System.out.printf("The author of this code was: %s \n", name); //Strings only take %s to replace with variables
      }
}