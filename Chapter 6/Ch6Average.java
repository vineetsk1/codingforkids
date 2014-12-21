/**
 * Class: Ch6Average
 * Author: Vineet Kosaraju, Coding For Kids
 * Ch6Average: Ask the user for an integer number. Print the average of the sum 
 * of all numbers from 1 to the number user gave. For example, if user inputted 
 * 3, the average is (1+2+3)/3 = 2.
*/

import java.util.Scanner;

public class Ch6Average {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int number = input.nextInt();

      double sum = 0;
      for(int i = 1; i <= number; i++) {
         sum += i;
      }

      double average = (sum/number);
      System.out.println("Average is: " + average);
   } 

}