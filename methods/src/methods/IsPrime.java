/*
 * 
 * Write a method "isPrime" which takes an integer and returns true iff it is a prime

   number. Your method MUST call the "isFactor" method you wrote for problem #5.
 */

package methods;

import java.util.Scanner;

public class IsPrime {
	
	public static void main (String [] args) {
		
	Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your first number");
		
		int number1 = input.nextInt();
		
		System.out.println(isPrime(number1));
		
		
		
		

	}
	 
	
	public static Boolean isPrime(int number1) {
		Factor isPrime = new Factor();
		for (int i=1; i<number1; i++) {
		if ((number1%2==1)||(number1%2!=0)) {
			if (isPrime.isFactor(i, number1)) {
				
			}
		}
		
	}
		return number1%2!=0;
	}
	
}

