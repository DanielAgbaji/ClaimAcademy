package variable;
import java.util.Scanner;
public class AreaCircle {
	
	public static void main(String [] args) {
		
		//Create object of Scanner Class
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the radius of the circle: ");
		
		double radius = input.nextInt();
		
		double areaCirle = (int) Math.pow(radius,2);
		
		double circumferenceCircle2 = 2 * Math.PI * radius;
		double circumferenceCircle = Math.round (circumferenceCircle2 * 1000)/1000.0;
		
		System.out.println("The radius " +radius+" has an area of: "+areaCirle +" and a circumference of:"+circumferenceCircle);
		
		
	}

}
