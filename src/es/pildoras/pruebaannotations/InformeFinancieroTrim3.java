package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

//SPRING-11:
@Component
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentaci�n de informe favorable del trimestre 3";
	}

}
