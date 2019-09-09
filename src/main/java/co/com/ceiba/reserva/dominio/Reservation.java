package co.com.ceiba.reserva.dominio;

import java.util.Date;

public class Reservation {

	private Date reservationDate;
	private int numberPeople;
	
	
	public Reservation(Date reservationDate, int numberPeople) {
		super();
		this.reservationDate = reservationDate;
		this.numberPeople = numberPeople;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public int getNumberPeople() {
		return numberPeople;
	}

	public void setNumberPeople(int numberPeople) {
		this.numberPeople = numberPeople;
	}

	
	
	
}