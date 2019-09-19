package co.com.ceiba.reserva.dominio.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import co.com.ceiba.reserva.dominio.entity.ClientEntity;

public interface ClientEntityRepository extends Repository<ClientEntity, Integer> {

	List<ClientEntity> findAll();

	ClientEntity findAllById(int id);

	ClientEntity save(ClientEntity client);
	
	void delete(ClientEntity client);
}
