package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

//SPRING-11:
@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentación de informe catastrófico del trimestre 2";
	}

}
