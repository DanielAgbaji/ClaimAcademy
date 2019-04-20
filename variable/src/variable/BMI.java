package variable;
import java.util.Scanner;
public class BMI {
	
	public static void main (String []args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the height in integer: ");
		
		int height = input.nextInt();
		
		System.out.println("Enter the weight in integer: ");
		
		int weight = input.nextInt();
		
		double bmi = weight/(Math.pow(height, 2));
		
		System.out.println("The BMI is: " +Math.round (bmi*1000)/1000.0 +" kg/m^2");
	}

}
