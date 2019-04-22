/*
 *  Write a method called "xor" that takes two boolean values (either true or false) 

    and returns a boolean value which is true if EITHER of the values is true BUT

    NOT BOTH of them. This is called the "xor" function, or "eXclusive OR" (where 

    we are excluding the case where both values are true).

 */

package methods;
import java.util.Scanner;

public class XOR {
	
	
	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Type your first number: ");
		
		boolean firstInput = input1.hasNextInt();
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Type your second number: ");
		
		boolean secondInput =  input2.hasNext();
	
		
		System.out.println("The condition is met" +xor(firstInput, secondInput));
		
	}
		
	public static boolean xor (boolean firstInput, boolean secondInput) {
		
		boolean value = ;
		
		if ((firstInput==true||secondInput==true)||(firstInput==false||secondInput==false)) {
			
			value = true;
			System.out.println (true);
		}
		else if (firstInput&&secondInput==true) {
			
			System.out.println(" Given the condition, the both numbers are True, "
					
					+" therefore nothing is returned "); 
			
		}
          
		   return firstInput||secondInput!firstInput&&secondInput;
	
	}
	

}
