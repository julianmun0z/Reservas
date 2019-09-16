package co.com.ceiba.reserva.dominio.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.status.Status;
import co.com.ceiba.reserva.dominio.entity.BillEntity;
import co.com.ceiba.reserva.dominio.service.BillEntityService;

@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
@RestController


@RequestMapping(value =  "/bill",produces  =  "application / json" ,method = RequestMethod.GET)

@ResponseStatus(value = HttpStatus.OK)


public class Controlador {
	
	@Autowired
	BillEntityService service;
	
	
	 @GetMapping
	    public List<BillEntity>listar(){
		 	
		 		return service.listar();
		 		    		
	    }
}
