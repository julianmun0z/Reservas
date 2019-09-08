package co.com.ceiba.Reservas.dominio;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import co.com.ceiba.Reservas.testdatabuilder.ReservationTestDataBuilder;
import co.com.ceiba.reserva.dominio.Reservation;

public class ReservationTest {
	
	private static final Date RESERVATIONDATE = new Date(02-02-2019);
	private static final int NUMBERPEOPLE = 5;
	
	@Test
	public void createReservationTest() {
		//arrange
		ReservationTestDataBuilder reservationTestDataBuilder = new ReservationTestDataBuilder()
				.whitReservation(RESERVATIONDATE)
				.whitNumberPeople(NUMBERPEOPLE);
		
		//act
		Reservation reservation = reservationTestDataBuilder.buil();
		
		//assert
		assertEquals(RESERVATIONDATE, reservation.getReservationDate());
		assertEquals(NUMBERPEOPLE, reservation.getNumberPeople());
	}

}
