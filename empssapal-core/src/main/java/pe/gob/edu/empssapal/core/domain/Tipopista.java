package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Tipopista extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String nombrepista;
	private String tiposerviciopista;
	private Double costopista;
	private Rotura rotura;
	private Reposicion reposicion;
	
	public String getNombrepista() {
		return nombrepista;
	}
	public void setNombrepista(String nombrepista) {
		this.nombrepista = nombrepista;
	}
	public String getTiposerviciopista() {
		return tiposerviciopista;
	}
	public void setTiposerviciopista(String tiposerviciopista) {
		this.tiposerviciopista = tiposerviciopista;
	}
	
	public Double getCostopista() {
		return costopista;
	}
	public void setCostopista(Double costopista) {
		this.costopista = costopista;
	}
	public Rotura getRotura() {
		return rotura;
	}
	public void setRotura(Rotura rotura) {
		this.rotura = rotura;
	}
	public Reposicion getReposicion() {
		return reposicion;
	}
	public void setReposicion(Reposicion reposicion) {
		this.reposicion = reposicion;
	}

	
	


}
