/**
 * Class: LemonadeStandV2
 * Author: Vineet Kosaraju, Coding For Kids
 * Revision Date: Dec 20, 2014
 *
 * This class is a modification to the original Lemonade Stand program. 
 * This prints out the values of all the variables using print and println and 
 * asks the user for values using I/O (input/output) code.
*/

// Here, we import part of Java's built-in libraries that lets us do input code
import java.util.Scanner;

// Start the container holding the LemonadeStandV2 java code
public class LemonadeStandV2 {

   // Start the main code block, the "main method".
   public static void main(String[] args) { 
   
      // Create an "object" to use input code
      Scanner input = new Scanner(System.in);

      // Ingredient cost definitions. Because they are not integer numbers, we use double.
      System.out.println("Enter the cost per lemon, the cost per cup, and the pound per sugar, each on a new line.");
      double eachLemonCost = input.nextDouble();
      double eachPlasticCupCost = input.nextDouble();
      double poundOfSugarCost = input.nextDouble();

      // Let's print out those values using System.out.print and System.out.println
      System.out.print("Cost of lemon: ");
      System.out.println(eachLemonCost);

      System.out.print("Cost of plastic cup: ");
      System.out.println(eachPlasticCupCost);

      System.out.print("Cost of sugar: ");
      System.out.println(poundOfSugarCost);
   
      // Number of ingredients that we buy - because they are integers, we use int.
      System.out.println("Enter the number of cups bought, the number of lemons bought, and the pounds of sugar bought, each on a new line.");
      int numPlasticCupsBought = input.nextInt();
      int numLemonsBought = input.nextInt();
      int poundsOfSugarBought = input.nextInt();

      // Let's print out those values using System.out.print and System.out.println
      System.out.print("Number of Plastic Cups Bought: ");
      System.out.println(numPlasticCupsBought);

      System.out.print("Number of Lemons Bought: ");
      System.out.println(numLemonsBought);

      System.out.print("Pounds of sugar: ");
      System.out.println(poundsOfSugarBought);
      
      // Here is the number of cups that we sell (numCupsSold), and
      // the price each buyer pays per cup (eachCupPrice)

      System.out.println("Enter the number of cups sold and how much you charge per cup.");
      int numCupsSold = input.nextInt();
      double eachCupPrice = input.nextDouble();

      // Let's print out those values using System.out.print and System.out.println
      System.out.print("Number of Plastic Cups Sold: ");
      System.out.println(numCupsSold);

      System.out.print("Price People Pay for Each Cup: ");
      System.out.println(eachCupPrice);


   } // End the main code block with a closing curly brace

} // End the container with a closing curly brace