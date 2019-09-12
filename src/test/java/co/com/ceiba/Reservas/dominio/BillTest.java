package co.com.ceiba.Reservas.dominio;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import co.com.ceiba.Reservas.testdatabuilder.BillTestDataBuilder;
import co.com.ceiba.reserva.dominio.Bill;
import co.com.ceiba.reserva.dominio.Reservation;
import static org.mockito.BDDMockito.*;

public class BillTest {
	private static final int NUMBER_PEOPLE = 5;
	private static final float PRICE = 350000;
	private static final int DISCOUNTFORPEOPLE = 15;
	private static final int DISCOUNTFORDAYS = 20;



	@Spy
	private Reservation reservation;

	@InjectMocks
	private Bill bill = new Bill();
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
	}

	@Test
	public void createBillTest() {

		// arrange
		BillTestDataBuilder billTestDataBuilder = new BillTestDataBuilder().whitePrice(PRICE)
				.whiteDiscountForPeople(DISCOUNTFORPEOPLE).whiteDiscountForDays(DISCOUNTFORDAYS);

		// act
		Bill bill = billTestDataBuilder.build();

		// assert
		assertEquals(PRICE, bill.getPrice(), 0);
		assertEquals(DISCOUNTFORPEOPLE, bill.getDiscountForPeople());
		assertEquals(DISCOUNTFORDAYS, bill.getDiscpuntForDays());
	}

	@Test
	public void discountForFivePeopleOrMore() {

		// arrange
	
		given(reservation.getNumberPeople()).willReturn(NUMBER_PEOPLE);
		//reservation=new Reservation();
		reservation.setNumberPeople(NUMBER_PEOPLE);
		bill.setDiscountForPeople(DISCOUNTFORPEOPLE);
		bill.setPrice(PRICE);
		bill.setReservation(reservation);
	
		float pricewhitheDiscount = 297500;

		// act

		float newPrice = bill.discountForFivePeopleOrMore();

		// assert
		assertEquals(pricewhitheDiscount, newPrice, 0);
	}

}
