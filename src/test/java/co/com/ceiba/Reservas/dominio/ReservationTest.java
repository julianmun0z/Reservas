package co.com.ceiba.Reservas.dominio;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import co.com.ceiba.Reservas.testdatabuilder.ReservationTestDataBuilder;
import co.com.ceiba.reserva.dominio.Reservation;

public class ReservationTest {
	private static final Date CURRENTDATE = new Date(2019-1900,8,9);
	private static final Date RESERVATIONDATE = new Date(2019-1900,8,24);
	private static final int NUMBERPEOPLE = 5;
	
	@InjectMocks
	private Reservation reservation = new Reservation();
	
	@Before
	public void sutUp() {
		MockitoAnnotations.initMocks(Reservation.class);
	}
	
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
	
	@Test
	public void  differenceBetweenCurrentDateAndReservationDate() {
	
		//arrange
		Date  reservationDate = RESERVATIONDATE;
		Date currentDate = CURRENTDATE;
		long withDifference = 15;
		
		// act
		long newDate = reservation.differenceBetweenCurrentDateAndReservationDate(currentDate,reservationDate);
		// assert
		
		assertEquals(withDifference, newDate,0);
	}

}
