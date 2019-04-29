package phoneBook;

public class PhoneNumber {
	private String phoneAreaCode;
	private String phoneLocalNumber;
	
	public PhoneNumber () {
		
	}
	
	public PhoneNumber(String phoneAreaCode, String phoneLocalNumber){
		this.phoneAreaCode=phoneAreaCode;
		this.phoneLocalNumber=phoneLocalNumber;
	}
	public String getPhoneAreaCode() {
		return this.phoneAreaCode;
	}
	public void setPhoneAreaCode(String phoneAreaCode) {
		this.phoneAreaCode=phoneAreaCode;
	}
	public String getPhoneLocalNumber() {
		return this.phoneLocalNumber;
	}
	public void setPhoneLocalNumber(String phoneLocalNumber) {
		this.phoneLocalNumber=phoneLocalNumber;
	}

}
