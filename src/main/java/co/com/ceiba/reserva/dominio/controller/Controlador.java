package co.com.ceiba.reserva.dominio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.reserva.dominio.entity.BillEntity;
import co.com.ceiba.reserva.dominio.service.BillEntityService;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/billEntity"})
public class Controlador {

	@Autowired
	BillEntityService billEntityService;
	
	@GetMapping
	public List<BillEntity>listar(){
		return billEntityService.listar();
	}
}
