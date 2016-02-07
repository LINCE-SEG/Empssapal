package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Pruebahidraulica extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String nombreservicioprueba;
	public String getNombreservicioprueba() {
		return nombreservicioprueba;
	}
	public void setNombreservicioprueba(String nombreservicioprueba) {
		this.nombreservicioprueba = nombreservicioprueba;
	}
	public Double getCostoprueba() {
		return costoprueba;
	}
	public void setCostoprueba(Double costoprueba) {
		this.costoprueba = costoprueba;
	}
	private Double costoprueba;
	


}
