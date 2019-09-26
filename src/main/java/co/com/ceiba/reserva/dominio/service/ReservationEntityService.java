package co.com.ceiba.reserva.dominio.service;

import java.util.List;

import co.com.ceiba.reserva.dominio.entity.ReservationEntity;

public interface ReservationEntityService {

	List<ReservationEntity> listar();

	ReservationEntity listarId(int id);

	ReservationEntity add(ReservationEntity reservation);

	ReservationEntity edit(ReservationEntity reservation);

	ReservationEntity delete(int id);
}
