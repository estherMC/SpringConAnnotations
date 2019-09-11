package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {

		//SPRING-8: Proceso si usamos annotations:
		
		//1-Leer del XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//2-Pedir bean al contenedor
		Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);
		
		//3-Usar el bean
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		
		//4-Cerrar el contexto
		contexto.close();  
	}

}
