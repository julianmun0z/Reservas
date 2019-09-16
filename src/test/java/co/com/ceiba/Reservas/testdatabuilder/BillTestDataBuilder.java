package co.com.ceiba.Reservas.testdatabuilder;

import co.com.ceiba.reserva.dominio.Bill;

public class BillTestDataBuilder {

	private static final float PRICE = 350000;
	private static final int DISCOUNTFORPEOPLE = 15;
	private static final int DISCOUNTFORDAYS = 20;

	private float price;
	private int discountForPeople;
	private int discpuntForDays;

	public BillTestDataBuilder() {
		this.price = PRICE;
		this.discountForPeople = DISCOUNTFORPEOPLE;
		this.discpuntForDays = DISCOUNTFORDAYS;

	}

	public BillTestDataBuilder whitePrice(float price) {
		this.price = price;
		return this;

	}

	public BillTestDataBuilder whiteDiscountForPeople(int discountPeople) {
		this.discountForPeople = discountPeople;
		return this;

	}

	public BillTestDataBuilder whiteDiscountForDays(int discountDays) {
		this.discpuntForDays = discountDays;
		return this;

	}

	public Bill build() {
		return new Bill(price, discountForPeople, discpuntForDays, null);
	}
}
