package claim;

public class Employee extends Person implements Bills{

	@Override
	public double taxes(double amount) {
		
				return amount*.2;
	}
	

}
