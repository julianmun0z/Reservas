package co.com.ceiba.Reservas.dominio.service.implement;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.ceiba.Reservas.dominio.entity.BillEntity;
import co.com.ceiba.Reservas.dominio.repository.BillEntityRepository;
import co.com.ceiba.Reservas.dominio.service.BillEntityService;

@Service
public class BillEntityServiceImplement implements BillEntityService {

	@Autowired
	private BillEntityRepository billRepository;

	@Override
	@Transactional
	public List<BillEntity> listar() {
		return billRepository.findAll();
	}

	@Override
	public BillEntity listarId(int id) {
		return billRepository.findAllById(id);
	}

	@Override
	public BillEntity add(BillEntity bill) {
		return billRepository.save(bill);
	}

	@Override
	public BillEntity edit(BillEntity bill) {
		return billRepository.save(bill);
	}

	@Override
	public BillEntity delete(int id) {
		BillEntity bill=billRepository.findAllById(id);
		if(bill!=null) {
		 billRepository.delete(bill);
		}
		return bill;
	}

}
