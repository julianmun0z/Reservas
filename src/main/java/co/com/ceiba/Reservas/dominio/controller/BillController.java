package co.com.ceiba.Reservas.dominio.controller;

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
import co.com.ceiba.Reservas.dominio.entity.BillEntity;
import co.com.ceiba.Reservas.dominio.service.BillEntityService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value = "/bill")
public class BillController {

	@Autowired
	BillEntityService service;

	@GetMapping
	public List<BillEntity> listar() {
		return service.listar();
	}
	
	 @PostMapping
	 public BillEntity agregar(@RequestBody BillEntity bill) {
		 return service.add(bill);
	 }
	 
	 @GetMapping(path = {"/{id}"})
	    public BillEntity listarId(@PathVariable("id")int id){
	        return service.listarId(id);
	        
	    }
	    @PutMapping(path = {"/{id}"})
	    public BillEntity editar(@RequestBody BillEntity bill,@PathVariable("id") int id){
	       bill.setId(id);
	        return service.edit(bill);
	    }
	    @DeleteMapping(path = {"/{id}"})
	    public BillEntity delete(@PathVariable("id") int  id){
	        return service.delete(id);
	    }
	 
	
	 
}