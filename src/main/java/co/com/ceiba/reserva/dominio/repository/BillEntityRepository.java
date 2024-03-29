package co.com.ceiba.reserva.dominio.repository;

import java.util.List;
import org.springframework.data.repository.Repository;

import co.com.ceiba.reserva.dominio.entity.BillEntity;

public interface BillEntityRepository extends Repository<BillEntity, Integer> {

	List<BillEntity> findAll();

	BillEntity findAllById(int id);

	BillEntity save(BillEntity bill);

	void delete(BillEntity bill);
}
