package co.com.ceiba.reserva.dominio.service;

import java.util.List;

import co.com.ceiba.reserva.dominio.entity.BillEntity;

public interface BillEntityService {
	List<BillEntity>listar(); 
	BillEntity listarId(int id);
	BillEntity add(BillEntity p);
	BillEntity edit(BillEntity p);
	BillEntity delete(int id);
}
