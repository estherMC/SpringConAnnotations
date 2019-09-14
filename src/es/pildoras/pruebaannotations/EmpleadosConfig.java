package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//SPRING-14: Creamos clase de configuración Spring para sustituir XML
@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
//SPRING-16: Indicamos nuevo archivo de propiedades
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	//SPRING-15: Definir el bean para InformeFinancieroDtoCompras: deberá devolver interface
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras () {
		return new InformeFinancieroDtoCompras();
	}
	
	//SPRING-15: Definir el bean para DirectorFinanciero e inyectar dependencias: deberá devolver interface
	@Bean
	public Empleados directorFinanciero () {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
	
	
}
