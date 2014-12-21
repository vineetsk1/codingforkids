/**
 * Class: LemonadeStandV1
 * Author: Vineet Kosaraju, Coding For Kids
 * Revision Date: Dec 20, 2014
 *
 * This class is a modification to the original Lemonade Stand program. 
 * This prints out the values of all the variables using print and println.
*/

// Here, we import part of Java's built-in libraries that lets us do input code
import java.util.Scanner;

// Start the container holding the LemonadeStandV1 java code
public class LemonadeStandV1 {

   // Start the main code block, the "main method".
   public static void main(String[] args) { 
   
      // Ingredient cost definitions. Because they are not integer numbers, we use double.
      double eachLemonCost = 0.25;
      double eachPlasticCupCost = 0.10;
      double poundOfSugarCost = 2.0;

      // Let's print out those values using System.out.print and System.out.println
      System.out.print("Cost of lemon: ");
      System.out.println(eachLemonCost);

      System.out.print("Cost of plastic cup: ");
      System.out.println(eachPlasticCupCost);

      System.out.print("Cost of sugar: ");
      System.out.println(poundOfSugarCost);
   
      // Number of ingredients that we buy - because they are integers, we use int.
      int numPlasticCupsBought = 35;
      int numLemonsBought = 35;
      int poundsOfSugarBought = 1;

      // Let's print out those values using System.out.print and System.out.println
      System.out.print("Number of Plastic Cups Bought: ");
      System.out.println(numPlasticCupsBought);

      System.out.print("Number of Lemons Bought: ");
      System.out.println(numLemonsBought);

      System.out.print("Pounds of sugar: ");
      System.out.println(poundsOfSugarBought);
      
      // Here is the number of cups that we sell (numCupsSold), and
      // the price each buyer pays per cup (eachCupPrice)
      int numCupsSold = 30; 
      double eachCupPrice = 1.0;

      // Let's print out those values using System.out.print and System.out.println
      System.out.print("Number of Plastic Cups Sold: ");
      System.out.println(numCupsSold);

      System.out.print("Price People Pay for Each Cup: ");
      System.out.println(eachCupPrice);


   } // End the main code block with a closing curly brace

} // End the container with a closing curly brace