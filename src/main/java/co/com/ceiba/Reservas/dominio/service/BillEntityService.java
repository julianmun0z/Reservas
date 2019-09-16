package co.com.ceiba.Reservas.dominio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.com.ceiba.Reservas.dominio.entity.BillEntity;


public interface BillEntityService {
	List<BillEntity>listar(); 
	BillEntity listarId(int id);
	BillEntity add(BillEntity b);
	BillEntity edit(BillEntity b);
	BillEntity delete(int id);
}
