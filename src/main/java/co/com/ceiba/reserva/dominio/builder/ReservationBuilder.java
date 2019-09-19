package co.com.ceiba.reserva.dominio.builder;

import co.com.ceiba.reserva.dominio.Reservation;
import co.com.ceiba.reserva.dominio.entity.ReservationEntity;

public class ReservationBuilder {

	private ReservationBuilder() {}
	
	public static Reservation convertDomain(ReservationEntity reservationEntity) {
		
		Reservation reservation = null;
		
		if(reservationEntity != null) {
			reservation = new Reservation(reservationEntity.getReservationDate(), reservationEntity.getNumberPeople(), reservationEntity.isDecor());
		}
		
		return reservation;
	}
	
	public static ReservationEntity convertEntity(Reservation reservation) {
		
		ReservationEntity reservationEntity = new ReservationEntity();
		
		reservationEntity.setReservationDate(reservation.getReservationDate());
		reservationEntity.setNumberPeople(reservation.getNumberPeople());
		reservationEntity.setDecor(reservation.isDecor());
		
		return reservationEntity;
		
	}
}
