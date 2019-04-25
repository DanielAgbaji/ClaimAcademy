package boxApp;
import java.util.Scanner;
public class BoxApp {
	
	

	public static void main(String[] args) {
		
		//length
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the length of the box: ");
		
		double length = input.nextDouble();
		
		//height
		Scanner input2 = new Scanner (System.in);
		
		System.out.println("Enter the height of the box: ");
		
		double height = input2.nextDouble();

		
		//depth
		
		Scanner input3 = new Scanner (System.in);
		
		System.out.println("Enter the length of the box: ");
		
		double  depth = input3.nextDouble();
		Box box = new Box(depth, length, height, depth);
		System.out.println("The volume of the box is: "+box.getVolume(height, length, depth));
		System.out.println("The Surface Area of the box is: "+box.getSurfaceArea(depth, length, height));
		//System.out.println("The volume of the box is: "getVolume(depth, length, height))
		

	}

}
