/*
 * Write a method "isFactor" which takes two integers (k and n) and returns true if 

    ("if and only if") k is a factor of n.
 */
package methods;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter the integer value of the factor ");
		
		int firstInput = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter the integer value you are checking a factor for ");
		
		int secondInput = input1.nextInt();
		
		System.out.println(isFactor(firstInput, secondInput));
	}
	
	public  static Boolean isFactor(int k, int n) {
		
            if (n % k == 0){
                 //System.out.print(k+" is a factor of " +n);
            	}
      
		return n%k==0;
		}	
	
}