package claim;

public  abstract class  Person {
	private String firstName;
	
	private String lastName;
	
	public Person(String firstName, String lastName) {
		
		
		
	}
	
	abstract public double taxes(double amount);
	
	public double calculateTelephoneBill(double amount) {
		return this.taxes(amount)+ amount;
		
	}

	

		
		

}
