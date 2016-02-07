package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Rotura extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	
	private String nombrerotura;
	private String 	tiposerviciorotura;
	private Double costorotura;
	
	
	public String getNombrerotura() {
		return nombrerotura;
	}
	public void setNombrerotura(String nombrerotura) {
		this.nombrerotura = nombrerotura;
	}
	public String getTiposerviciorotura() {
		return tiposerviciorotura;
	}
	public void setTiposerviciorotura(String tiposerviciorotura) {
		this.tiposerviciorotura = tiposerviciorotura;
	}
	public Double getCostorotura() {
		return costorotura;
	}
	public void setCostorotura(Double costorotura) {
		this.costorotura = costorotura;
	}


}
