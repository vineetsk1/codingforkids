/**
 * Class: Ch4Circle
 * Author: Nikhil, Coding For Kids
*/

public class Ch4Circle {
   public static void main(String[] args) {
		final double pi = 3.14; 
		double radius = 5.0;
		
		double area = pi*radius*radius;
		//calculates area using formula and stores it in variable
		double perim = 2*pi*radius;
		//calculates perimeter using formula and stores it in variable
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perim);
   } 

}