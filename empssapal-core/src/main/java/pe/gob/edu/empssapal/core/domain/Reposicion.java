package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Reposicion extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String nombrereposicion;
	private String tiposervicioreposicion;
	private Double costoreposicion; 

	
	
	public String getNombrereposicion() {
		return nombrereposicion;
	}
	public void setNombrereposicion(String nombrereposicion) {
		this.nombrereposicion = nombrereposicion;
	}
	public String getTiposervicioreposicion() {
		return tiposervicioreposicion;
	}
	public void setTiposervicioreposicion(String tiposervicioreposicion) {
		this.tiposervicioreposicion = tiposervicioreposicion;
	}
	public Double getCostoreposicion() {
		return costoreposicion;
	}
	public void setCostoreposicion(Double costoreposicion) {
		this.costoreposicion = costoreposicion;
	}
	
	
}
