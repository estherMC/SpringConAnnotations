package es.pildoras.pruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//SPRING-8: Se puede poner el nombre que queramos (paso 2 -> pedir bean al contenedor)
@Component("ComercialExperimentado")
//SPRING-13: No podemos usar prototype con @PreDestroy/@PostConstruct
//SPRING-12: Indicamos prototype
//@Scope("prototype")
public class ComercialExperimentado implements Empleados {
	
	/*
	//SPRING-10: Comentamos el m�todo para hacer la prueba con setter 
	//SPRING-9: Spring busca en todo el proyecto si tiene una clase que implemente la interface CreacionInformeFinanciero
//	@Autowired //SPRING-10: En este caso, como s�lo tenemos un constructor d�nde se va a producir la inyecci�n, no es necesario el Autowired.
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
	*/
	
	//SPRING-10: Prueba Autowired en campo de clase
	@Autowired
	//SPRING-11: Se debe indicar a qu� bean hace referencia, si no da error Spring.
	@Qualifier("informeFinancieroTrim4")
	private CreacionInformeFinanciero nuevoInforme;

	//SPRING-10: Creamos m�todo setter y se prueba inyecci�n Dependencias con Autowired -> podemos llamar al m�todo de otra forma
//	@Autowired
//	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}

	@Override
	public String getTareas() {
		return "Vender, vender y vender m�s!";
	}

	@Override
	public String getInforme() {
		//SPRING-9: Sustituimos que genere este informe gen�rico por el informeFinanciero
//		return "Informe generado por el comercial experimentado";
		return nuevoInforme.getInformeFinanciero();
	}
	
	//SPRING-13: Ejecuci�n c�digo despu�s de creaci�n del bean
	@PostConstruct
	public void ejecutaDespuesCreacion () {
		System.out.println("Ejecutado tras creaci�n de bean");
	}
	
	//SPRING-13: Ejecuci�n c�digo despu�s de apagado contenedor Spring
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutando antes de la destrucci�n");
	}
}
