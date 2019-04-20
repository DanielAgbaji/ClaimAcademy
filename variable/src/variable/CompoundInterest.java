/*
 * Write a program which takes following input : 
a) Investment Amount
b) monthly interest rate 
c) number of years
Calculate the Compound interest. p(1+r/n)^n
 */
package variable;
import java.util.Scanner;

public class CompoundInterest {
	
	public static void main (String[]args) {
		
        Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the Investment Amount: ");
		
		double investmentAmount = input.nextInt();
		
		System.out.println("Enter the monthly interest rate: ");
		
		int monthlyInterestRate = input.nextInt();
		
        System.out.println("Enter the number of years: ");
		
		int numberYears = input.nextInt();
		
		double compoundInterest = investmentAmount*Math.pow((1+monthlyInterestRate/numberYears),2);
		
		System.out.println ("The compound interest is: " + compoundInterest);
		
	}

}
