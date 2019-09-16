package co.com.ceiba.reserva.dominio.repository;

import java.util.List;
import org.springframework.data.repository.Repository;
import co.com.ceiba.reserva.dominio.entity.ClientEntity;

public interface ClienteEntityRepository extends Repository<ClientEntity, Integer> {
	List<ClientEntity> finnAll();

	ClientEntity findOne(int id);

	ClientEntity save(ClientEntity c);

	void delete(ClientEntity c);
}
