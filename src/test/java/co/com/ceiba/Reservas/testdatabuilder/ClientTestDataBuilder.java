package co.com.ceiba.Reservas.testdatabuilder;

import co.com.ceiba.reserva.dominio.Client;

public class ClientTestDataBuilder {

	private static final String FIRSTNAME = "juan";
	private static final String LASTNAME = "gomez";
	private static final String EMAIL = "J@J.COM";
	private static final String PHONENUMBER = "123456789";

	private String firstName;
	private String lastNmae;
	private String Email;
	private String phoneNumber;

	public ClientTestDataBuilder() {
		this.firstName = FIRSTNAME;
		this.lastNmae = LASTNAME;
		this.Email = EMAIL;
		this.phoneNumber = PHONENUMBER;
	}

	public ClientTestDataBuilder whitFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public ClientTestDataBuilder whitLastName(String lastName) {
		this.lastNmae = lastName;
		return this;

	}

	public ClientTestDataBuilder whiteEmail(String email) {
		this.Email = email;
		return this;
	}

	public ClientTestDataBuilder whitePhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;

	}

	public Client build() {
		return new Client(this.firstName, this.lastNmae, this.Email, this.phoneNumber);

	}

}
