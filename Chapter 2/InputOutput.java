/**
 * Class: InputOutput
 * Author: Vineet Kosaraju, Coding For Kids
 * Revision Date: Dec 20, 2014
 *
 * This class is a modification to the original Input Output program. 
 * This changes the first prinln to print. The difference appears to be that
 * println forces the computer to go the next line, whereas print lets you stay on
 * the same line in the console output.
*/

// Here, we import part of Java's built-in libraries that lets us do input code
import java.util.Scanner;

// Start the container holding the InputOutput java code
public class InputOutput {

   // Start the main code block, the "main method".
   public static void main(String[] args) {
      
      // Create an "object" to use input code
      Scanner input = new Scanner(System.in);
      
      // Ask the user what their name is using print not println
      // Now, it won't go to a new line when asking for input
      System.out.print("What is your name?");
      
      // Get the name of the user, nextLine gives us a String
      String name = input.nextLine();

      // Print out the user's name, and ask them how they are doing
      System.out.print(name);
      System.out.print(", how are you doing today?");

   } // End the main code block with a closing curly brace

} // End the container with a closing curly brace