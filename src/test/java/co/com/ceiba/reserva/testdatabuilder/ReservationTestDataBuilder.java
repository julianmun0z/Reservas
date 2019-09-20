package co.com.ceiba.reserva.testdatabuilder;

import java.util.Date;

import co.com.ceiba.reserva.dominio.Reservation;

public class ReservationTestDataBuilder {
	
	private static final Date RESERVATIONDATE = new Date(02-02-2019);
	private static final int NUMBERPEOPLE = 5;
	private static final boolean DECOR = true;
	
	private Date reservationDate;
	private int numberPeople;
	private boolean decor;
	
	
	public ReservationTestDataBuilder() {
		this.reservationDate = RESERVATIONDATE;
		this.numberPeople = NUMBERPEOPLE;
		this.decor = DECOR;
	}
	
	public ReservationTestDataBuilder whitReservation(Date reservationDate) {
		this.reservationDate = reservationDate;
		return this;
		
	}
	
	public ReservationTestDataBuilder whitNumberPeople(int numberPeople) {
		this.numberPeople = numberPeople;
		return this;
		
	}
	
	public ReservationTestDataBuilder whiteDecor(boolean decor) {
		this.decor = decor;
		return this;
	}

	
	public Reservation buil() {
		return new Reservation(this.reservationDate, this.numberPeople, false);
	}


	
}
