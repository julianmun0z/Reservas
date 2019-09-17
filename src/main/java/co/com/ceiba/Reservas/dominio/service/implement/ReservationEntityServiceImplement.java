package co.com.ceiba.Reservas.dominio.service.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.ceiba.Reservas.dominio.entity.ReservationEntity;
import co.com.ceiba.Reservas.dominio.repository.ReservationEntityResporsitory;
import co.com.ceiba.Reservas.dominio.service.ReservationEntityService;

@Service
public class ReservationEntityServiceImplement implements ReservationEntityService {

	@Autowired
	private ReservationEntityResporsitory reservationRepository;
	
	@Override
	public List<ReservationEntity> listar() {
		return reservationRepository.findAll();
	}

	@Override
	public ReservationEntity listarId(int id) {
		return reservationRepository.findAllById(id);
	}

	@Override
	public ReservationEntity add(ReservationEntity reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public ReservationEntity edit(ReservationEntity reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public ReservationEntity delete(int id) {
		ReservationEntity reservation = reservationRepository.findAllById(id);
		if(reservation!=null) {
			reservationRepository.delete(reservation);
		}
		return reservation;
	}

}
