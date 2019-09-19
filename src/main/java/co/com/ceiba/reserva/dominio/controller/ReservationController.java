package co.com.ceiba.reserva.dominio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.reserva.dominio.entity.ReservationEntity;
import co.com.ceiba.reserva.dominio.service.ReservationEntityService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value = "/reservation")
public class ReservationController {
	
	@Autowired
	ReservationEntityService service;
	
	@GetMapping
	public List<ReservationEntity>listar(){
	return service.listar();
	}
	
	@PostMapping
	 public ReservationEntity agregar(@RequestBody ReservationEntity reservation) {
		 return service.add(reservation);
	 }
	 
	 @GetMapping(path = {"/{id}"})
	    public ReservationEntity listarId(@PathVariable("id")int id){
	        return service.listarId(id);
	        
	    }
	    @PutMapping(path = {"/{id}"})
	    public ReservationEntity editar(@RequestBody ReservationEntity bill,@PathVariable("id") int id){
	       bill.setId(id);
	        return service.edit(bill);
	    }
	    @DeleteMapping(path = {"/{id}"})
	    public ReservationEntity delete(@PathVariable("id") int  id){
	        return service.delete(id);
	    }
	
	

}
