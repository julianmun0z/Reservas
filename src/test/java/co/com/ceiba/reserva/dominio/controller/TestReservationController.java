package co.com.ceiba.reserva.dominio.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

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

import co.com.ceiba.reserva.dominio.Reservation;
import co.com.ceiba.reserva.dominio.builder.ReservationBuilder;
import co.com.ceiba.reserva.dominio.entity.ReservationEntity;
import co.com.ceiba.reserva.testdatabuilder.ReservationTestDataBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestReservationController {

	
	@Autowired
	private MockMvc mvc;
	
	Reservation reservation = new ReservationTestDataBuilder()
			.whitReservation(new Date(2019-03-02))
			.whitNumberPeople(5)
			.whiteDecor(false)
			.buil();
		
	ReservationEntity reservationEntity = ReservationBuilder.convertEntity(reservation); 


	@Test
	public void createReservation() throws Exception
	{
		mvc.perform( MockMvcRequestBuilders
			      .post("/reservation")
			      .content(asJsonString(reservationEntity))
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
	public void getReservation() throws Exception
	{
	  mvc.perform( MockMvcRequestBuilders
	      .get("/reservation")
	      .accept(MediaType.APPLICATION_JSON))
	      .andDo(print())
	      .andExpect(status().isOk());  
	}
	
	@Test
	public void getReservationId() throws Exception
	{
	  mvc.perform( MockMvcRequestBuilders
	      .get("/reservation/{id}", 1)
	      .accept(MediaType.APPLICATION_JSON))
	      .andDo(print())
	      .andExpect(status().isOk());
	}
	
	
	@Test
	public void updateBill() throws Exception
	{
	  mvc.perform( MockMvcRequestBuilders
	      .put("/reservation/{id}", 2)
	      .content(asJsonString(reservationEntity))
	      .contentType(MediaType.APPLICATION_JSON)
	      .accept(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk())
	     // .andExpect(MockMvcResultMatchers.jsonPath("$.Reservation").value(2019-03-02))
	      .andExpect(MockMvcResultMatchers.jsonPath("$.numberPeople").value(5))
	      .andExpect(MockMvcResultMatchers.jsonPath("$.decor").value(false));
	}
	
	@Test
	public void deleteReservation() throws Exception
	{
	  mvc.perform( MockMvcRequestBuilders.delete("/reservation/{id}", 1) )
	        .andExpect(status().isOk());
	}
}




