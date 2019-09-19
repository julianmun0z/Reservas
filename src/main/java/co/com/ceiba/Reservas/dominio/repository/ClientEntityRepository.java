package co.com.ceiba.Reservas.dominio.repository;

import java.util.List;

import org.springframework.data.repository.Repository;
import co.com.ceiba.Reservas.dominio.entity.ClientEntity;

public interface ClientEntityRepository extends Repository<ClientEntity, Integer> {

	List<ClientEntity> findAll();

	ClientEntity findAllById(int id);

	ClientEntity save(ClientEntity client);
	
	void delete(ClientEntity client);
}
