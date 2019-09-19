package co.com.ceiba.Reservas.dominio.service.implement;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.ceiba.Reservas.dominio.entity.ClientEntity;
import co.com.ceiba.Reservas.dominio.repository.ClientEntityRepository;
import co.com.ceiba.Reservas.dominio.service.ClientEntityService;

@Service
public class ClientEntityServiceImplent implements ClientEntityService{

	@Autowired
	private  ClientEntityRepository clientRepository;
	
	
	@Override
	@Transactional
	public List<ClientEntity> listar() {
		return clientRepository.findAll();
	}

	@Override
	public ClientEntity listarId(int id) {
		return clientRepository.findAllById(id);
	}

	@Override
	public ClientEntity add(ClientEntity client) {
		return clientRepository.save(client);
	}

	@Override
	public ClientEntity edit(ClientEntity client) {
		return clientRepository.save(client);
	}

	@Override
	public ClientEntity delete(int id) {
		ClientEntity client=clientRepository.findAllById(id);
		if(client!=null) {
			clientRepository.delete(client);
		}
		return client;
	}

}
