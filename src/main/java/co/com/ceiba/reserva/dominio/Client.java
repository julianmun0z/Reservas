package co.com.ceiba.reserva.dominio;

public class Client {
	
	private String firstName;
	private String lastNmae;
	private String Email;
	private String phoneNumber;
	
	
	

	public Client(String firstName, String lastNmae, String email, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastNmae = lastNmae;
		Email = email;
		this.phoneNumber = phoneNumber;
	}

	

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastNmae() {
		return lastNmae;
	}

	public void setLastNmae(String lastNmae) {
		this.lastNmae = lastNmae;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
