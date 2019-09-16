package co.com.ceiba.reserva.dominio.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.ceiba.reserva.dominio.entity.ClientEntity;
import co.com.ceiba.reserva.dominio.repository.ClienteEntityRepository;
import co.com.ceiba.reserva.dominio.service.ClientEntityService;

public class ClientEntityServiceImplenet implements ClientEntityService {
	
	@Autowired
	private ClienteEntityRepository clienteEntityRepository;
	
	@Override
	public List<ClientEntity> listar() {
		return clienteEntityRepository.finnAll();
	}

	@Override
	public ClientEntity listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientEntity add(ClientEntity id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientEntity edit(ClientEntity id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientEntity delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
