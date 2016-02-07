package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Tendido extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	
	private String nombretendido ;
	private String tiposerviciotendido ;
	private Double  costotendido;
	
	
	
	public String getNombretendido() {
		return nombretendido;
	}
	public void setNombretendido(String nombretendido) {
		this.nombretendido = nombretendido;
	}
	public String getTiposerviciotendido() {
		return tiposerviciotendido;
	}
	public void setTiposerviciotendido(String tiposerviciotendido) {
		this.tiposerviciotendido = tiposerviciotendido;
	}
	public Double getCostotendido() {
		return costotendido;
	}
	public void setCostotendido(Double costotendido) {
		this.costotendido = costotendido;
	}


}
