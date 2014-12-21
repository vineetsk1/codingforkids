/**
 * Class: Ch6Mul3Mul5
 * Author: Vineet Kosaraju, Coding For Kids
 * Ch6Mul3Mul5: Ask the user for an integer number. Print all the multiples of 3 
 * or multiples of 5 between 0 and the number the user provided. For example, if 
 * the user gives the number as 15, you would print 3, 5, 6, 9, 10, 12. Note that 
 * the number 15 and number 0 are not included. 
*/

import java.util.Scanner;

public class Ch6Mul3Mul5 {
   public static void main(String[] args) {
   	
   	Scanner input = new Scanner(System.in);

   	System.out.print("Enter a number: ");
   	int number = input.nextInt();

   	System.out.print("\nThe multiples are... ");

   	int start = 1;
   	while(start < number) {

   		if(start % 3 == 0 || start % 5 == 0) {
   			System.out.print(start + " ");
   		}

   		start++;
   	}

   	System.out.print("\n");
		
   } 

}