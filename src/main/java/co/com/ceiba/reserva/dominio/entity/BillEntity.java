package co.com.ceiba.reserva.dominio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class BillEntity {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private float price;
	@Column(name = "discountforpeople")
	private int discountForPeople;
	@Column(name = "discpuntfordays")
	private int discpuntForDays;
	
	@OneToOne
    @JoinColumn(name = "fk_reservation")
	private ReservationEntity reservationEntity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
