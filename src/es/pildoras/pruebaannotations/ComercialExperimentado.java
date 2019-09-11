package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//SPRING-8: Se puede poner el nombre que queramos (paso 2 -> pedir bean al contenedor)
@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados {
	
	/*
	//SPRING-10: Comentamos el m�todo para hacer la prueba con setter 
	//SPRING-9: Spring busca en todo el proyecto si tiene una clase que implemente la interface CreacionInformeFinanciero
//	@Autowired //SPRING-10: En este caso, como s�lo tenemos un constructor d�nde se va a producir la inyecci�n, no es necesario el Autowired.
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
	*/

	private CreacionInformeFinanciero nuevoInforme;
	
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

}
