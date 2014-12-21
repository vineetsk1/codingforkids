/**
 * Class: Ch5LeapYear
 * Author: Nikhil, Coding For Kids
*/
import java.util.*;
public class Ch5LeapYear {
   public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		boolean isLeap = ((year%4 == 0 && year % 100 != 0)|| (year % 400 == 0));
		System.out.println(isLeap);
   } 

}