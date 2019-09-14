package es.pildoras.pruebaannotations;

//SPRING-15: Creaci�n de clase DirectorFinanciero
public class DirectorFinanciero  implements Empleados {

	private CreacionInformeFinanciero informeFinanciero;
	
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

	
	

}
