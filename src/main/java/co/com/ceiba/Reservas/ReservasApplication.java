package co.com.ceiba.Reservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import co.com.ceiba.Reservas.dominio.controller.BillController;



@SpringBootApplication
//@ComponentScan(basePackageClasses = Controlador.class)
//@EntityScan("com.delivery.domain")
//@EnableJpaRepositories("com.delivery.repository")
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableJpaRepositories
public class ReservasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservasApplication.class, args);
	}

}
