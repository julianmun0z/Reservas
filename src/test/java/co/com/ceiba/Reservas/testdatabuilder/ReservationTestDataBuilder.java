package co.com.ceiba.Reservas.testdatabuilder;

import java.util.Date;

import co.com.ceiba.reserva.dominio.Reservation;

public class ReservationTestDataBuilder {
	
	private static final Date RESERVATIONDATE = new Date(02-02-2019);
	private static final int NUMBERPEOPLE = 5;
	
	private Date reservationDate;
	private int numberPeople;
	
	
	public ReservationTestDataBuilder() {
		this.reservationDate = RESERVATIONDATE;
		this.numberPeople = NUMBERPEOPLE;
	}
	
	public ReservationTestDataBuilder whitReservation(Date reservationDate) {
		this.reservationDate = reservationDate;
		return this;
		
	}
	
	public ReservationTestDataBuilder whitNumberPeople(int numberPeople) {
		this.numberPeople = numberPeople;
		return this;
		
	}

	
	public Reservation buil() {
		return new Reservation(this.reservationDate, this.numberPeople, false);
	}
	
}
