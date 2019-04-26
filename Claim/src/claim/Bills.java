package claim;

public interface Bills {

	
	public double taxes(double amount);
	public default double calculateGassBill(double amount) {
		return this.taxes(amount)+ amount;
		
	}
	public default double calculateCarInsurrance(double amount) {
		return this.taxes(amount)+ amount;
		
	}

	
}
