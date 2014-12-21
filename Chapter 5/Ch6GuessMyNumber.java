/**
 * Class: Ch5IsTriangle
 * Author: Nikhil, Coding For Kids
*/
import java.util.*;
public class Ch5IsTriangle {
   public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		boolean isTriangle = ((a + b > c && a + c > b && b + c > a));
		System.out.println(isTriangle);
   } 

}