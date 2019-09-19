package co.com.ceiba.reserva.dominio.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import co.com.ceiba.reserva.dominio.entity.ReservationEntity;

public interface ReservationEntityResporsitory extends Repository<ReservationEntity, Integer> {

	List<ReservationEntity> findAll();
	
	ReservationEntity findAllById(int id);
	
	ReservationEntity save(ReservationEntity reservation);
	
	void delete(ReservationEntity reservation);
}
