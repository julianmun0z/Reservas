package co.com.ceiba.Reservas.dominio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import co.com.ceiba.Reservas.dominio.entity.BillEntity;

public interface BillEntityRepository extends JpaRepository<BillEntity, Integer> {

	List<BillEntity> findAll();

	//BillEntity findOne(int id);

	BillEntity save(BillEntity b);

	void delete(BillEntity b);
}
