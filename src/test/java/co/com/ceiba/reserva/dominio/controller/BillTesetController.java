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
import co.com.ceiba.reserva.dominio.Bill;
import co.com.ceiba.reserva.dominio.builder.BillBuilder;
import co.com.ceiba.reserva.dominio.entity.BillEntity;
import co.com.ceiba.reserva.testdatabuilder.BillTestDataBuilder;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

public class BillTesetController {

	
	
	@Autowired
	private MockMvc mvc;

	Bill bill = new BillTestDataBuilder().
	whitePrice(5000).whiteDiscountForPeople(5).whiteDiscountForDays(10).build();

BillEntity bills = BillBuilder.convertEntity(bill);
	
	@Test
	public void createBill() throws Exception
	{
	  mvc.perform( MockMvcRequestBuilders
	      .post("/bill")
	      .content(asJsonString(bills))
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
	public void getBill() throws Exception
	{
	  mvc.perform( MockMvcRequestBuilders
	      .get("/bill")
	      .accept(MediaType.APPLICATION_JSON))
	      .andDo(print())
	      .andExpect(status().isOk());  
	}
	
	@Test
	public void getBillId() throws Exception
	{
	  mvc.perform( MockMvcRequestBuilders
	      .get("/bill/{id}", 1)
	      .accept(MediaType.APPLICATION_JSON))
	      .andDo(print())
	      .andExpect(status().isOk());
	}
	
	@Test
	public void updateBill() throws Exception
	{
	  mvc.perform( MockMvcRequestBuilders
	      .put("/bill/{id}", 2)
	      .content(asJsonString(bills))
	      .contentType(MediaType.APPLICATION_JSON)
	      .accept(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk())
	      .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(5000))
	      .andExpect(MockMvcResultMatchers.jsonPath("$.discountForPeople").value(5))
	      .andExpect(MockMvcResultMatchers.jsonPath("$.discpuntForDays").value(10));
	}
	
	
	@Test
	public void deletebill() throws Exception
	{
	  mvc.perform( MockMvcRequestBuilders.delete("/bill/{id}", 1) )
	        .andExpect(status().isOk());
	}
	
	
}
