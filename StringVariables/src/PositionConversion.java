/*
 * 1. Write a program to convert every even position to upper case and every odd position
 *  to lower case. eg input "Banana" output :"bAnAnA" or input "StLouis" output:"sTlOuIs"
 Hint: Use toLowerCase() and toUpperCase() methods for conversion.
 */
import java.util.Scanner;
import Position;

public class PositionConversion {
	
	public static void main(String[]args) {
		
		Scanner inputString = new Scanner (System.in);
		
		System.out.println("Type in your string");
		
		Position position = new Position();
		
		String word = inputString.nextLine(); 
		
		System.out.println(word);
		
		System.out.println(position.toLowerCase(word));
			
		
	}

}
