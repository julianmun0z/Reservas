package co.com.ceiba.reserva.dominio.service.implement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ceiba.reserva.dominio.entity.BillEntity;
import co.com.ceiba.reserva.dominio.repository.BillEntityRepository;
import co.com.ceiba.reserva.dominio.service.BillEntityService;

@Service
public class BillEntityServiceImplement implements BillEntityService {

	@Autowired
	private BillEntityRepository billRepository;
	
	@Override
	@Transactional
	public List<BillEntity>listar() {
		return billRepository.findAll();
	}

	@Override
	public BillEntity listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BillEntity add(BillEntity b) {
		
		return null;
	}

	@Override
	public BillEntity edit(BillEntity b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BillEntity delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
