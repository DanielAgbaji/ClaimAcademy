/*
 * Write a method "isFactor" which takes two integers (k and n) and returns true if 

    ("if and only if") k is a factor of n.
 */
package methods;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter the word first word 'true:' ");
		
		boolean firstInput = input1.();

	}
	
	public static int isFactor(int k, int n) {
		
		//factorizing the value of k for n
		
		int factor = k/n;
	
		
		if (factor*k==n) 
		{
			System.out.println(" The number:" +k +"you entered is a factor");
		}
		return k;
	}

}
