package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Cajamedidor extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String nombrecajamedidor;
	private Double preciocajamedidor;
	
	
	public String getNombrecajamedidor() {
		return nombrecajamedidor;
	}
	public void setNombrecajamedidor(String nombrecajamedidor) {
		this.nombrecajamedidor = nombrecajamedidor;
	}
	public Double getPreciocajamedidor() {
		return preciocajamedidor;
	}
	public void setPreciocajamedidor(Double preciocajamedidor) {
		this.preciocajamedidor = preciocajamedidor;
	}
	
	
	
	
	
}
