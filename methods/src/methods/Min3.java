package methods;
import java.util.Scanner;


public class Min3 {
	

	

		public static void main(String[] args) {
			
			Scanner input1 = new Scanner (System.in);
			
			System.out.print ("Enter your first number: ");
			
			int number1 = input1.nextInt();
			Scanner input2 = new Scanner (System.in);
			
			System.out.print ("Enter your second number: ");
			
			int number2 = input2.nextInt();
			Scanner input3 = new Scanner (System.in);
			
			System.out.print ("Enter your third number: ");
			
			int number3 = input3.nextInt();
			
			System.out.print(getMax3(number1, number2, number3));
			

		}
		
		public static int getMin3(int number1, int number2, int number3) {
			
			if (number1<=number2&&number1<=number3) {
				//System.out.println("The highest number is: "+ number1);
				
				return number1;
				
			}
			
			else if (number2<=number1&&number2<=number3) {
				//System.out.println("The highest number is: "+ number2);
				return number2;
				
			}
			else if (number3<=number1&&number1<=number2) {
				//System.out.println("The highest number is: "+ number3);
				return number3;
				
			}
			return number3;
		}

	}
