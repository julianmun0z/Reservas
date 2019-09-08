package co.com.ceiba.reserva.dominio;

import co.com.ceiba.reserva.dominio.Reservation;

public class Bill {

	private float price;
	private int discountForPeople;
	private int discpuntForDays;

	

	



	public Bill(float price, int discountForPeople, int discpuntForDays, Reservation reservation) {
		this.price = price;
		this.discountForPeople = discountForPeople;
		this.discpuntForDays = discpuntForDays;
		
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getDiscountForPeople() {
		return discountForPeople;
	}

	public void setDiscountForPeople(int discountForPeople) {
		this.discountForPeople = discountForPeople;
	}

	public int getDiscpuntForDays() {
		return discpuntForDays;
	}

	public void setDiscpuntForDays(int discpuntForDays) {
		this.discpuntForDays = discpuntForDays;
	}



}