package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Cajaregistradora extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;


	
	private String nombrecajaregistradora;
	private Double preciocajaregistradora;
	
	public String getNombrecajaregistradora() {
		return nombrecajaregistradora;
	}
	public void setNombrecajaregistradora(String nombrecajaregistradora) {
		this.nombrecajaregistradora = nombrecajaregistradora;
	}
	public Double getPreciocajaregistradora() {
		return preciocajaregistradora;
	}
	public void setPreciocajaregistradora(Double preciocajaregistradora) {
		this.preciocajaregistradora = preciocajaregistradora;
	}
	
}
