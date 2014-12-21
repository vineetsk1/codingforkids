/**
 * Class: Ch7Calculator
 * Author: Vineet Kosaraju, Coding For Kids
 * Ch7Calculator: Write a program that asks the user for two integer inputs 
 * and the arithmetic operation that want to perform. The operation can be add, 
 * subtract, multiply, divide, remainder or square root. the program returns an 
 * integer result of the operation. 
*/

import java.util.Scanner;

public class Ch7Calculator {
   public static void main(String[] args) {
   	
   	Scanner input = new Scanner(System.in);

   	System.out.print("Enter number one: ");
   	int numberOne = input.nextInt();

      System.out.print("Enter number two: ");
      int numberTwo = input.nextInt();

      // Throw away previous inputs
      input.nextLine();

      System.out.print("Enter operation: ");

      String operand = input.nextLine();

      char operation = operand.charAt(0); // get the first character of the input

      System.out.print("Answer: ");
      switch(operation) {
         case '+':
            System.out.println(numberOne + numberTwo);
            break;
         case '-':
            System.out.println(numberOne - numberTwo);
            break;
         case '*':
            System.out.println(numberOne * numberTwo);
            break;
         case '/':
            System.out.println(numberOne / numberTwo);
            break;
         case '%':
            System.out.println(numberOne % numberTwo);
            break;
         case 'r': // you can choose any symbol you want
            int rootOne = (int) (Math.sqrt(numberOne));
            int rootTwo = (int) (Math.sqrt(numberTwo));
            System.out.println(rootOne + " " + rootTwo);
            break;
      }



		
   } 

}