package co.com.ceiba.Reservas.dominio.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "reservation")
public class ReservationEntity {

	@Id
	@Column(name = "id_reservation")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "reservationdate")
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	private Date reservationDate;
	@Column(name = "numberpeople")
	private int numberPeople;
	@Column
	private boolean decor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
