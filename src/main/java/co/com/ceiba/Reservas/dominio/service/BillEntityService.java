package co.com.ceiba.Reservas.dominio.service;

import java.util.List;
import co.com.ceiba.Reservas.dominio.entity.BillEntity;


public interface BillEntityService {
	List<BillEntity>listar(); 
	BillEntity listarId(int id);
	BillEntity add(BillEntity bill);
	BillEntity edit(BillEntity bill);
	BillEntity delete(int id);
}
