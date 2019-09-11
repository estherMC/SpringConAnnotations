package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

//SPRING-9: Creamos clase para la inyecci�n de dependencia por constructor
@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentaci�n de informe financiero del trimestre-1";
	}

}
