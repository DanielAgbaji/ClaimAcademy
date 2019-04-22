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
		
		System.out.println("Type your first value: ");
		
		boolean firstInput = input1.hasNextInt();
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Type your second value: ");
		
		boolean secondInput =  input2.hasNext();
	
		
		System.out.println("The condition: " +xor(firstInput, secondInput)+" is met ");
		
	}
		
	public static boolean xor (boolean firstInputTrue, boolean secondInputFalse) {
		
		//boolean value = ;
		
		if ((firstInputTrue&&!secondInputFalse)||(secondInputFalse&&!firstInputTrue)) {
			
			return true;
		}
		else 
			System.out.println ("The statement is false");
			
          
		   return true;
	
	}
	

}
