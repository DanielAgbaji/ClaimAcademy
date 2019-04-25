package boxApp;
/*
 *  
Write a "Box" class which has the following properties:
cost of material per square inch, 
height in inches, 
length in inches, 
depth in inches. 
 
Provide methods for calculating the "Volume", "SurfaceArea" and "Cost". 
 
Write a program to use the class by creating a Box object and
asking the user for each of the properties, setting these properties 
for the box and printing out the Volume, Surface Area and Cost of the box.
 */
public class Box {
	
	//Properties of Box Class
	
	private double height;
	private double length;
	private double depth;
	private double costPerSquare;
	
	public Box(double height, double length, double depth, double costPerSquare) {
		this.costPerSquare=costPerSquare;
		this.length=length;
		this.depth=depth;
		this.height=height;
		
	}
	
	public double height () {
		return this.height;
	}
	public void height(double height) {
		this.height=height;
	}
	
	public double length () {
		return this.length;
	}
	public void length (double length) {
		this.length=length;
	}
	public double depth () {
		return this.depth;
	}
	public void depth (double depth) {
		this.depth=depth;
	}
	public double costPerSquare() {
		return this.costPerSquare;
		
	}
	public void costPerSquare (double costPerSquare) {
		this.costPerSquare=costPerSquare;
		
	}
	// volume of a box l*w*h
	public double getVolume(double height, double length, double depth) {
		double volume=height*length*depth;
		return volume;
	}
	//Surface Area of a box 2(h × W) + 2(h × L) + 2(W × L)
	public double getSurfaceArea(double height, double length, double depth) {
		
		double surfaceArea = 2*(height*depth)+2*(depth*length)+2*(height*length);
		
		return surfaceArea; 
	}
	public double getCost(double height, double length, double depth, double costPerSquare) {
		
		double cost = getSurfaceArea(height, length, depth)*costPerSquare;
		return cost;
		}
}
	
	
	
	

	