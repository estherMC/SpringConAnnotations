package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//SPRING-14: Creamos clase de configuración Spring para sustituir XML
@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
public class EmpleadosConfig {

}
