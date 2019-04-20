/*
 * Write a program to prompt the user for base-width and height of a triangle,
  then calculate the area of the Triangle.

 */


package variable;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Enter the integer value of the triangle's base-width");
		
		int baseWidth = input.nextInt();
		
		System.out.println ("Enter the integer value of the triangle height");
		
		
		int height = input.nextInt();
		
		double areaTraingle = baseWidth*height/2;
		
		System.out.println("The area of the triangel is: "+areaTraingle);
				
		

	}

}
