package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//SPRING-14: Creamos clase de configuraci�n Spring para sustituir XML
@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
public class EmpleadosConfig {

	//SPRING-15: Definir el bean para InformeFinancieroDtoCompras: deber� devolver interface
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras () {
		return new InformeFinancieroDtoCompras();
	}
	
	//SPRING-15: Definir el bean para DirectorFinanciero e inyectar dependencias: deber� devolver interface
	@Bean
	public Empleados directorFinanciero () {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
	
	
}
