package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Camaapoyo extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String serviciocama	;
	private Double preciocama;
	
	
	public String getServiciocama() {
		return serviciocama;
	}
	public void setServiciocama(String serviciocama) {
		this.serviciocama = serviciocama;
	}
	public Double getPreciocama() {
		return preciocama;
	}
	public void setPreciocama(Double preciocama) {
		this.preciocama = preciocama;
	}

	
}
