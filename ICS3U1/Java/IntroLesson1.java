/**********************************************************************************
Author: Daniel Leftley
Date: 9/6/2024
Teacher: Mr. Carreiro
Description: This program can do many things includeing bringing you coffee

This is a block comment of non-executeable code
A block of this type starts with a /* and ends with a */
//*********************************************************************************
// I ended up ending the block in the last line with the way it was written, this is a line comment, use a // to start it
                                                                                                                                                                           
// Commenting code is important because it tells the reader what is happening in the program


/*
When you write your program you need to open up a class
the file name of your .java file must be the same as your class name you can not use spaces in the name or special characters

As a matter of convention you should also write your class out in upper CammelCase, CammelCase is when we write a name WithoutUseingSpaces and start Each Word With A Capital Letter

UpperCammelCaseExample
lowerCammelCaseExample

Use UpperCammelCase for class names
Use lowerCammelCase for variable names and methods

writeing in cammel case is called a convention
*/

class IntroLesson1 { // Curly braces denote a bloccks of code. Everything within these curly braces belongs to the class. Java takes care of which brackets belong to which

   public static void main (String [] args) { // main needs to take peramiters (String [] args) every time. This is the main method signature
   
   // Print statements
     System.out.print("Outputs a literal. What is in the quote will be printed");
     System.out.print(2+2); // This will output the sum of 2+2, print can do math in Java
     
     System.out.println(" ");
     System.out.print ("Hello ");
     System.out.println ("World");
     
     System.out.println(" ");
     System.out.println ("With println");
     System.out.println ("Hello");
     System.out.println ("World");
   
   } // end main method

} //remember to open & close with the {} or the class wont work