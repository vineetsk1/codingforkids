/**
 * Class: InputOutputV2
 * Author: Vineet Kosaraju, Coding For Kids
 * Revision Date: Dec 20, 2014
 *
 * This class is a modification to the original Input Output program. 
 * This also asks the user for their home address, and then tells the user that
 * the program knows where they live.
*/

// Here, we import part of Java's built-in libraries that lets us do input code
import java.util.Scanner;

// Start the container holding the InputOutput java code
public class InputOutputV2 {

   // Start the main code block, the "main method".
   public static void main(String[] args) {
      
      // Create an "object" to use input code
      Scanner input = new Scanner(System.in);
      
      // Ask the user what their name is
      System.out.println("What is your name?");
      
      // Get the name of the user, nextLine gives us a String
      String name = input.nextLine();

      // Ask the user what their home address is
      System.out.println("What is your home address?");

      // Because the home address is a sentence, use nextLine
      String address = input.nextLine();

      // Print out the user's name, their address, and creep them out by saying
      // that you know where they live.
      System.out.print("Hello, ");
      System.out.print(name);
      System.out.print(", I know you live at ");
      System.out.println(address);

   } // End the main code block with a closing curly brace

} // End the container with a closing curly brace