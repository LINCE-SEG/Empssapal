package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Relleno extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String 	tiposerviciorelleno;
	private Double costorelleno;
	
	
	public String getTiposerviciorelleno() {
		return tiposerviciorelleno;
	}
	public void setTiposerviciorelleno(String tiposerviciorelleno) {
		this.tiposerviciorelleno = tiposerviciorelleno;
	}
	public Double getCostorelleno() {
		return costorelleno;
	}
	public void setCostorelleno(Double costorelleno) {
		this.costorelleno = costorelleno;
	}

}
