package co.com.ceiba.Reservas.dominio;

import java.util.Date;

public class Reservation {

	private Date reservationDate;
	private int numberPeople;
	private boolean decor;

	Date currentDate = new Date();

	public Reservation() {
		
	}

	public Reservation(Date reservationDate, int numberPeople, boolean decor) {
		this.reservationDate = reservationDate;
		this.numberPeople = numberPeople;
		this.decor = decor;
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


	public boolean isDecor() {
		return decor;
	}

	public void setDecor(boolean decor) {
		this.decor = decor;
	}

	public long differenceBetweenCurrentDateAndReservationDate(Date currentDate, Date reservationDate) {
		long difference;
		 difference = (reservationDate.getTime() - currentDate.getTime()) / 86400000;
		return difference;
	}
	

}