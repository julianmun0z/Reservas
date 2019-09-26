package co.com.ceiba.reserva.dominio.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.ceiba.reserva.dominio.Client;
import co.com.ceiba.reserva.dominio.builder.ClientBuilder;
import co.com.ceiba.reserva.dominio.entity.ClientEntity;
import co.com.ceiba.reserva.testdatabuilder.ClientTestDataBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ClientTestController {

	
	@Autowired
	private MockMvc mvc;
	
	Client client = new ClientTestDataBuilder()
			.whitFirstName("Juan")
			.whitLastName("Gomez")
			.whiteEmail("juan@g.com")
			.whitePhoneNumber("316-000-3456").build();
	
	ClientEntity clientEntitiy = ClientBuilder.convertEntity(client);
	
	
	
	
	@Test
	public void createClient() throws Exception
	{
		mvc.perform(MockMvcRequestBuilders
				.post("/client")
				.content(asJsonString(clientEntitiy))
			      .contentType(MediaType.APPLICATION_JSON)
			      .accept(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk());
	}


	public static String asJsonString(final Object obj) {
	    try {
	        return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}
	
	@Test
	public void getClient() throws Exception
	{
	  mvc.perform( MockMvcRequestBuilders
	      .get("/client")
	      .accept(MediaType.APPLICATION_JSON))
	      .andDo(print())
	      .andExpect(status().isOk());  
	}
	
	@Test
	public void getClientId() throws Exception
	{
	  mvc.perform( MockMvcRequestBuilders
	      .get("/client/{id}", 1)
	      .accept(MediaType.APPLICATION_JSON))
	      .andDo(print())
	      .andExpect(status().isOk());
	}
	
	
	@Test
	public void updateClient() throws Exception
	{
	  mvc.perform( MockMvcRequestBuilders
	      .put("/client/{id}", 2)
	      .content(asJsonString(client))
	      .contentType(MediaType.APPLICATION_JSON)
	      .accept(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk())
	      .andExpect(MockMvcResultMatchers.jsonPath("$.firstName").value("Juan"))
	      .andExpect(MockMvcResultMatchers.jsonPath("$.lastName").value("Gomez"))
	      .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("juan@g.com"))
	      .andExpect(MockMvcResultMatchers.jsonPath("$.phoneNumber").value("316-000-3456"));
	}

	@Test
	public void deleteClient() throws Exception
	{
	  mvc.perform( MockMvcRequestBuilders.delete("/client/{id}", 1) )
	        .andExpect(status().isOk());
	}
	
}