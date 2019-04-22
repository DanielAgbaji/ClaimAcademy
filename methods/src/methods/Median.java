/*
 * 
Write a method called "median3" that computes the MEDIAN value of THREE 

integers. Hint: for the case of three numbers, the median is the value that is

NOT the maximum NOR the minimum, so add the three values and subtract out

the min and max, using the methods you wrote for problems #1 and #2.

 */
package methods;

import java.util.Scanner;


public class Median {
	public static void main(String[]args) {
		
		//Create objects of class Max3 and Min3 in order to use their properties and methods
		
		Max3  maximumNumber = new Max3 ();
		
		Min3  minimumNumber = new Min3 ();
		
		
		//receive 3 numerical inputs from users. This will be used as the arguments to be passed
		
		
		Scanner input1 = new Scanner (System.in);
		
		System.out.print ("Enter your first number: ");
		
		int number1 = input1.nextInt();
		Scanner input2 = new Scanner (System.in);
		
		System.out.print ("Enter your second number: ");
		
		int number2 = input2.nextInt();
		Scanner input3 = new Scanner (System.in);
		
		System.out.print ("Enter your third number: ");
		
		int number3 = input3.nextInt();
		
		//Calculate the median of the three numbers
		
		
		int median = maximumNumber.getMax3(number1, number2, number3)-minimumNumber.getMin3(number1, number2, number3);
		
		
		System.out.println ("The median of the three numbers, " +number1+ ", " +number2 +", and " +number3+" " +"is: "+median);
		
		
		

	}
	
}
