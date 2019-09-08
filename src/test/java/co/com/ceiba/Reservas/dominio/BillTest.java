package co.com.ceiba.Reservas.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.com.ceiba.Reservas.testdatabuilder.BillTestDataBuilder;
import co.com.ceiba.reserva.dominio.Bill;

public class BillTest {
	private static final float PRICE=350000;
	private static final int DISCOUNTFORPEOPLE= 15;
	private static final int DISCOUNTFORDAYS = 20;
	
	
	@Test
	public void createBillTest() {
		
		
		//arrange
		BillTestDataBuilder billTestDataBuilder = new BillTestDataBuilder()
        .whitePrice(PRICE)
        .whiteDiscountForPeople(DISCOUNTFORPEOPLE)
        .whiteDiscountForDays(DISCOUNTFORDAYS);
		
		//act
		Bill bill = billTestDataBuilder.build();
		
		//assert
		assertEquals(PRICE, bill.getPrice(),0);
		assertEquals(DISCOUNTFORPEOPLE, bill.getDiscountForPeople());
		assertEquals(DISCOUNTFORDAYS, bill.getDiscpuntForDays());
	}
}

