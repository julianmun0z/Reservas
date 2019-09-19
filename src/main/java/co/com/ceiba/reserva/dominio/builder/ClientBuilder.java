package co.com.ceiba.reserva.dominio.builder;

import co.com.ceiba.reserva.dominio.Client;
import co.com.ceiba.reserva.dominio.entity.ClientEntity;

public class ClientBuilder {
	
	private ClientBuilder() {}
	
	public static Client convertDomain(ClientEntity clientEntity) {
		
		Client client = null;
		
		if(clientEntity != null) {
			client = new Client(clientEntity.getFirstName(), clientEntity.getLastName(), clientEntity.getEmail(), clientEntity.getPhoneNumber());						
		}
		
		return client;
	}
	
	public static ClientEntity convertEntity(Client client) {
		
		ClientEntity clientEntity = new ClientEntity();
		
		clientEntity.setFirstName(client.getFirstName());
		clientEntity.setLastName(client.getLastName());
		clientEntity.setEmail(client.getEmail());
		clientEntity.setPhoneNumber(client.getPhoneNumber());
		
		return clientEntity;
		
	}

}
