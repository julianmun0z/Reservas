package co.com.ceiba.reserva.dominio.service;

import java.util.List;

import co.com.ceiba.reserva.dominio.entity.ClientEntity;

public interface ClientEntityService {
List<ClientEntity>listar();
ClientEntity listarId(int id);
ClientEntity add(ClientEntity id);
ClientEntity edit(ClientEntity id);
ClientEntity delete(int id);
}
