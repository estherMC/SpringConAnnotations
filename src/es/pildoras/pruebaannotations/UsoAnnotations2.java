package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//SPRING-12: Creamos clase para ver patrones singleton/prototype con Annotations
public class UsoAnnotations2 {

	public static void main(String[] args) {

		//SPRING-14: Ya no aplica el XML de configuración, lo cambiamos por la clase de configuración
		//1-Leer del XML de configuración
//		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//2-Pedir bean al contenedor
		Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);
		Empleados Lucia = contexto.getBean("ComercialExperimentado", Empleados.class);
//		
		//3-Usar el bean
		if (Antonio == Lucia){
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		}else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		}
		
		//SPRING-15: Pedir bean al contenedor (uso de inyección mediante @Bean):
		Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());

		
		//4-Cerrar el contexto
		contexto.close();  
		
		
	}

}
