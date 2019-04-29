package phoneBook;

public class Address {
	private String city;
	private String state;
	private String country;
	private String areaCode;
	
	
	public Address () {
		
	}
	public Address (String city, String state, String country, String areaCode) {
		this.areaCode=areaCode;
		this.city=city;
		this.country=country;
		this.state=state;
	}
	public String getCity() {
		return this.city;
		
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state=state;
	}
	public String getCountry () {
		return this.country;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public String getAreaCode () {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode=areaCode;
	}

}
