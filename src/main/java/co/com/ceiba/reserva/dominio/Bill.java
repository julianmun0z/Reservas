package co.com.ceiba.reserva.dominio;

import java.util.Calendar;

import co.com.ceiba.reserva.dominio.Reservation;

public class Bill {

	private float price;
	private int discountForPeople;
	private int discpuntForDays;
	private Reservation reservation;

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
	
	public float discountForFivePeopleOrMore() {
		if(reservation.getNumberPeople()>=5) {
			discountForPeople*=price/100;
			price-=discountForPeople;
		}
		return price;
	}
	
	
	
	
	}



