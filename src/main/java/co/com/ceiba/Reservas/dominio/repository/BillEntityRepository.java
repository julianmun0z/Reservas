package co.com.ceiba.Reservas.dominio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ceiba.Reservas.dominio.entity.BillEntity;

public interface BillEntityRepository extends JpaRepository<BillEntity, Integer> {

	List<BillEntity> findAll();

	BillEntity findAllById(int id);

	BillEntity save(BillEntity bill);

	void delete(BillEntity bill);
}
