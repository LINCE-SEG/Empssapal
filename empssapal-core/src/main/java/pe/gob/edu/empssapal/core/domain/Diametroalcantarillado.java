package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Diametroalcantarillado extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String nombrediametro;
	public String getNombrediametro() {
		return nombrediametro;
	}
	public void setNombrediametro(String nombrediametro) {
		this.nombrediametro = nombrediametro;
	}
	public Double getCostodiametro() {
		return costodiametro;
	}
	public void setCostodiametro(Double costodiametro) {
		this.costodiametro = costodiametro;
	}
	public Tendido getTendido() {
		return tendido;
	}
	public void setTendido(Tendido tendido) {
		this.tendido = tendido;
	}
	public Cajaregistradora getCajaregistradora() {
		return cajaregistradora;
	}
	public void setCajaregistradora(Cajaregistradora cajaregistradora) {
		this.cajaregistradora = cajaregistradora;
	}
	private Double costodiametro;
	private Tendido tendido;
	private Cajaregistradora cajaregistradora;

}
