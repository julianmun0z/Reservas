package co.com.ceiba.Reservas.dominio.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(BillController.class)
public class TestBillController {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void listarAPI() throws Exception
	{
		mvc.perform(MockMvcRequestBuilders
				.get("").accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.bill").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$.bill[*].bill").isNotEmpty());
	}
	
}
