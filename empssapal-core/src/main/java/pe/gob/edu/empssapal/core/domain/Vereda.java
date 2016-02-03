package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;


public class Vereda extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String nombrevere;
	public String getNombrevere() {
		return nombrevere;
	}
	public void setNombrevere(String nombrevere) {
		this.nombrevere = nombrevere;
	}
	public String getTiposerviciovere() {
		return tiposerviciovere;
	}
	public void setTiposerviciovere(String tiposerviciovere) {
		this.tiposerviciovere = tiposerviciovere;
	}

	private String tiposerviciovere;
	private Double costovere;
	public Double getCostovere() {
		return costovere;
	}
	public void setCostovere(Double costovere) {
		this.costovere = costovere;
	}
	
	
	
	
}
