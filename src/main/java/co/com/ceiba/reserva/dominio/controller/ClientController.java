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

import co.com.ceiba.reserva.dominio.entity.ClientEntity;
import co.com.ceiba.reserva.dominio.service.ClientEntityService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value = "/client")
public class ClientController {

	@Autowired
	ClientEntityService service;

	@GetMapping
	public List<ClientEntity> listar() {
		return service.listar();
	}

	@PostMapping
	public ClientEntity agregar(@RequestBody ClientEntity client) {
		return service.add(client);
	}

	@GetMapping(path = { "/{id}" })
	public ClientEntity listarId(@PathVariable("id") int id) {
		return service.listarId(id);
	}

	@PutMapping(path = { "/{id}" })
	public ClientEntity editar(@RequestBody ClientEntity client, @PathVariable("id") int id) {
		client.setId(id);
		return service.edit(client);
	}

	@DeleteMapping(path = { "/{id}" })
	public ClientEntity delete(@PathVariable("id") int id) {
		return service.delete(id);
	}

}
