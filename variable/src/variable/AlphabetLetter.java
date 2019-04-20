
/*
 *  Write a method to prompt the user for a letter of the alphabet 
 *  and display it's numerical value(ASCII). 
 */
package variable;
import java.util.Scanner;

public class AlphabetLetter {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Enter the alphabet: ");
		
		char alphabet = input.next().charAt(0);
		
		int numericalValue = (int) alphabet;
		
		
		
		System.out.println("The numberical value of the letter is:" +numericalValue );
		
		

	}

}
