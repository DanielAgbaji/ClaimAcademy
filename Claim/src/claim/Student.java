package claim;

public class Student extends Person implements Bills{

	@Override
	public double taxes(double amount) {
	
		return amount * 0.2;
	}

}
