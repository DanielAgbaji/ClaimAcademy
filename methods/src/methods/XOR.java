/*
 *  Write a method called "xor" that takes two boolean values (either true or false) 

    and returns a boolean value which is true if EITHER of the values is true BUT

    NOT BOTH of them. This is called the "xor" function, or "eXclusive OR" (where 

    we are excluding the case where both values are true).

 */

package methods;
import java.awt.SecondaryLoop;
import java.util.Scanner;

public class XOR {
	
	
	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter the word first word 'true:' ");
		
		boolean firstInput = input1.nextBoolean();
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter the word first word 'false:'");
		
		boolean secondInput =  input2.nextBoolean();
	
		
		System.out.println(xor(firstInput, secondInput));
		
	}
		
	public static boolean xor (boolean firstInputTrue, boolean secondInputFalse) {
		
		//boolean value = ;
		
		if ((firstInputTrue&&!secondInputFalse)||(firstInputTrue&&!secondInputFalse)) {
			
			System.out.println ("The statement is true");
		}
		else 
			System.out.println ("The statement is false");
		return ((firstInputTrue&&!secondInputFalse)||(firstInputTrue&&!secondInputFalse));
			
          
		  
	
	}
	

}
