/*
 * Write a method "isPerfect" which takes an integer and returns true iff that 

   integer is a perfect number. Your method MUST call the "isFactor" method you 

   wrote for problem #5.
 */
package methods;
import java.util.Scanner;



public class PerfectNumber {

	public static void main(String[] args) {
		
		
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your first number");
		
		int number1 = input.nextInt();
		
		System.out.println(isPerfect(number1));
		
		
		
		

	}
	 
	
	public static Boolean isPerfect(int number1) {
		
		Factor perfectNumber = new Factor();
		int sum = 0;
		
		for (int i=1; i<number1; i++) {
			if (perfectNumber.isFactor(i, number1)) {
				sum+=i;
			}
		}
		return sum==number1;
	}
	

}
