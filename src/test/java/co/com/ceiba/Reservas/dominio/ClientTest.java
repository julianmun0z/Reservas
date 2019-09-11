package co.com.ceiba.Reservas.dominio;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import co.com.ceiba.Reservas.testdatabuilder.ClientTestDataBuilder;
import co.com.ceiba.reserva.dominio.Client;

public class ClientTest {

	private static final String FIRSTNAME = "juan";
	private static final String LASTNAME = "gomez";
	private static final String EMAIL = "J@J.COM";
	private static final String PHONENUMBER = "123456789";
	

	@Test
	public void createClientTest() {

		// arrange
		ClientTestDataBuilder clientTestDataBuilder = new ClientTestDataBuilder()
				.whitFirstName(FIRSTNAME)
				.whitLastName(LASTNAME)
				.whiteEmail(EMAIL)
				.whitePhoneNumber(PHONENUMBER);
		//act
		Client client = clientTestDataBuilder.build();
		
		//assert
		assertEquals(FIRSTNAME, client.getFirstName());
		assertEquals(LASTNAME, client.getLastNmae());
		assertEquals(EMAIL, client.getEmail());
		assertEquals(PHONENUMBER, client.getPhoneNumber());
		
		
	}
	
	

}
