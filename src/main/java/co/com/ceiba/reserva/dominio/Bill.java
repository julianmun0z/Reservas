package co.com.ceiba.reserva.dominio;

import co.com.ceiba.reserva.dominio.Reservation;

public class Bill {

	private float price;
	private int discountForPeople;
	private int discpuntForDays;
	private Reservation reservation;

	public Bill() {
		super();
	}

	public Bill(float price, int discountForPeople, int discpuntForDays, Reservation reservation) {
		super();
		this.price = price;
		this.discountForPeople = discountForPeople;
		this.discpuntForDays = discpuntForDays;
		this.reservation = reservation;
		

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

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public float discountForFivePeopleOrMore() {
		if (reservation.getNumberPeople() >= 5) {
			discountForPeople *= price / 100;
			price -= discountForPeople;

		}
		return price;

	}

	public float discountForTuesdayAndWednesday() {
		if (reservation.getReservationDate().getDay() == 2 || reservation.getReservationDate().getDay() == 3) {
			discpuntForDays *= price / 100;
			price = discpuntForDays;
		}
		return price;
	}

	public float conditionForThedaysTuesdayWednesdayFridaySaturday() {
		if (reservation.getReservationDate().getDay() == 2 || reservation.getReservationDate().getDay() == 3) {
			discpuntForDays *= price / 100;
			price = discpuntForDays;

			return price;

		} else if (reservation.getReservationDate().getDay() == 5
				&& reservation.differenceBetweenCurrentDateAndReservationDate(null, null) >= 15) {

			return price;

		} else if (reservation.getReservationDate().getDay() == 6
				&& reservation.differenceBetweenCurrentDateAndReservationDate(null, null) >= 15) {

			return price;

		} else if (reservation.getReservationDate().getDay() == 5
				&& reservation.differenceBetweenCurrentDateAndReservationDate(null, null) < 15) {

			return price = 0;

		} else if (reservation.getReservationDate().getDay() == 6
				&& reservation.differenceBetweenCurrentDateAndReservationDate(null, null) < 15) {

			return price = 0;

		} else {

			return price;
		}

	}

	public float decorForReservation() {
		if (reservation.isDecor() == true) {

			price += 30000;

		}
		return price;

	}

}
