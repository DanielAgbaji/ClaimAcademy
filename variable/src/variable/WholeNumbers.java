/*
 *  Write a method to prompt the user for a double then display the 
 *  value as a whole number. eg user enter "15 .8" result is:  
 *  "You entered 15.8, the new value is 16".
eg user enter "15 .4" result is:  "You entered 15.4, the new value is 15".
 */
package variable;
import java.util.Scanner;
public class WholeNumbers {

	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a number in double value ");
		
		double number = input.nextDouble();
		
		System.out.println("You entered " +number +" The result is: " +getdouble(number));
	}
	
	public static int getdouble(double number) {
		
		int convertNumber = (int) number; 
		return convertNumber;
	}
	
}
