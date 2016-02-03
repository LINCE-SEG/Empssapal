package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Diametroagua extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String nombrediametro;
	private Double costodiametro;

	private Cajamedidor cajamedidor;
	private Tendido tendido;
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
	public Cajamedidor getCajamedidor() {
		return cajamedidor;
	}
	public void setCajamedidor(Cajamedidor cajamedidor) {
		this.cajamedidor = cajamedidor;
	}
	public Tendido getTendido() {
		return tendido;
	}
	public void setTendido(Tendido tendido) {
		this.tendido = tendido;
	}
	
	
	
	

}
