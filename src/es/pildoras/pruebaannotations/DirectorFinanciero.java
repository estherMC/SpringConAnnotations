package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Value;

//SPRING-15: Creaci�n de clase DirectorFinanciero
public class DirectorFinanciero  implements Empleados {

	private CreacionInformeFinanciero informeFinanciero;
	
	//SPRING-16: Creamos los campos para la inyecci�n -> no tiene porque coincidir nombres con propiedades
	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}
	
	@Override
	public String getTareas() {
		return "Gesti�n y direcci�n de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	
}
