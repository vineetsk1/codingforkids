/**
 * Class: Ch6GuessMyNumber
 * Author: Nikhil, Coding For Kids
*/
import java.util.*;
public class Ch6GuessMyNumber {
   public static void main(String[] args) {
   		Scanner input = new Scanner(System.in);
		int number = 15; //secret number
		int guess = -1;
		while(number != guess){
			System.out.println("Try to guess my number ...");
			guess = input.nextInt();
			if(guess > number) {
				System.out.println("Too high!");
			}
			else if(guess < number) {
				System.out.println("Too low!");
			}
			else if(guess == number) {
				System.out.println("Perfect! You guessed it!");
			}
		}
   } 

}