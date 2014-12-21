/**
 * Class: Ch6Lottery
 * Author: Vineet Kosaraju, Coding For Kids
 * Ch6Lottery: Write a program that generates the 3 numbers (each number between 
 * 1 and 20, inclusive) for your school lottery. Use random number generator. 
 * No two numbers should be the same and no number should be zero. Use the while 
 * loop to continue generating random numbers for each number till all conditions 
 * are satisfied.  1, 15, 20 is a valid number combination. 14, 20, 14 is not a 
 * valid combination as 14 repeated twice. 3, 0, 20 is not a valid combination 
 * because the number zero is not allowed.
*/

import java.util.Scanner;

public class Ch6Lottery {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      int randomNumberOne = 0;
      int randomNumberTwo = 0;
      int randomNumberThree = 0;

      // We check to make sure the values are all different from each other
      while(randomNumberOne == randomNumberTwo   || 
            randomNumberTwo == randomNumberThree || 
            randomNumberOne == randomNumberThree) {

         // get new random numbers
         randomNumberOne = ((int) (Math.random() * 20)) + 1;
         randomNumberTwo = ((int) (Math.random() * 20)) + 1;
         randomNumberThree = ((int) (Math.random() * 20)) + 1;
      }

      System.out.print("The numbers are ... " + randomNumberOne);
      System.out.println(" " + randomNumberTwo + " " + randomNumberThree);

   } 

}