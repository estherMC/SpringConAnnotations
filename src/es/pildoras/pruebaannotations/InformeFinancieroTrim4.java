package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

//SPRING-11:
@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentaci�n de informe de cierre de a�o";
	}

}
